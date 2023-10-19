package com.stg.LoanManagement.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "loanStatus")
public class LoanStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusId;
    private  String Status;
    private  String statusDate;
    private  double currentBalance;
    private Date nextPaymentDueDate;
    private int gracePeriod;

//    @OneToOne
//    @JoinColumn(name = "loan_id")
//    private  Loan loan;

   @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private  Customer customer;

}
