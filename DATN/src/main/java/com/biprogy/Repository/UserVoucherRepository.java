package com.biprogy.Repository;

import com.biprogy.Model.UserVoucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserVoucherRepository extends JpaRepository<UserVoucher,Integer> {
}
