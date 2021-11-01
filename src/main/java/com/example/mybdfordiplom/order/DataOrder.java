package com.example.mybdfordiplom.order;

import com.example.mybdfordiplom.entity.Costumer;
import com.example.mybdfordiplom.entity.User;

import javax.persistence.*;

@Entity
@Table
public class DataOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Order_number", nullable = false)
    private String orderNumber;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "User_id")
    private User user;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Costumer_id")
    private Costumer costumer;

//    @OneToMany (mappedBy = "dataOrders", cascade = CascadeType.MERGE, orphanRemoval = true)
//    private List<OrderItem> orderItem;

    public DataOrder() {
    }
}
