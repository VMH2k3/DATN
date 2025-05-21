package com.biprogy.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
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
    private String code;  // Mã voucher

    @Column(name = "description", length = 255)
    private String description;  // Mô tả voucher

    @Column(name = "discount_percent")
    private Integer discountPercent;  // % giảm giá

    @Column(name = "start_date")
    private LocalDate startDate;  // Ngày bắt đầu hiệu lực

    @Column(name = "end_date")
    private LocalDate endDate;  // Ngày kết thúc hiệu lực

    @Column(name = "active")
    private Boolean active;  // Trạng thái kích hoạt voucher

    @ManyToMany
    @JoinTable(
            name = "user_voucher",
            joinColumns = @JoinColumn(name = "voucher_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users;

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

    public Voucher(Long id, Set<User> users, Boolean active, LocalDate endDate, LocalDate startDate, Integer discountPercent, String description, String code) {
        this.id = id;
        this.users = users;
        this.active = active;
        this.endDate = endDate;
        this.startDate = startDate;
        this.discountPercent = discountPercent;
        this.description = description;
        this.code = code;
    }
}

