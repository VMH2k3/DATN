package com.biprogy.Repository;


import com.biprogy.Model.WishlistProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistProductRepository extends JpaRepository<WishlistProduct,Integer> {
}
