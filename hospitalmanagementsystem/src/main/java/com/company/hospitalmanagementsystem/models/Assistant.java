package com.company.hospitalmanagementsystem.models;

import jakarta.persistence.*;


@Entity
@Table(name = "assistants")
public class Assistant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_hospitals")
    @SequenceGenerator(
            name = "seq_hospitals", allocationSize = 1
    )
    private Long id;
    private String finCode;
    private String name;
    private String surname;
    private String cardId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hospital_id",referencedColumnName = "id")
    private Hospital hospital;


}
