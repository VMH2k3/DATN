package com.biprogy.Model;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Setter
@Entity
@Table(name = "users")

public class User {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(name = "userName")
    private String userName;

    @Getter
    @Column(name="password")
    private String password;

    @Column(name = "enable")
    private boolean enable;
    @Getter
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<UserRole> userRoles;

    public User() {

    }

    public User(Long id, Set<UserRole> userRoles, boolean enable, String password, String userName) {
        this.id = id;
        this.userRoles = userRoles;
        this.enable = enable;
        this.password = password;
        this.userName = userName;
    }

    public boolean getEnable() {
        return enable;
    }

}