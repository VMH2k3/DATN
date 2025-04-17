package com.biprogy.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HiController {
    @RequestMapping(value = {"/hi"}, method = RequestMethod.GET)
    public ModelAndView hi(){
        return new ModelAndView("hi");
    }
}
