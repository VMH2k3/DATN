package com.biprogy.Controller.admin;

import com.biprogy.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;

@Controller
public class RevenueController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/admin/revenue")
    public String getWeeklyRevenue(
            @RequestParam(value = "weeks", required = false, defaultValue = "12") int weeks,
            Model model) {
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
        return "admin/revenue";
    }
}
