package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="cartitems")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quanlity")
    private Integer quanlity;

    @Column(name = "price")
    private Double  price;

    @Column(name = "totalprice")
    private Double  totalprice;

    @ManyToOne
    @JoinColumn(name = "cartid")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "productid")
    private Product product;

    public CartItem() {}

    public CartItem(Long id, Product product, Cart cart, Integer quanlity) {
        this.id = id;
        this.product = product;
        this.cart = cart;
        this.price = product.getPrice() != null ? product.getPrice() : 0.0;
        this.totalprice = this.price*quanlity;
        this.quanlity = quanlity;
    }

    public CartItem( Product product, Cart cart, Integer quanlity) {
        this.product = product;
        this.cart = cart;
        this.price = product.getPrice() != null ? product.getPrice() : 0.0;
        this.totalprice =this.price*quanlity;
        this.quanlity = quanlity;
    }


    public void setTotalprice(Double price, Integer quanlity) {
        this.totalprice = price*quanlity;
    }
}
