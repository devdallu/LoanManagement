package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.stg.LoanManagement.constant.LoanTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LoanType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LoanTypeEnum loanTypes;
    private double rateOfInterest;
    private double loanDuration;


    @ManyToOne
    @JoinColumn(name = "bank_id",referencedColumnName = "bankId")
    @JsonBackReference(value = "bank_loanType")
    private  Bank bankRef;


}
