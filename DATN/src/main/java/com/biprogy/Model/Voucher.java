package com.biprogy.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "vouchers")
public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "code", nullable = false, unique = true, length = 50)
    private String code;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "discount_percent")
    private Integer discountPercent;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;


    @Column(name = "active")
    private Boolean active;

    @OneToMany(mappedBy = "voucher")
    private Set<UserVoucher> userVouchers;


    @OneToMany(mappedBy = "voucher")
    private List<Order> orderList;

    // Constructor không tham số (bắt buộc cho JPA)
    public Voucher() {
    }

    // Constructor đầy đủ (tuỳ chọn)
    public Voucher(String code, String description, Integer discountPercent, LocalDate startDate, LocalDate endDate, Boolean active) {
        this.code = code;
        this.description = description;
        this.discountPercent = discountPercent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
    }

    public Voucher(Long id, String code, String description, Integer discountPercent, LocalDate startDate, LocalDate endDate, Boolean active, Set<UserVoucher> userVouchers) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.discountPercent = discountPercent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
        this.userVouchers = userVouchers;
    }
}

