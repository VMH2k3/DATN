package com.biprogy.Repository;

import com.biprogy.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepostory extends JpaRepository<Category, Integer>
{
    @Query("select c from Category c where c.categoryname like %?1%")
    List<Category> searchCategory(String keyWord);
}
