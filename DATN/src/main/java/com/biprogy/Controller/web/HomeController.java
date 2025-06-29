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

    @Autowired
    OrderService orderService;


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
    public ModelAndView index2Page(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1")Integer pageNo) {
        dbchung(model);
        Page<Product> products = this.productService.getAll(pageNo);
        if (keyword != null) {
            products = this.productService.searchProduct(keyword,pageNo);
            model.addAttribute("keyword",keyword);

        }
        model.addAttribute("totalPages",products.getTotalPages());
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("products", products);
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
    String account(Model model) {
        Long userId = Long.valueOf(getLoggedInUserId());
        dbchung(model);
        User user = this.userService.findById(userId);
        Set<Order> orders = this.orderService.getOrdersByUserID(userId);
        model.addAttribute("user", user);
        model.addAttribute("orders", orders);
        return "web/account";
    }



    @Autowired
    WishlistService wishlistService;

    @RequestMapping(value = "/list_wish")
    String listWish(Model model) {
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
        model.addAttribute("cart", cart);
        Wishlist wishlist = this.wishlistService.getWishlistByUserId(userId);
        model.addAttribute("wishlist", wishlist);
        return "web/list_wish";
    }


    @Autowired
    WishlistProductService wishlistProductService;

    @RequestMapping(value = "/list_wish/{id}")
    String listWish(@PathVariable Integer id, Model model) {
        Long userId = Long.valueOf(getLoggedInUserId());
        Wishlist wishlist = this.wishlistService.getWishlistByUserId(userId);
        if (wishlist == null){
            wishlist = new Wishlist();
            wishlist.setUser(this.userService.findById(userId));
            this.wishlistService.create(wishlist);
        }
        Product product = this.productService.findById(id);
        WishlistProduct wlp = new WishlistProduct(product, wishlist);
        model.addAttribute("wishlist", wishlist);
        boolean wlstatus = false;
        for (WishlistProduct wl : wishlist.getWishlistProducts()){
                if (Objects.equals(wl.getProduct().getProductid(), id)){
                    wlstatus = true;
                    break;
                }
        }
        if (!wlstatus){
            this.wishlistProductService.create(wlp);
        }
        return "redirect:/list_wish";
    }

    @RequestMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable Integer id) {
        Long userId = Long.valueOf(getLoggedInUserId());
        dbchung(model);
        Product product = this.productService.findById(id);
        List<Rating> ratings = product.getRatings();
        Double ratingsCount = 0.0;
        Double ratingsTotal = 0.0;
        for (Rating rating : ratings) {
            ratingsTotal+=rating.getRatingValue();
            ratingsCount++;
        }
        if (ratingsCount > 0){
            product.setRating(ratingsTotal/ratingsCount);
        }
        productService.create(product);
        model.addAttribute("product", product);
        model.addAttribute("ratings", ratings);
        return "web/detail";
    }
}

