package com.biprogy.Controller.web;

import com.biprogy.Model.*;
import com.biprogy.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    String checkout(Model model) {
        Long userId = Long.valueOf(getLoggedInUserId());
        User user = this.userService.findById(userId);
        List<UserVoucher> userVouchers = user.getUserVouchers();
        model.addAttribute("userVouchers", userVouchers);
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
        model.addAttribute("user", user);
        model.addAttribute("cart", cart);
        return "web/checkout";
    }

    @PostMapping(value = "/info")
    String checkout(@ModelAttribute("user") User user) {
            Long userId = Long.valueOf(getLoggedInUserId());
            User user2=this.userService.findById(userId);
            user2.setFullname(user.getFullname());
            user2.setEmail(user.getEmail());
            user2.setPhone(user.getPhone());
            user2.setAddress(user.getAddress());
            if (this.userService.update(user2)){
                return "redirect:/checkout";
            }
            return "redirect:/checkout";
    }


    @Autowired
    UserVoucherService userVoucherService;

    @Autowired
    ProductService productService;
    @PostMapping(value="/checkout")
    String addCheckout(@RequestParam("cartId") Long id,@RequestParam(required = false) Long userVoucherId ) {
        if (userVoucherId != null){
        UserVoucher userVoucher = this.userVoucherService.getUserVoucher(userVoucherId);
        this.userVoucherService.deleteUserVoucher(userVoucher);
                if (this.orderService.addOrder(Math.toIntExact(id),userVoucher.getVoucher().getId())){
                    Cart cart = this.cartService.getCartById(Math.toIntExact(id));
                    cart.setCartstatus(false);
                    List<CartItem> cartItems = this.cartItemService.getCartItems(cart.getId());
                    for (CartItem cartItem : cartItems) {
                        Product product = cartItem.getProduct();
                        if ((product.getQuanlity()-cartItem.getQuanlity()) > 0){
                        product.setQuanlity(product.getQuanlity()-cartItem.getQuanlity());
                        this.productService.create(product);
                        }else{
                            return "redirect:/checkout";
                        }
                    }
                    this.cartService.create(cart);
                    return "redirect:/list_order";
                }
            }else{
        if (this.orderService.addOrder(Math.toIntExact(id))){
            Cart cart = this.cartService.getCartById(Math.toIntExact(id));
            cart.setCartstatus(false);
            List<CartItem> cartItems = this.cartItemService.getCartItems(cart.getId());
            for (CartItem cartItem : cartItems) {
                Product product = cartItem.getProduct();
                if ((product.getQuanlity()-cartItem.getQuanlity()) > 0){
                    product.setQuanlity(product.getQuanlity()-cartItem.getQuanlity());
                    this.productService.create(product);
                }else{
                    return "redirect:/checkout";
                }
            }
            this.cartService.create(cart);
            return "redirect:/list_order";
        }}
        return  "redirect:/checkout";
    }

    @RequestMapping(value = "/list_order")
    String listOrder( Model model) {
        Long userId = Long.valueOf(getLoggedInUserId());
        User user = this.userService.findById(userId);
        Set<Order> orders = user.getOrders();
        model.addAttribute("orders", orders);
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
        model.addAttribute("cart", cart);
        return "web/list_order";
    }

    @RequestMapping(value = "/list_order/{id}")
    String updateOrder(@PathVariable Integer id) {
        Order order = this.orderService.getOrder(id);
        order.setOderstatus("SUCCESS");
        if (this.orderService.updateOrder(order)){
            return "redirect:/list_order";
        }
        return  "redirect:/list_order";
    }

}
