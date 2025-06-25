package com.biprogy.Controller.admin;

import com.biprogy.Model.*;
import com.biprogy.Service.UserService;
import com.biprogy.Service.UserVoucherService;
import com.biprogy.Service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/admin")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping(value = "/user")
    public String user(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
        Page<User> users = this.userService.getAll(pageNo);
        if (keyword != null) {
            users = this.userService.searchUser(keyword, pageNo);
            model.addAttribute("keyword", keyword);
        }
        model.addAttribute("totalPages", users.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("users", users);
        return "admin/user/index";
    }

    @GetMapping(value = "/update-user/{id}")
    public String update(Model model, @PathVariable Long id) {
        User user = this.userService.findById(id);
        model.addAttribute("user", user);
        return "/admin/user/update";
    }

    @PostMapping(value = "/update-user")
    public String update(@ModelAttribute("user") User user) {
        if (this.userService.update(user)) {
            return "redirect:/admin/user";
        } else {
            return "redirect:/admin/user";
        }

    }


    @Autowired
    VoucherService voucherService;

    @GetMapping(value = "/voucher-user/{id}")
    public String voucherUser(Model model, @PathVariable Long id, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1")Integer pageNo) {
        Page<Voucher> listVoucher = this.voucherService.getAll(pageNo);
        if (keyword != null) {
            listVoucher = this.voucherService.searchVouchers(keyword,pageNo);
            model.addAttribute("keyword",keyword);

        }
        List<Voucher> voucherList = this.voucherService.getVouchers();
        model.addAttribute("voucherList", voucherList);
        model.addAttribute("totalPages",listVoucher.getTotalPages());
        model.addAttribute("currentPage",pageNo);
        User user = this.userService.findById(id);
        List<UserVoucher> userVouchers = user.getUserVouchers();
        model.addAttribute("userVouchers", userVouchers);
        model.addAttribute("user", user);
        return "admin/user/vouchers";
    }

    @Autowired
    UserVoucherService userVoucherService;

    @PostMapping(value = "/add-userVoucher")
    public String addVoucher(@ModelAttribute("voucherId") Long  id, @ModelAttribute("userId") Long  userid) {
        Voucher voucher = this.voucherService.findVoucherById(id);
        UserVoucher userVoucher = new UserVoucher();
        userVoucher.setVoucher(voucher);
        User user = this.userService.findById(userid);
        userVoucher.setUser(user);
        if (this.userVoucherService.addUserVoucher(userVoucher)){
            return "redirect:/admin/user";
        }
        return "redirect:/admin/user";
    }

    @GetMapping(value = "delete-userVoucher/{id}")
    public String deleteVoucher(@PathVariable Long id) {
        UserVoucher userVoucher = this.userVoucherService.getUserVoucher(id);
        if (this.userVoucherService.deleteUserVoucher(userVoucher)){
            return "redirect:/admin/user";
        }
        return "redirect:/admin/user";

    }

}
