package com.biprogy.Controller.admin;
import com.biprogy.Model.Order;
import com.biprogy.Model.Product;
import com.biprogy.Model.User;
import com.biprogy.Service.OrderService;
import com.biprogy.Service.ProductService;
import com.biprogy.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {

    @Autowired
    OrderService orderService;
    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView homePage(Model model,@RequestParam(value = "weeks", required = false, defaultValue = "12") int weeks) {
        List<Order> orders = this.orderService.getAllOrder();
        Integer oderCount = orders.size();
        model.addAttribute("oderCount", oderCount);
        List<User> users = this.userService.getUsers();
        Integer userCount = users.size();
        model.addAttribute("userCount", userCount);
        List<Product> products = this.productService.getAll();
        Integer productCount = products.size();
        model.addAttribute("productCount", productCount);
        int orderStatus1 = 0;
        int orderStatus2 = 0;
        Double doanhthu = 0.0;
        for (Order order : orders) {
            if (Objects.equals(order.getOderstatus(), "SUCCESS")){
                doanhthu += order.getOrderprice();
                orderStatus1 ++;
            }else {
                orderStatus2 ++;
            }
        }
        model.addAttribute("doanhthu", doanhthu);
        model.addAttribute("orderStatus1", orderStatus1);
        model.addAttribute("orderStatus2", orderStatus2);

        LocalDate end = LocalDate.now();
        LocalDate start = end.minusWeeks(weeks-1).with(java.time.DayOfWeek.MONDAY);
        Date startDate = Date.from(start.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date endDate = Date.from(end.atTime(23,59,59).atZone(ZoneId.systemDefault()).toInstant());
        List<Object[]> revenueList = orderService.getWeeklyRevenue(startDate, endDate);

        // Tính ngày bắt đầu và kết thúc của từng tuần
        List<String> weekRanges = new ArrayList<>();
        WeekFields weekFields = WeekFields.ISO;
        for (Object[] row : revenueList) {
            int year = ((Number)row[0]).intValue();
            int week = ((Number)row[1]).intValue();
            // Lấy ngày đầu tuần từ năm và số tuần
            LocalDate weekStart = LocalDate.of(year, 1, 4)
                    .with(weekFields.weekOfYear(), week)
                    .with(java.time.DayOfWeek.MONDAY);
            LocalDate weekEnd = weekStart.plusDays(6);
            weekRanges.add(weekStart.toString() + " - " + weekEnd.toString());
        }
        model.addAttribute("revenueList", revenueList);
        model.addAttribute("weekRanges", weekRanges);
        model.addAttribute("weeks", weeks);
        return new ModelAndView("admin/dashboard");
    }
    }




