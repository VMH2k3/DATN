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
        List<CartItem> cartItems = new ArrayList<>();
        for (CartItem cartItem : Items){
            cartItem.setTotalprice(cartItem.getPrice(),cartItem.getQuanlity());
            if (cartItem.getCart().getId() == cartId){
                cartItems.add(cartItem);
            }
        }
        return cartItems;
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
    public CartItem FindById(Integer cartItemId) {
        return this.cartItemRepository.findById(Long.valueOf(cartItemId)).get();
    }
    @Override
    public Boolean delete(Integer id) {
        try {
            this.cartItemRepository.delete(FindById(id));
            return true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

