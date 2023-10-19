package com.stg.LoanManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String panCard;
    private String aadhaarCard;
    private String address;
    private Date dateOfBirth;
    private String gender;
    private String nationality;
    private String employmentStatus;
}
