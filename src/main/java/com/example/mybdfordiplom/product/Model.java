package com.example.mybdfordiplom.product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Model_product")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Model_name")
    private String modelName;

    @OneToMany(mappedBy = "model", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Product> products;
}
