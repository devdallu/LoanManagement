package com.stg.LoanManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class LoanStatus {
    @Id
    private Long id;
    private String loanStatus;
    private double totalAmount;
    private double interestRate;
    private int duration;
    private String paymentMethod;
    private Date startDate;
    private Date endDate;
    private double latePaymentPenalty;
    private String paymentHistory;
    private int gracePeriod;
    private String loanOfficer;
}
