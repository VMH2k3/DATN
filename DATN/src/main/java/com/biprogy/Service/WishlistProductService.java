package com.biprogy.Service;

import com.biprogy.Model.WishlistProduct;

import java.util.List;

public interface WishlistProductService {
    List<WishlistProduct> getWishlistProduct();
    Boolean create(WishlistProduct wishlistProduct);
    Boolean delete(WishlistProduct wishlistProduct);
    WishlistProduct getWishlistProductById(Integer id);
}
