package com.stg.LoanManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
    @Id
    private Long id;
    private String bankName;
    private String branchName;
    private double interestRate;
    private int duration;
    private String address;
    private String contactInformation;
    private double totalAssets;
    private String services;
    private String operatingHours;

}
