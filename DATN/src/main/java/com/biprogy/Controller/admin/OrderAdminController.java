package com.biprogy.Controller.admin;


import com.biprogy.Model.Order;
import com.biprogy.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping(value = "/admin")
public class OrderAdminController {
    @Autowired
    OrderService orderService;

    @GetMapping(value = "/order")
    public String order(Model model, @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
        Page<Order> orders = this.orderService.getAll(pageNo);
        model.addAttribute("totalPages", orders.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("orders", orders);
        return "admin/order/index";
    }

    @GetMapping(value = "/update-order/{id}")
    public String update(Model model, @PathVariable Integer id) {
        Order order = this.orderService.getOrder(id);
        model.addAttribute("order", order);
        return "/admin/order/update";
    }

    @PostMapping(value = "/update-order")
    public String update(@ModelAttribute("order") Order order) {
        if (this.orderService.update(order)) {
            return "redirect:/admin/order";
        } else {
            return "redirect:/admin/order";
        }

    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

}
