package com.example.mybdfordiplom.product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Model_product")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Model_name", nullable = false)
    private String modelName;

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;
}
