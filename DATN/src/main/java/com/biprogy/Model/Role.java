package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@Table (name = "role")
public class Role {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "role")
    private Set<UserRole> roleUsers;

    public Role(String name, Set<UserRole> roleUsers, Long id) {
        super();
        this.name = name;
        this.roleUsers = roleUsers;
        this.id = id;
    }

    public Role() {

    }

}
