package com.stg.LoanManagement.dto;

import java.util.List;
import lombok.Data;

@Data
public class CustomerDtosItem{
	private String phoneNumber;
	private String panCard;
	private String address;
	private String aadhaarCard;
	private String name;
	private List<LoanApplicationsItem> loanApplications;
	private String dateOfBirth;
	private String email;
}