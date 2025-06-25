package com.biprogy.Repository;

import com.biprogy.Model.Product;
import com.biprogy.Model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VoucherRepository extends JpaRepository<Voucher, Integer> {

    @Query("select v from Voucher v where v.code like %?1%")
    List<Voucher> searchVoucers(String keyWord);
}
