package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class BankLoanType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long bankLoanId;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @ManyToOne
    @JoinColumn(name = "loanType_id")
    private LoanType loanType;

    // Define the relationship with LoanApplication
    @OneToMany(mappedBy = "bankLoanType")
    @JsonBackReference
    private List<LoanApplication> loanApplications;
}
