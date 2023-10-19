package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bankId;

    private  String bankName;
    private  String bankLocation;
    private String website;

    @OneToMany(mappedBy = "bank",cascade = CascadeType.ALL)
    @JsonManagedReference(value = "bank-loan")
    private List<Loan> loans;
}
