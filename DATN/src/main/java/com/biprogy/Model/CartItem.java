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
    private Integer id;

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

    public CartItem(Integer id, Product product, Cart cart, Double totalprice, Double price, Integer quanlity) {
        this.id = id;
        this.product = product;
        this.cart = cart;
        this.totalprice = totalprice;
        this.price = price;
        this.quanlity = quanlity;
    }

}
