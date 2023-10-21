package com.stg.LoanManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class LoanRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loanStatus;
    private double totalAmount;
    private double interestRate;
    private int duration;
    private String paymentMethod;
    private Date startDate;
    private Date endDate;
    private String loanOfficer;
}
