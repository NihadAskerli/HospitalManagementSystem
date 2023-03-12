package com.company.hospitalmanagementsystem.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_payments")
    @SequenceGenerator(
            name = "seq_payments", allocationSize = 1
    )
    private Long id;
    private BigDecimal pay;
    private String finCode;
    private Date date;


}
