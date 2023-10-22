package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.entity.LoanApplication;
import com.stg.LoanManagement.repository.LoanApplicationRepository;
import com.stg.LoanManagement.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {
    private LoanApplicationRepository loanApplicationRepository;
@Autowired
    public LoanApplicationServiceImpl(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    @Override
    public LoanApplication InsertLoanApplication(LoanApplication loanApplication) {
        return loanApplicationRepository.save(loanApplication);
    }
}
