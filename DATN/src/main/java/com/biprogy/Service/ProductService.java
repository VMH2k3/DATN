package com.biprogy.Service;

import com.biprogy.Model.Category;
import com.biprogy.Model.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Boolean create(Product product);
    Product findById(Integer id);
    Boolean update(Product product);
    Boolean delete(Integer id);
    List<Product> searchProduct(String keyword);
    Page<Product> searchProduct(String keyword, Integer pageNo);
    Page<Product> filterProduct(List<Product> list, Integer pageNo);
    Page getAll(Integer pageNo);
}
