package com.stg.LoanManagement.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.stg.LoanManagement.constant.LoanStatusEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class LoanStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long statusId;
    private LoanStatusEnum loanStatus;
    private double eligibleAmount;
    private Date approvalDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loanApplicationId")
    @JsonBackReference(value = "status")
    private  LoanApplication loanApplication;


}
