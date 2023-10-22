package com.stg.LoanManagement.service;

import com.stg.LoanManagement.entity.LoanStatus;

import java.util.List;

public interface LoanStatusService {

    public LoanStatus InsertLoanStatus(LoanStatus loanStatus);

    public List<LoanStatus> getAllLoanStatus();
}
