package com.biprogy.Service;


import com.biprogy.Model.Cart;
import com.biprogy.Model.CartItem;
import java.util.List;
import java.util.Set;

public interface CartService {
    List<Cart> getAllCarts();

    Set<Cart> getCartByUserId(Long Userid);

    Boolean create(Cart cart);
}
