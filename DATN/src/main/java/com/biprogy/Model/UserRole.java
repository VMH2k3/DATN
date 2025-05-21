package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users_roles")
public class UserRole {
     @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private User user;
     @ManyToOne
    @JoinColumn(name = "roleid", referencedColumnName = "id")
    private Role role;

     public UserRole() {}
     public UserRole(Long id, Role role, User user) {
        super();
        this.id = id;
        this.role = role;
        this.user = user;
    }
}
