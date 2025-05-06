package com.biprogy.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {


    @RequestMapping(value = "/admin/dashboard", method = RequestMethod.GET)
    public ModelAndView homePage() {
        return new ModelAndView("admin/dashboard");
    }

    @RequestMapping(value = "/admin/tables", method = RequestMethod.GET)
    public ModelAndView tablesPage() {
        return new ModelAndView("admin/tables");
    }

    @RequestMapping(value = "/admin/jqgrid", method = RequestMethod.GET)
    public ModelAndView jgridPage() {
        return new ModelAndView("admin/jqgrid");
    }

    @RequestMapping(value = "/dummy", method = RequestMethod.GET)
    public ModelAndView dummyPage() {
        return new ModelAndView("admin/dummy");
    }
    }




