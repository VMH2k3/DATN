package com.biprogy.Service;

import com.biprogy.Model.Wishlist;

import java.util.List;

public interface WishlistService {
    Wishlist getWishlistByUserId(Long id);
    Boolean create(Wishlist wishlist);
}
