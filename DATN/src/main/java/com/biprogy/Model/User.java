package com.biprogy.Model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")

public class User {

    @Getter
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(name = "username")
    private String userName;

    @Getter
    @Column(name="password")
    private String password;

    @Column(name = "enable")
    private boolean enable;
    @Getter
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<UserRole> userRoles;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private Set<Cart> carts;

    @OneToMany(mappedBy = "user")
    private Set<Order> orders;

    @ManyToMany(mappedBy = "users")
    private Set<Voucher> vouchers;

    public User() {

    }

    public User( Set<UserRole> userRoles, String password, boolean enable, String userName, Long id) {
        this.userRoles = userRoles;
        this.password = password;
        this.enable = enable;
        this.userName = userName;
        this.id = id;
    }

    public User(Long id, Set<Cart> carts, Set<Voucher> vouchers, Set<UserRole> userRoles, boolean enable, String password, String userName) {
        this.id = id;
        this.carts = carts;
        this.vouchers = vouchers;
        this.userRoles = userRoles;
        this.enable = enable;
        this.password = password;
        this.userName = userName;
    }
}