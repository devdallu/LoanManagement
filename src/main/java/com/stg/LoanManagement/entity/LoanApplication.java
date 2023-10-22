package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.stg.LoanManagement.constant.LoanStatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Table(name = "loanApplication")
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanApplicationId;
    private double loanAmount;
    private double salary;
    private String purpose;
    private Date requestDateTime;

    @ManyToOne
    @JsonBackReference(value = "customer")
    @JoinColumn(name = "customer_id",referencedColumnName = "customerId")
    private  Customer customer;

    @OneToOne
    @JoinColumn(name = "bank_id",referencedColumnName = "bankId")
    private Bank bank;

    @OneToOne(mappedBy = "loanApplication",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private LoanStatus loanStatus;

}
