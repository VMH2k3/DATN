package com.biprogy.Service;

import com.biprogy.Model.Product;
import com.biprogy.Model.Voucher;
import org.springframework.data.domain.Page;

import java.util.List;

public interface VoucherService {
        List<Voucher> getVouchers();
        Page getAll(Integer pageNo);
        List<Voucher> searchVouchers(String keyword);
        Page<Voucher> searchVouchers(String keyword, Integer pageNo);
        Boolean addVoucher(Voucher voucher);
        Boolean deleteVoucher(Integer id);
        Voucher findVoucherById(Long id);
}
