package com.example.mybdfordiplom.entity;

import com.example.mybdfordiplom.address.Address;
import com.example.mybdfordiplom.address.City;
import com.example.mybdfordiplom.order.DataOrder;
import com.example.mybdfordiplom.order.OrderItem;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "First_name", nullable = false)
    private String firstName;
    @Column (name = "Last_name", nullable = false)
    private String lastName;
    @Column (name = "Phone_number", nullable = false)
    private String phoneNumber;
    @Column (name = "Email", nullable = false)
    private String email;
    @Column (name = "Login", nullable = false)
    private String login;
    @Column (name = "Password", nullable = false)
    private String password;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Role_id", referencedColumnName = "id", nullable = false)
    private RoleUser roleUser;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Address_id", referencedColumnName = "id", nullable = false)
    private Address address;
    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;
    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DataOrder> order;
}
