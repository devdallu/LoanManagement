package com.stg.LoanManagement.entity;

import jakarta.persistence.*;

@Entity
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loanType;
    private double loanAmount;
    private double applicantIncome;
    private String purpose;
    private String loanTermType;
    private int creditScore;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private  Bank bank;


}
