package com.stg.LoanManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "customer")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "customerId")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Invalid email format")
    private String email;
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits" )
    private String phoneNumber;
    @NotBlank(message = "PAN card is required")
    private String panCard;
    @Pattern(regexp = "\\d{12}", message = "Aadhaar card must be 12 digits")
    private String aadhaarCard;
    @NotBlank(message = "Address is required")
    private String address;
    @Past(message = "Date of birth must be in the past")
    private Date dateOfBirth;

    @OneToMany(mappedBy = "customer")
    private List<LoanApplication> loanApplications;

}
