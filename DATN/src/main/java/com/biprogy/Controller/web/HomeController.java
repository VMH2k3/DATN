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
import java.util.Set;

@Controller(value = "homeControllerOfWeb")
public class HomeController {

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


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView indexPage(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1")Integer pageNo) {
        List<Category> listCate = this.categoryService.getAll();
        model.addAttribute("listCate", listCate);
        Page<Product> products = this.productService.getAll(pageNo);
        if (keyword != null) {
            products = this.productService.searchProduct(keyword,pageNo);
            model.addAttribute("keyword",keyword);

        }
        model.addAttribute("totalPages",products.getTotalPages());
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("products", products);
        return new ModelAndView("web/index");
    }



    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public ModelAndView cartPage(Model model) {
        dbchung(model);
        return new ModelAndView("web/cart");
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView indexPage(Model model) {
        dbchung(model);
        return new ModelAndView("web/index2");
    }

    private void dbchung(Model model) {
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
        cart.setTotalprice(cart.getItems());
        this.cartService.create(cart);
        List<CartItem> cartItems = this.cartItemService.getCartItems(cart.getId());
        model.addAttribute("cartItems", cartItems);
        model.addAttribute("cart", cart);
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/register")
    public String registerPage(Model model) {
        User user = new User();
        user.setEnable(true);
        model.addAttribute("user", user);
        return "web/register";
    }

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Autowired
    private UserRoleService userRoleService;

    @PostMapping(value = "/register")
    String save(@ModelAttribute("user") User user) {
        user.setEnable(true);
        if (this.userService.create(user)) {
            UserRole userRole = new UserRole(user.getId(), this.roleService.getRole(2), user);
            if (this.userRoleService.addUserRole(userRole)) {
                return "redirect:/login";
            }
        }
            return "redirect:/register";
    }


    @RequestMapping(value = "/my-account")
    String account(@ModelAttribute("user") User user,Model model) {
        dbchung(model);
        return "web/account";
    }


}

