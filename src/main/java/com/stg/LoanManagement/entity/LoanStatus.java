package com.stg.LoanManagement.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.stg.LoanManagement.constant.LoanStatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "statusId")
public class LoanStatus {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long StatusId;
    private String loanStatus;


    @ManyToOne
    @JoinColumn(name = "applicationId")
    private LoanApplication loanApplication;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}