package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.stg.LoanManagement.constant.LoanStatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "loanApplication")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "applicationId")

public class LoanApplication {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long  applicationId;
    private double loanAmount;
    private double salary;
    private String purpose;
    private Date requestDateTime;


    @ManyToOne
    @JoinColumn(name = "bankLoanId")
    private BankLoanType bankLoanType;

    // Define the relationship with LoanStatus
    @OneToMany(mappedBy = "loanApplication")
    private List<LoanStatus> loanStatuses;

    // Define the relationship with Customer
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


}
