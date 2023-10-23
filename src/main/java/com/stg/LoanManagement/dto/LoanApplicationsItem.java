package com.stg.LoanManagement.dto;

import java.util.List;
import lombok.Data;

@Data
public class LoanApplicationsItem{
	private String purpose;
	private String requestDateTime;
	private List<LoanStatusesItem> loanStatuses;
	private Object salary;
	private BankLoanType bankLoanType;
	private Object loanAmount;
}