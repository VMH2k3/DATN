package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

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
    @Getter
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

    @Setter
    @Getter
    @Column(name = "rating")
    private Double rating;

    @Getter
    @ManyToOne
    @JoinColumn(name = "categoryid",referencedColumnName = "id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private Set<WishlistProduct> wishlistProductSet;

    @OneToMany(mappedBy = "product")
    private List<Rating> ratings;



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

    public Product(Integer productid, Set<WishlistProduct> wishlistProductSet, Long size, Category category, String color, Integer quanlity, String description, String image, Double price, String productname) {
        this.productid = productid;
        this.wishlistProductSet = wishlistProductSet;
        this.size = size;
        this.category = category;
        this.color = color;
        this.quanlity = quanlity;
        this.description = description;
        this.image = image;
        this.price = price;
        this.productname = productname;
    }

    public Product(Integer productid, String productname, Double price, String image, String description, Integer quanlity, String color, Long size, Double rating, Category category, Set<WishlistProduct> wishlistProductSet, List<Rating> ratings) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
        this.image = image;
        this.description = description;
        this.quanlity = quanlity;
        this.color = color;
        this.size = size;
        this.rating = rating;
        this.category = category;
        this.wishlistProductSet = wishlistProductSet;
        this.ratings = ratings;
    }
    public Product(Integer productid, String productname, Double price, String image, String description, Integer quanlity, String color, Long size, Category category, Set<WishlistProduct> wishlistProductSet, List<Rating> ratings) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
        this.image = image;
        this.description = description;
        this.quanlity = quanlity;
        this.color = color;
        this.size = size;
        int i=0;
        double j = 0;
        for(Rating rt:ratings){
            j+=rt.getRatingValue().doubleValue();
            i++;
        }
        this.rating = j/(double)i;
        this.category = category;
        this.wishlistProductSet = wishlistProductSet;
        this.ratings = ratings;
    }
}
