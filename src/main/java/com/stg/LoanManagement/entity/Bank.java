package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bankId;
    @NotBlank(message = "Bank name is required")
    private String bankName;
    @NotBlank(message = "Branch name is required")
    private String branchName;
    @NotBlank(message = "Address is required")
    private String address;

    @JsonManagedReference(value = "bank_loanType")
    @OneToMany(mappedBy = "bankRef",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<LoanType> loanTypes;

    @OneToOne(mappedBy = "bank",fetch = FetchType.EAGER)
    @JsonManagedReference(value = "bank")
    private  LoanApplication loanApplication;


}
