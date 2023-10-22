package com.stg.LoanManagement.service;


import com.stg.LoanManagement.entity.LoanType;

import java.util.List;

public interface LoanTypeService {
    public LoanType InsertLoanType(LoanType loanType);

    public List<LoanType> getAllLoanType();
}
