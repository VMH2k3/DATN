package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="uservouchers")
public class UserVoucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "voucherid", referencedColumnName = "id")
    private Voucher voucher;

    public UserVoucher() {}

    public UserVoucher(Long id, Voucher voucher, User user) {
        this.id = id;
        this.voucher = voucher;
        this.user = user;
    }

}
