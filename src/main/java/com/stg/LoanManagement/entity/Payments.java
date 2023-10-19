package com.stg.LoanManagement.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long paymentId;
    private  double paymentAmount;
    private Date  paymentDate;
    private  String paymentMethod;

//    @ManyToOne
//    @JoinColumn(name = "loan_id")
//    private  Loan loan;
}
