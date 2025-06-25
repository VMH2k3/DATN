package com.biprogy.Repository;

import com.biprogy.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select p from Product p where p.productname like %?1%")
    List<Product> searchProduct(String keyWord);
}
