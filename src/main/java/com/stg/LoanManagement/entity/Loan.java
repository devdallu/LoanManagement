package com.stg.LoanManagement.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long loanId;
    private  String LoanType;
    private  String applicantName;
    private  double applicantIncome;
    private  double coApplicantIncome;
    private  double loanAmount;
    private  int durationInMonths;
    private  double interestRate;


    @ManyToOne()
    @JsonBackReference(value = "customer-loan")
    @JoinColumn(name = "customer_id")
    private  Customer customer;

    @ManyToOne
    @JsonBackReference(value = "bank-loan")
    @JoinColumn(name = "bank_id")
    private  Bank bank;

    @OneToOne(mappedBy = "loan")
    private  LoanStatus loanStatus;
//
//    @OneToMany
//    private List<Payments> payments;



}
