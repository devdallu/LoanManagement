package com.stg.LoanManagement.dto;

import lombok.Data;

@Data
public class LoanType{
	private String loanTypeMode;
	private Object rateOfInterest;
	private int loanTypeId;
}