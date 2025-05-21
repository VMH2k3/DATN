package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@Entity
@Table(name="carts")
public class Cart {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cartstatus")
    private Boolean cartstatus;

    @Getter
    @Column(name="totalprice")
    private Double totalprice;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    @OneToOne(mappedBy = "cart")
    private Order order;

    public Cart() {}

    public Cart( List<CartItem> items, Boolean cartstatus, Integer id) {
        this.totalprice=0.0;
        for (CartItem item : items) {
            this.totalprice += item.getPrice()*item.getQuanlity();
        }
        this.items = items;
        this.cartstatus = cartstatus;
        this.id = id;
    }

    public Cart(Integer id, Order order, Boolean cartstatus, List<CartItem> items) {
        this.id = id;
        this.order = order;
        setTotalprice(items);
        this.cartstatus = cartstatus;
        this.items = items;
    }

    public Cart(Integer id, Order order, User user, List<CartItem> items, Boolean cartstatus) {
        this.id = id;
        this.order = order;
        this.user = user;
        this.items = items;
        setTotalprice(items);
        this.cartstatus = cartstatus;
    }

    public void setTotalprice(List<CartItem> items) {
        this.totalprice=0.0;
        for (CartItem item : items) {
            this.totalprice += item.getPrice()*item.getQuanlity();
        }
    }
}
