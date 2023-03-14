package com.company.hospitalmanagementsystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_patients")
    @SequenceGenerator(
            name = "seq_patients", allocationSize = 1
    )
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;
    private String date;
    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Doctor doctor;
}
