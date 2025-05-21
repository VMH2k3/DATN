package com.biprogy.Service;

import com.biprogy.Model.CartItem;

import java.util.List;

public interface CartItemService {
    List<CartItem> getCartItems(Integer cartId);
    CartItem getCartItemById(Long id);
    Boolean create(CartItem cartItem);
    Boolean delete(Long id);
}
