package com.stg.LoanManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loan {
    @Id
    private Long id;
    private String loanType;
    private double loanAmount;
    private double income;
    private String repaymentSchedule;
    private String purpose;
    private String collateral;
    private String loanTermType;
    private int creditScore;
}
