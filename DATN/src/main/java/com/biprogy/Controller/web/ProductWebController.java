package com.biprogy.Controller.web;

import com.biprogy.Model.*;
import com.biprogy.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Controller
public class ProductWebController {

    private Integer getLoggedInUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof CustomUserDetails userDetails) {
            return Math.toIntExact(userDetails.getUserId());
        }
        return null;
    }

    @Autowired
    CategoryService categoryService;


    @Autowired
    CartService cartService;

    @Autowired
    CartItemService cartItemService;

    @Autowired
    ProductService productService;


    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public ModelAndView productPage(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1")Integer pageNo) {
        List<Category> listCate = this.categoryService.getAll();
        model.addAttribute("listCate", listCate);
        Long userId = Long.valueOf(getLoggedInUserId());
        Set<Cart> carts=this.cartService.getCartByUserId(userId);
        Cart cart=new Cart();
        for (Cart i : carts) {
            if (i.getCartstatus()){
                cart=i;
                break;
            }
        }
        List<CartItem> cartItems = this.cartItemService.getCartItems(cart.getId());
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("cart", cart);

        Page<Product> products = this.productService.getAll(pageNo);
        if (keyword != null) {
            products = this.productService.searchProduct(keyword,pageNo);
            model.addAttribute("keyword",keyword);

        }
        model.addAttribute("totalPages",products.getTotalPages());
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("products", products);
        return new ModelAndView("web/product");
    }

    @PostMapping("/product")
    public String addCartItem(@RequestParam("productid") Integer productId) {
        Long userId = Long.valueOf(getLoggedInUserId());
        Set<Cart> carts=this.cartService.getCartByUserId(userId);
        Cart cart=new Cart();
        for (Cart i : carts) {
            if (i.getCartstatus()){
                cart=i;
                break;
            }
        }
        Product product = productService.findById(productId);

        if (product == null || cart == null) {
            System.err.println("Lỗi: Product hoặc Cart không tồn tại trong DB");
            return "redirect:/product";
        }

        List<CartItem> cartItems = cartItemService.getCartItems(cart.getId());
        for (CartItem item : cartItems) {
            if (Objects.equals(item.getProduct().getProductid(), productId)) {
                item.setQuanlity(item.getQuanlity() + 1);
                cartItemService.create(item);
                return "redirect:/cart";
            }
        }
        CartItem newItem = new CartItem(product, cart, 1);
        if (cartItemService.create(newItem)) {
            return "redirect:/cart";
        } else {
            return "redirect:/product";
        }
    }

    @GetMapping("/product/delete/{id}")
    public String deleteCartItem(@PathVariable Integer id) {
        Long userId = Long.valueOf(getLoggedInUserId());
        Set<Cart> carts=this.cartService.getCartByUserId(userId);
        Cart cart=new Cart();
        for (Cart i : carts) {
            if (i.getCartstatus()){
                cart=i;
                break;
            }
        }
        cart.setTotalprice(cart.getItems());
        this.cartService.create(cart);
        Product product = productService.findById(id);

        if (product == null || cart == null) {
            System.err.println("Lỗi: Product hoặc Cart không tồn tại");
            return "redirect:/cart";
        }

        List<CartItem> cartItems = cartItemService.getCartItems(cart.getId());
        for (CartItem item : cartItems) {
            if (Objects.equals(item.getProduct().getProductid(), id)) {
                if (item.getQuanlity() > 1) {
                    item.setQuanlity(item.getQuanlity() - 1);
                    item.setTotalprice(item.getPrice(), item.getQuanlity());
                    cartItemService.create(item);
                    return "redirect:/cart";
                } else {
                    cartItemService.delete(item.getId());
                    return "redirect:/cart";
                }
            }
        }

        return "redirect:/cart";
    }


}
