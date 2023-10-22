package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    private String bankName;
    private String branchName;
    private String address;


    @JsonManagedReference(value = "bank_loanType")
    @OneToMany(mappedBy = "bankRef",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<LoanType> loanTypes;


    @OneToOne(mappedBy = "bank",fetch = FetchType.EAGER)
    private  LoanApplication loanApplication;

}
