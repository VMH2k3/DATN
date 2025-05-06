package com.biprogy.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "san_pham")
public class SanPhamEntitty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
