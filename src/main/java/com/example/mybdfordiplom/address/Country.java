package com.example.mybdfordiplom.address;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Country_name", nullable = false)
    private String countryName;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Address_id", referencedColumnName = "id", nullable = false)
    private Address address;

    @OneToMany (mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> city;
}
