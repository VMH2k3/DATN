package com.biprogy.Service;

import com.biprogy.Model.Product;
import com.biprogy.Model.Voucher;
import com.biprogy.Repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoucherServiceImpl implements VoucherService {

    @Autowired
    private VoucherRepository voucherRepository;

    @Override
    public List<Voucher> getVouchers() {
        return this.voucherRepository.findAll();
    }

    @Override
    public Page getAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo-1, 9);
        return this.voucherRepository.findAll(pageable);
    }

    @Override
    public List<Voucher> searchVouchers(String keyword) {
        return this.voucherRepository.searchVoucers(keyword);
    }

    @Override
    public Page<Voucher> searchVouchers(String keyword, Integer pageNo) {
        List<Voucher> list = this.searchVouchers(keyword);
        Pageable pageable = PageRequest.of(pageNo-1, 5);
        int start = (int) pageable.getOffset();
        int end = (int) ((pageable.getOffset()+ pageable.getPageSize()) > list.size() ? list.size() : pageable.getPageSize()+pageable.getOffset());
        list = list.subList(start, end);
        return new PageImpl<Voucher>(list, pageable, this.searchVouchers(keyword).size());
    }

    @Override
    public Boolean addVoucher(Voucher voucher) {
        try {
            this.voucherRepository.save(voucher);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Boolean deleteVoucher(Integer id) {
        try {
            this.voucherRepository.delete(this.findVoucherById(Long.valueOf(id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Voucher findVoucherById(Long id) {
        return  this.voucherRepository.findById(Math.toIntExact(id)).get();
    }
}
