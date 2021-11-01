package com.example.mybdfordiplom.order;

import com.example.mybdfordiplom.product.Product;

import javax.persistence.*;

@Entity
@Table (name = "Order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Order_id", nullable = false)
    private DataOrder dataOrders;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Product_id", nullable = false)
    private Product productOrder;

    @Column (name = "Count")
    private int count;
}
