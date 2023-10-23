package com.stg.LoanManagement.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanApplicationsItem{
	private String purpose;
	private String requestDateTime;
	private List<LoanStatusesItem> loanStatuses;
	private Object salary;
	private BankLoanType bankLoanType;
	private Object loanAmount;
}