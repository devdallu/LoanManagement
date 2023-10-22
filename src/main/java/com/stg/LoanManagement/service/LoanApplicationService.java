package com.stg.LoanManagement.service;


import com.stg.LoanManagement.entity.LoanApplication;

import java.util.List;

public interface LoanApplicationService {

    public LoanApplication InsertLoanApplication(LoanApplication loanApplication);


    public List<LoanApplication> getAllLoanApplication();
}
