package com.example.mybdfordiplom.product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Type_product")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Type_name")
    private String typeName;

    @OneToMany (mappedBy = "type", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Product> products;
}
