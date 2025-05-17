package com.biprogy.Controller.admin;

import com.biprogy.Model.Category;
import com.biprogy.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping(value = "/category")
    public String categoryPage(Model model, @Param("keyword")  String keyword,@RequestParam(name = "pageNo",defaultValue = "1")Integer pageNo) {
        Page<Category> list = this.categoryService.getAll(pageNo);

        if (keyword != null) {
            list = this.categoryService.searchCategory(keyword,pageNo);
            model.addAttribute("keyword", keyword);
        }
        model.addAttribute("totalPages", list.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("list", list);
        return "admin/category/index";
    }

    @GetMapping(value = "/add-category")
    public String add(Model model){
        Category category = new Category();
        category.setCategorystatus(true);
        model.addAttribute("category", category);
        return "admin/category/add";
    }

    @PostMapping(value = "/add-category")
    public String save(@ModelAttribute("category") Category category){
        if(this.categoryService.create(category)){
            return "redirect:/admin/category";
        }else{
            return "/admin/category/add";}
    }

    @GetMapping(value = "/update-category/{id}")
    public String update(Model model, @PathVariable Integer id){
        Category category = this.categoryService.findById(id);
        model.addAttribute("category", category);
        return "/admin/category/update";
    }
    @PostMapping(value = "/update-category")
    public String update(@ModelAttribute("category") Category category){
        if(this.categoryService.create(category)){
            return "redirect:/admin/category";
        }else{
            return "/admin/category/update";}
    }

    @GetMapping("/delete-category/{id}")
    public String delete(@PathVariable Integer id){
        if(this.categoryService.delete(id)){
            return "redirect:/admin/category";
        }else{
            return "redirect:/admin/category";
        }

    }

}
