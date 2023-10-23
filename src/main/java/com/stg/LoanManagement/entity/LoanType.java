package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.stg.LoanManagement.constant.LoanTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LoanType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanTypeId;
    private String loanTypeMode;
    private double rateOfInterest;

}
