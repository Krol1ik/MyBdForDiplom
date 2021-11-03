package com.example.mybdfordiplom.product;

import javax.persistence.*;

@Entity
@Table (name = "Stock_balance")
public class StockBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "Product_id", referencedColumnName = "id", nullable = false)
    private Product product;
    @Column (name = "Remain", nullable = false)
    private int remain;
}
