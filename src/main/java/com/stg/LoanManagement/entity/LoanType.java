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
    private Long id;
//    @Enumerated(EnumType.STRING)
    private LoanTypeEnum loanTypeMode;
    private double rateOfInterest;
    private double loanDuration;


    @ManyToOne
    @JoinColumn(name = "bank_id",referencedColumnName = "bankId")
    @JsonBackReference(value = "bank_loanType")
    private  Bank bankRef;

  @OneToOne
  @JsonManagedReference(value = "loan")
  private LoanApplication loanApplication;
}
