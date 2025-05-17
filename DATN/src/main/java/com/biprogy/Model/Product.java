package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "products")
public class Product {
    @Getter
    @Id
    @Column(name = "productid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productid;

    @Getter
    @Column(name="productname")
    private String productname;

    @Getter
    @Column(name = "price")
    private Double price;

    @Column(name = "image")
    private String image;

    @Getter
    @Column(name = "description",length = 4000)
    private String description;

    @Getter
    @ManyToOne
    @JoinColumn(name = "categoryid",referencedColumnName = "id")
    private Category category;
    public Product() {}

    public Product(int productid, Category category, String image, Double price, String description, String productname) {
        this.productid = productid;
        this.category = category;
        this.image = image;
        this.price = price;
        this.description = description;
        this.productname = productname;
    }
}
