package com.example.mybdfordiplom.product;

import com.example.mybdfordiplom.order.DataOrder;
import com.example.mybdfordiplom.order.OrderItem;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Article")
    private int article;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Type_product_id", nullable = false)
    private Type type;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Brand_product_id", nullable = false)
    private Brand brand;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Model_product_id", nullable = false)
    private Model model;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Category_product_id", nullable = false)
    private Category category;

    @Column (name = "Description_product", nullable = false)
    private String descriptionProduct;
    @Column (name = "Price", nullable = false)
    private Double price;
    @Column (name = "Discount")
    private int discount;

    @OneToOne (mappedBy = "product", cascade = CascadeType.MERGE, orphanRemoval = true)
    private StockBalance stockBalance;

    @OneToMany (mappedBy = "productOrder", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<OrderItem> orderItem;

}
