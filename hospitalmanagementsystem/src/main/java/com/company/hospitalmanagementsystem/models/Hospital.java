package com.company.hospitalmanagementsystem.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "hospitals")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_hospitals")
    @SequenceGenerator(
            name = "seq_hospitals", allocationSize = 1
    )
    private Long id;
    private String name;
    private String address;
    private String email;
    private BigDecimal budget;
    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctors;
    @OneToMany(mappedBy = "hospital")
    private List<Assistant> assistants;

}
