package com.biprogy.Model;


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Entity
@Table(name = "oders")
public class Oder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "oderstatus")
    private String oderstatus;

    @Column(name = "oderdate")
    private Date oderdate;

    @Column(name = "shipdate")
    private Date shipdate;

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private User user;

    public Oder(Integer id, User user, Date shipdate, Date oderdate, String oderstatus) {
        this.id = id;
        this.user = user;
        this.shipdate = shipdate;
        this.oderdate = oderdate;
        this.oderstatus = oderstatus;
    }

    public Oder() {}
}
