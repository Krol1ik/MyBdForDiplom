package com.example.mybdfordiplom.address;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "City_name", nullable = false)
    private String cityName;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Country_id", nullable = false)
    private Country country;

    @OneToMany (mappedBy = "city", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Street> street;
}
