package com.biprogy.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "whislistproduct")
public class WishlistProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productid")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wishlistid")
    private Wishlist wishlist;

    public WishlistProduct(Long id, Wishlist wishlist, Product product) {
        this.id = id;
        this.wishlist = wishlist;
        this.product = product;
    }

    public WishlistProduct() {}
    public WishlistProduct(Product product, Wishlist wishlist) {
        this.product = product;
        this.wishlist = wishlist;
    }
}
