package com.biprogy.Controller.admin;

import com.biprogy.Model.Category;
import com.biprogy.Model.Product;
import com.biprogy.Model.Voucher;
import com.biprogy.Service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class VoucherController {

    @Autowired
    VoucherService voucherService;

    @GetMapping(value = "/voucher")
    public String voucher(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1")Integer pageNo) {
        Page<Voucher> listVoucher = this.voucherService.getAll(pageNo);
        if (keyword != null) {
            listVoucher = this.voucherService.searchVouchers(keyword,pageNo);
            model.addAttribute("keyword",keyword);

        }
        model.addAttribute("totalPages",listVoucher.getTotalPages());
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("listVoucher", listVoucher);
        return "admin/voucher/index";
    }

    @GetMapping(value = "/add-voucher")
    public String addVoucher(Model model) {
        Voucher voucher = new Voucher();
        model.addAttribute("voucher", voucher);
        return "admin/voucher/add";
    }

    @PostMapping(value = "/add-voucher")
    public String addVoucher(@ModelAttribute("voucher") Voucher voucher) {
        if (voucherService.addVoucher(voucher)) {
            return "redirect:/admin/voucher";
        }
        return "admin/voucher/add";
    }

    @GetMapping(value = "/update-voucher/{id}")
    public String update(Model model, @PathVariable Integer id){
        Voucher  voucher = this.voucherService.findVoucherById(Long.valueOf(id));
        model.addAttribute("voucher", voucher);
        return "/admin/voucher/update";
    }
    @PostMapping(value = "/update-voucher")
    public String update(@ModelAttribute("voucher") Voucher voucher){
        if(this.voucherService.addVoucher(voucher)){
            return "redirect:/admin/voucher";
        }else{
            return "/admin/voucher/update";}
    }

    @GetMapping("/delete-voucher/{id}")
    public String delete(@PathVariable Integer id) {
        if (this.voucherService.deleteVoucher(id)) {
            return "redirect:/admin/voucher";
        } else {
            return "redirect:/admin/voucher";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
