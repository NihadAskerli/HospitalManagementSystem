package com.company.hospitalmanagementsystem.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doctors")
    @SequenceGenerator(
            name = "seq_doctors", allocationSize = 1
    )
    private Long id;
    private String finCode;
    private String name;
    private String surname;
    private String branch;
    private String photo;
    private String cardId;
    private String unWorking;
    private String room;
    @ManyToOne
    @JoinColumn(name = "hospital_id",referencedColumnName = "id")
    private Hospital hospital;
    @OneToMany(mappedBy = "doctor")
    private List<Patient> patient;

}
