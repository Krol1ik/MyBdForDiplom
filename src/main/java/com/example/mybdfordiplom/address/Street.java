package com.example.mybdfordiplom.address;

import javax.persistence.*;
import java.util.List;

@Entity
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Street_name", nullable = false)
    private String streetName;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "City_id", nullable = false)
    private City city;

    @OneToMany (mappedBy = "street", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<HoseNumber> hoseNumber;
}
