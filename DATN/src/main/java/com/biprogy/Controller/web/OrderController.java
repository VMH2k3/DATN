package com.biprogy.Controller.web;

import com.biprogy.Model.*;
import com.biprogy.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Controller
public class OrderController {

    private Integer getLoggedInUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof CustomUserDetails userDetails) {
            return Math.toIntExact(userDetails.getUserId());
        }
        return null;
    }
    @Autowired
    UserService userService;
    @Autowired
    CartService cartService;
    @Autowired
    CartItemService cartItemService;
    @Autowired
    OrderService orderService;

    @RequestMapping(value="/checkout")
    String checkout(@ModelAttribute("user") User user, Model model) {;
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
        Set<Order> order = this.orderService.getOrdersByUserID(userId);
        model.addAttribute("order", order);
        return "web/checkout";
    }


    @RequestMapping(value="checkout/{id}")
    String addCheckout(@ModelAttribute("user") User user,Model model,@PathVariable Integer id) {
        if (this.orderService.addOrder(id)){
            return "redirect:/checkout";
        }
        return  "redirect:/cart";
    }
}
