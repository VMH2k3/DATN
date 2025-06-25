package com.biprogy.Service;

import com.biprogy.Model.CartItem;

import java.util.List;

public interface CartItemService {
    List<CartItem> getCartItems(Integer cartId);
    CartItem FindById(Integer id);
    Boolean create(CartItem cartItem);
    Boolean delete(Integer id);
}
