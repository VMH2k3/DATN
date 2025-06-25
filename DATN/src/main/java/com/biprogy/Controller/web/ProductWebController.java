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

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Autowired
    UserService userService;


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
        List<Product> list = this.productService.getAll();
        List<Product> filteredList = list.stream()
                .filter(i -> i.getCategory().getCategorystatus())  // Giữ lại sản phẩm có category status là true
                .collect(Collectors.toList());

        Page<Product> products = this.productService.filterProduct(filteredList,pageNo);
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
        Cart cart = null;
        for (Cart i : carts) {
            if (i.getCartstatus()){
                cart=i;
                break;
            }
        }
        if (cart==null){
            cart = new Cart();
            cart.setUser(this.userService.findById(userId));
            cart.setCartstatus(true);
            this.cartService.create(cart);
        }
        Product product = productService.findById(productId);


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
        Cart cart = null;
        for (Cart i : carts) {
            if (i.getCartstatus()){
                cart=i;
                break;
            }
        }
        if (cart==null){
            cart = new Cart();
            cart.setUser(this.userService.findById(userId));
            cart.setCartstatus(true);
            this.cartService.create(cart);
        }
        List<CartItem> cartItems = this.cartItemService.getCartItems(cart.getId());
        for (CartItem item : cartItems) {
            if (Objects.equals(item.getProduct().getProductid(), id)) {
                if(cartItemService.delete(item.getId())){
                    cart.setTotalprice(cart.getItems());
                    this.cartService.create(cart);
                    return "redirect:/cart";
                }
            }
        }

        return "redirect:/cart";
    }


}
