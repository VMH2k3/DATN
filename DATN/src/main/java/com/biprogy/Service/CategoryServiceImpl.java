package com.biprogy.Service;

import com.biprogy.Model.Category;
import com.biprogy.Repository.CategoryRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepostory categoryRepostory;
    @Override
    public List<Category> getAll() {
        List<Category> categories = this.categoryRepostory.findCate();
        for (Category category : categories) {
            category.setProductCount(category.getProducts().size());
        }
        return categories;
    }

    @Override
    public Boolean create(Category category) {
        try{
            this.categoryRepostory.save(category);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false ;
    }

    @Override
    public Category findById(Integer id) {
        return this.categoryRepostory.findById(id).get();
    }

    @Override
    public Boolean update(Category category) {
        try{
            this.categoryRepostory.save(category);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false ;
    }

    @Override
    public Boolean delete(Integer id) {
        try{
            this.categoryRepostory.delete(findById(id));
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false ;
    }

    @Override
    public List<Category> searchCategory(String keyword) {
        return this.categoryRepostory.searchCategory(keyword);
    }

    @Override
    public Page<Category> searchCategory(String keyword, Integer pageNo) {
        List<Category> list = this.searchCategory(keyword);
        Pageable pageable = PageRequest.of(pageNo-1, 5);
        int start = (int) pageable.getOffset();
        int end = (int) ((pageable.getOffset()+ pageable.getPageSize()) > list.size() ? list.size() : pageable.getPageSize()+pageable.getOffset());
        list = list.subList(start, end);
        return new PageImpl<Category>(list, pageable, this.searchCategory(keyword).size());
    }

    @Override
    public Page getAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo-1, 5);
        return this.categoryRepostory.findAll(pageable);
    }
}
