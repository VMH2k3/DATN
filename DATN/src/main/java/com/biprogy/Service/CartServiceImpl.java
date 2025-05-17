package com.biprogy.Service;

import com.biprogy.Model.Cart;
import com.biprogy.Model.CartItem;
import com.biprogy.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Cart> getAllCarts() {
        return this.cartRepository.findAll();
    }

    @Override
    public Cart getCartById(Long cartId) {
        return null;
    }

    @Override
    public Cart addCart(Cart cart) {
        return null;
    }

    @Override
    public Cart addCartItem(Long cartId, CartItem cartItem) {
        return null;
    }

    @Override
    public Cart removeCartItem(Long cartId, Long cartItemId) {
        return null;
    }
}
