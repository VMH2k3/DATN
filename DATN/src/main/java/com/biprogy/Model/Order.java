package com.biprogy.Model;


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
@Setter
@Getter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "oderstatus")
    private String oderstatus;

    @Column(name = "oderdate")
    private Date oderdate;

    @Column(name = "shipdate")
    private Date shipdate;

    @Column(name = "orderprice")
    private Double orderprice;

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private User user;

    @OneToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name ="voucher_id")
    private Voucher voucher;


    public Order(Long id, User user, Date shipdate, Date oderdate, String oderstatus) {
        this.id = id;
        this.user = user;
        this.shipdate = shipdate;
        this.oderdate = oderdate;
        this.oderstatus = oderstatus;
    }

    public Order() {}

    public Order(Long id, Cart cart, Date shipdate, User user, Date oderdate, String oderstatus) {
        this.id = id;
        this.cart = cart;
        this.shipdate = shipdate;
        this.user = user;
        this.oderdate = oderdate;
        this.oderstatus = oderstatus;
    }

    public Order(Long id, Voucher voucher, Cart cart, User user, Date shipdate, Date oderdate, String oderstatus, Double orderprice ) {
        this.id = id;
        this.voucher = voucher;
        this.cart = cart;
        this.user = user;
        this.orderprice=0.0;
        if (voucher != null) {
            this.orderprice = orderprice;
        }else{
            orderprice = cart.getTotalprice();
        }
        this.shipdate = shipdate;
        this.oderdate = oderdate;
        this.oderstatus = oderstatus;
    }

}
