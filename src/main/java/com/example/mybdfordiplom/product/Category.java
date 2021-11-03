package com.example.mybdfordiplom.product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Category_product")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Category_name", nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;
}
