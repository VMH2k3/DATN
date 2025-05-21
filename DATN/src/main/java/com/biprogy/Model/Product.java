package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "products")
public class Product {
    @Setter
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

    @Setter
    @Getter
    @Column(name = "quanlity")
    private Integer quanlity;

    @Setter
    @Getter
    @Column(name = "color")
    private String color;

    @Setter
    @Getter
    @Column(name = "size")
    private Long size;

    @Getter
    @ManyToOne
    @JoinColumn(name = "categoryid",referencedColumnName = "id")
    private Category category;



    public Product() {}

    public Product(Integer productid, Category category, Long size, String color, String description, String image, Double price, String productname) {
        this.productid = productid;
        this.category = category;
        this.size = size;
        this.color = color;
        this.description = description;
        this.image = image;
        this.price = price;
        this.productname = productname;
    }

    public Product(Integer productid, Category category, Long size, String color, Integer quanlity, String description, String image, Double price, String productname) {
        this.productid = productid;
        this.category = category;
        this.size = size;
        this.color = color;
        this.quanlity = quanlity;
        this.description = description;
        this.image = image;
        this.price = price;
        this.productname = productname;
    }
}
