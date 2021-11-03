package com.example.mybdfordiplom.address;

import com.example.mybdfordiplom.entity.Costumer;
import com.example.mybdfordiplom.entity.User;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Street", nullable = false)
    private String street;
    @Column (name = "Number_house", nullable = false)
    private String numberHouse;
    @Column (name = "Number_apartment")
    private String numberApartment;
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    private Country country;


    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    private User user;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    private Costumer costumer;
}
