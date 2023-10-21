package com.stg.LoanManagement.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "loanApproval")
public class LoanApproval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long approvalId;
    private boolean approved;
    private String approvalStatus;
    private Date approvalDate;

}
