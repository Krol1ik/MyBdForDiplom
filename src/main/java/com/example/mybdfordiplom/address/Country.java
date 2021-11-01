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
    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "country", referencedColumnName = "id", nullable = false)
    private Address address;

    @OneToMany (mappedBy = "country", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<City> city;
}
