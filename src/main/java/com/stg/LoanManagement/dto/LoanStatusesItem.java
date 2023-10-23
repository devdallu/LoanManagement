package com.stg.LoanManagement.dto;

import lombok.Data;

@Data
public class LoanStatusesItem{
	private int loanApplication;
	private int statusId;
	private String loanStatus;
}