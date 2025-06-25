package com.biprogy.Service;

import com.biprogy.Model.UserVoucher;

import java.util.List;

public interface UserVoucherService {
    List<UserVoucher> getUserVouchers();
    Boolean addUserVoucher(UserVoucher userVoucher);
    Boolean deleteUserVoucher(UserVoucher userVoucher);
    UserVoucher getUserVoucher(Long id);
}
