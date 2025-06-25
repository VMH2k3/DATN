package com.biprogy.Service;

import com.biprogy.Model.UserVoucher;
import com.biprogy.Repository.UserVoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserVoucherServiceImpl implements UserVoucherService {

    @Autowired
    private UserVoucherRepository userVoucherRepository;

    @Override
    public List<UserVoucher> getUserVouchers() {
        return this.userVoucherRepository.findAll();
    }

    @Override
    public Boolean addUserVoucher(UserVoucher userVoucher) {
        try {
            this.userVoucherRepository.save(userVoucher);
            return true;
        }catch(Exception e) {
            return false;
        }
    }

    @Override
    public Boolean deleteUserVoucher(UserVoucher userVoucher) {
        try {
            this.userVoucherRepository.delete(userVoucher);
            return true;
        }catch(Exception e) {
            return false;
        }
    }

    @Override
    public UserVoucher getUserVoucher(Long id) {
        return this.userVoucherRepository.findById(Math.toIntExact(id)).get();
    }
}
