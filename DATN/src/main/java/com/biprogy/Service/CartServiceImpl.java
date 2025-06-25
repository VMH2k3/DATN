package com.biprogy.Service;

import com.biprogy.Model.Cart;
import com.biprogy.Repository.CartRepository;
import com.biprogy.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public List<Cart> getAllCarts() {
        return this.cartRepository.findAll();
    }

    @Override
    public Cart getCartById(int id) {
        return this.cartRepository.findById(id).get();
    }

    @Override
    public Set<Cart> getCartByUserId(Long Userid) {
        return this.userRepository.findById(Userid).get().getCarts();
    }

    @Override
    public Boolean create(Cart cart) {
        try {
            this.cartRepository.save(cart);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


}
