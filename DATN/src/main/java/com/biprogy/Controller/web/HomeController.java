package com.biprogy.Controller.web;

import com.biprogy.Service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfWeb")
public class HomeController {

    private final LoginService loginService = new LoginService();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView indexPage() {
        return new ModelAndView("web/index");
    }

    @RequestMapping(value = "/san-pham", method = RequestMethod.GET)
    public ModelAndView productPage() {
        return new ModelAndView("web/product");
    }

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public ModelAndView cartPage() {
        return new ModelAndView("web/cart");
    }

    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    public ModelAndView shopPage() {
        return new ModelAndView("web/shop");
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage(@RequestParam(value = "message", required = false) String message) {
        ModelAndView mav = new ModelAndView("web/login");
        mav.addObject("model", message);
        return mav;
    }

}

