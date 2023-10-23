package com.stg.LoanManagement.dto;

import lombok.Data;

@Data
public class BankLoanType{
	private Bank bank;
	private LoanType loanType;
	private int bankLoanId;
}