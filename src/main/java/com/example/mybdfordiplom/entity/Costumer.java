package com.example.mybdfordiplom.entity;



import com.example.mybdfordiplom.order.DataOrder;

import javax.persistence.*;
import java.util.List;

@Entity
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "First_name", nullable = false)
    private String firstName;
    @Column (name = "Last_name", nullable = false)
    private String lastName;
    @Column (name = "Phone_number", nullable = false)
    private String phoneNumber;
    @Column (name = "Email", nullable = false)
    private String email;

    @OneToMany (mappedBy = "costumer", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<DataOrder> order;
}
