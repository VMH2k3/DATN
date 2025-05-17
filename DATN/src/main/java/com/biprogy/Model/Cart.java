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

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    @Column(name = "cartstatus")
    private String cartstatus;

    @Column(name="totalprice")
    private Double totalprice;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items = new ArrayList<>();

    public Cart() {}

    public Cart(Integer id, List<CartItem> items, Double totalprice, String cartstatus, User user) {
        this.id = id;
        this.items = items;
        this.totalprice = totalprice;
        this.cartstatus = cartstatus;
        this.user = user;
    }

}
