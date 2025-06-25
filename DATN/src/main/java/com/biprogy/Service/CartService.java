package com.biprogy.Service;
import com.biprogy.Model.Cart;
import java.util.List;
import java.util.Set;

public interface CartService {
    List<Cart> getAllCarts();
    Cart getCartById(int id);
    Set<Cart> getCartByUserId(Long Userid);
    Boolean create(Cart cart);
}
