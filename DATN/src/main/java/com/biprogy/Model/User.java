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

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name = "enable")
    private boolean enable;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<UserRole> userRoles;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private Set<Cart> carts;

    @OneToMany(mappedBy = "user")
    private Set<Order> orders;

    @OneToMany(mappedBy = "user")
    private List<UserVoucher> userVouchers;

    @OneToOne(mappedBy = "user")
    private Wishlist wishlist;

    @OneToMany(mappedBy = "user")
    private List<Rating> ratings;

    public User() {

    }

    public User( Set<UserRole> userRoles, String password, boolean enable, String userName, Long id) {
        this.userRoles = userRoles;
        this.password = password;
        this.enable = enable;
        this.userName = userName;
        this.id = id;
    }

    public User(Long id, String userName, String password, String fullname, String address, String phone, String email, boolean enable, Set<UserRole> userRoles, Set<Cart> carts, Set<Order> orders, List<UserVoucher> userVouchers, Wishlist wishlist, List<Rating> ratings) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.enable = enable;
        this.userRoles = userRoles;
        this.carts = carts;
        this.orders = orders;
        this.userVouchers = userVouchers;
        this.wishlist = wishlist;
        this.ratings = ratings;
    }
}