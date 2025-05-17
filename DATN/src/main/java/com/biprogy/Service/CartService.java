package com.biprogy.Service;


import com.biprogy.Model.Cart;
import com.biprogy.Model.CartItem;

import java.util.List;

public interface CartService {
    List<Cart> getAllCarts();
    Cart getCartById(Long cartId);
    Cart addCart(Cart cart);
    Cart addCartItem(Long cartId, CartItem cartItem);
    Cart removeCartItem(Long cartId, Long cartItemId);
}
