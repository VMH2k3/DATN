package com.biprogy.Service;

import com.biprogy.Repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biprogy.Model.CartItem;

import java.util.ArrayList;
import java.util.List;
@Service

public class CartItemServiceImpl implements CartItemService {

    @Autowired
    CartItemRepository cartItemRepository;

    @Override
    public List<CartItem> getCartItems(Integer cartId) {
        List<CartItem> Items = this.cartItemRepository.findAll();
        List<CartItem> cartItems = new ArrayList<CartItem>();
        for (CartItem cartItem : Items){
            cartItem.setTotalprice(cartItem.getPrice(),cartItem.getQuanlity());
            if (cartItem.getCart().getId() == cartId){
                cartItems.add(cartItem);
            }
        }
        return cartItems;
    }

    @Override
    public CartItem getCartItemById(Long id) {
        return this.cartItemRepository.findById(Math.toIntExact(id)).get();
    }

    @Override
    public Boolean create(CartItem cartItem) {
        try {
            this.cartItemRepository.save(cartItem);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean delete(Long id) {
        try{
            this.cartItemRepository.delete(getCartItemById(id));
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false ;
    }
}
