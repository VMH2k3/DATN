package com.biprogy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false, name = "value")
    private Integer ratingValue;

    @Column(columnDefinition = "TEXT",name = "comments")
    private String comment;

    @Column(nullable = false)
    private Date ratingDate;

    public Rating() {}

    public Rating(User user, Product product, Date ratingDate) {
        this.user = user;
        this.product = product;
        this.ratingDate = ratingDate;
    }

    public Rating(Long id, Date ratingDate, String comment, Integer ratingValue, Product product, User user) {
        this.id = id;
        this.ratingDate = ratingDate;
        this.comment = comment;
        this.ratingValue = ratingValue;
        this.product = product;
        this.user = user;
    }
}
