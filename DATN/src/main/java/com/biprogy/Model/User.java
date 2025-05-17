package com.biprogy.Model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;


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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cart> carts;

    public User() {

    }

    public User(List<Cart> carts, Set<UserRole> userRoles, String password, boolean enable, String userName, Long id) {
        this.carts = carts;
        this.userRoles = userRoles;
        this.password = password;
        this.enable = enable;
        this.userName = userName;
        this.id = id;
    }


    public boolean getEnable() {
        return enable;
    }

}