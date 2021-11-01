package com.example.mybdfordiplom.address;

import com.example.mybdfordiplom.entity.User;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "User_id", referencedColumnName = "id", nullable = false)
    private User user;
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    private Country country;
}
