package com.biprogy.Service;

import com.biprogy.Model.User;
import com.biprogy.Model.Wishlist;
import com.biprogy.Repository.UserRepository;
import com.biprogy.Repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WhislistServiceImpl implements WishlistService{

    @Autowired
    private WishlistRepository wishlistRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Wishlist getWishlistByUserId(Long id) {
        User user = this.userRepository.findById(id).get();
        Wishlist wishlist = user.getWishlist();
        return wishlist;
    }

    @Override
    public Boolean create(Wishlist wishlist) {
        try {
            this.wishlistRepository.save(wishlist);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
