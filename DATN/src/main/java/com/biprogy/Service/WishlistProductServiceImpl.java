package com.biprogy.Service;

import com.biprogy.Model.WishlistProduct;
import com.biprogy.Repository.WishlistProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistProductServiceImpl implements WishlistProductService {

    @Autowired
    private WishlistProductRepository WishlistProductRepository;

    @Override
    public List<WishlistProduct> getWishlistProduct() {
        return this.WishlistProductRepository.findAll();
    }

    @Override
    public Boolean create(WishlistProduct wishlistProduct) {
        try {
            this.WishlistProductRepository.save(wishlistProduct);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean delete(WishlistProduct wishlistProduct) {
        return null;
    }

    @Override
    public WishlistProduct getWishlistProductById(Integer id) {
        return null;
    }
}
