package com.biprogy.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "whislist")
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    @OneToMany(mappedBy = "wishlist")
    private Set<WishlistProduct> wishlistProducts;

    public Wishlist() {}

    public Wishlist(Long id, User user, Set<WishlistProduct> wishlistProducts) {
        this.id = id;
        this.user = user;
        this.wishlistProducts = wishlistProducts;
    }
}
