package com.example.mybdfordiplom.product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Brand_product")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Brand_name", nullable = false)
    private String brandName;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;
}
