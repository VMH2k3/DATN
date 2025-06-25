package com.biprogy.Controller.web;


import com.biprogy.Model.*;
import com.biprogy.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Controller
public class RatingController {

    @Autowired
    private RatingService ratingService;
    @Autowired
    private CartService cartService;
    @Autowired
    private CartItemService cartItemService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;


    private Integer getLoggedInUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof CustomUserDetails userDetails) {
            return Math.toIntExact(userDetails.getUserId());
        }
        return null;
    }
    @RequestMapping(value = "/list_rating")
    String listRating(Model model) {
        Long userId = Long.valueOf(getLoggedInUserId());
        Set<Cart> carts=this.cartService.getCartByUserId(userId);
        Cart cart = new Cart();
        for (Cart i : carts) {
            if (i.getCartstatus()){
                cart = i;
                break;
            }
        }
        cart.setTotalprice(cart.getItems());
        this.cartService.create(cart);
        List<CartItem> cartItems = this.cartItemService.getCartItems(cart.getId());
        Set<Order> orders = this.orderService.getOrdersByUserID(userId);
        List<Rating> ratings = this.ratingService.getratingsByUserId(userId);
        model.addAttribute("ratings", ratings);
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("cart", cart);
        model.addAttribute("orders", orders);
        return "web/list_rating/index";
    }

    @RequestMapping(value = "list_rating/{id}")
    String listRating(@PathVariable Integer id, Model model) {
        Long userId = Long.valueOf(getLoggedInUserId());
        Set<Cart> carts=this.cartService.getCartByUserId(userId);
        Cart cart = new Cart();
        for (Cart i : carts) {
            if (i.getCartstatus()){
                cart = i;
                break;
            }
        }
        cart.setTotalprice(cart.getItems());
        this.cartService.create(cart);
        List<CartItem> cartItems = this.cartItemService.getCartItems(cart.getId());
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("cart", cart);
        User user = this.userService.findById(userId);
        Product product=this.productService.findById(id);
        Date now = new Date();
        Rating rating = new Rating(user,product,now);
        model.addAttribute("product", product);
        model.addAttribute("rating", rating);
        return "web/list_rating/rating";
    }


    @PostMapping(value = "/list_rating/add")
    String addRating(@ModelAttribute("rating") Rating rating) {
        Date now = new Date();
        rating.setRatingDate(now);
        if (this.ratingService.addRating(rating)) {
            return "redirect:/list_rating";
        }
        return "redirect:/list_rating";
    }
}
