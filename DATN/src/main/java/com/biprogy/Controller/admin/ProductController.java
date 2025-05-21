package com.biprogy.Controller.admin;
import com.biprogy.Model.Category;
import com.biprogy.Model.Product;
import com.biprogy.Service.CategoryService;
import com.biprogy.Service.ProductService;
import com.biprogy.Service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class ProductController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @Autowired
    private StorageService storageService;


    @GetMapping("/product")
    public String index(Model model, @Param("keyword") String keyword,@RequestParam(name = "pageNo",defaultValue = "1")Integer pageNo){
        Page<Product> listProduct = this.productService.getAll(pageNo);
        if (keyword != null) {
            listProduct = this.productService.searchProduct(keyword,pageNo);
            model.addAttribute("keyword",keyword);

        }
        model.addAttribute("totalPages",listProduct.getTotalPages());
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("listProduct", listProduct);
        return "admin/product/index";
    }

    @RequestMapping("/add-product")
    public String add(Model model){

        Product product = new Product();
        model.addAttribute("product", product);
        List<Category> listCate = this.categoryService.getAll();
        model.addAttribute("listCate", listCate);

        return "admin/product/add";
    }

    @PostMapping(value = "/add-product")
    public String save(@ModelAttribute("product") Product product, @RequestParam("fileImage") MultipartFile file){
        this.storageService.store(file);
        String fileName = file.getOriginalFilename();
        product.setImage(fileName);
        if (this.productService.create(product)){
            return "redirect:/admin/product";
        }
        return  "admin/product/add";
    }

    @GetMapping(value = "/update-product/{id}")
    public String update(Model model, @PathVariable Integer id){
        Product product = this.productService.findById(id);
        model.addAttribute("product", product);
        List<Category> listCate = this.categoryService.getAll();
        model.addAttribute("listCate", listCate);
        return "/admin/product/update";
    }
    @PostMapping(value = "/update-product")
    public String update(@ModelAttribute("product") Product product,@RequestParam("fileImage") MultipartFile file){
        this.storageService.store(file);
        String fileName = file.getOriginalFilename();
        product.setImage(fileName);
        if(this.productService.update(product)){
            return "redirect:/admin/product";
        }else{
            return "/admin/product/update";}
    }

    @GetMapping("/delete-product/{id}")
    public String delete(@PathVariable Integer id) {
        if (this.productService.delete(id)) {
            return "redirect:/admin/product";
        } else {
            return "redirect:/admin/product";
        }
    }
}
