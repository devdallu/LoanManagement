package com.stg.LoanManagement.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "customer")
public class Customer {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String phoneNumber;
    private  int age;


    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference(value = "customer-loan")
    private List<Loan> loans;


    @OneToOne(mappedBy = "customer")
    private LoanStatus loanStatus;





}
