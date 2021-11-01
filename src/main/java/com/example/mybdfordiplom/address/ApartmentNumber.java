package com.example.mybdfordiplom.address;

import javax.persistence.*;

@Entity
@Table (name = "Number_apartment")
public class ApartmentNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Apartment_number")
    private int apartmentNumber;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "House_number_id")
    private HoseNumber hoseNumber;
}
