package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="categoryname")
    private String categoryname;

    @Column(name="categorystatus")
    private Boolean categorystatus;

    @Getter
    @OneToMany(mappedBy = "category")
    private Set<Product> products;

    @Setter
    @Transient
    private Integer productCount;

    public Category() {}

    public Category(Set<Product> products, Boolean categorystatus, String categoryname, Integer id) {
        this.products = products;
        this.categorystatus = categorystatus;
        this.categoryname = categoryname;
        this.id = id;
    }

}

