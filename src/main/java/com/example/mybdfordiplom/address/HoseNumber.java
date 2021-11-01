package com.example.mybdfordiplom.address;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "Hose_number")
public class HoseNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Hose_number", nullable = false)
    private int hoseNumber;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "Street_id", nullable = false)
    private Street street;
    @OneToMany (mappedBy = "hoseNumber", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<ApartmentNumber> apartmentNumbers;
}
