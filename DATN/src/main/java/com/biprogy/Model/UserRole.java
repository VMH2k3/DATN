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
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
     @ManyToOne
    @JoinColumn(name = "roleId", referencedColumnName = "id")
    private Role role;

     public UserRole() {}
     public UserRole(int id, Role role, User user) {
        super();
        this.id = id;
        this.role = role;
        this.user = user;
    }

}
