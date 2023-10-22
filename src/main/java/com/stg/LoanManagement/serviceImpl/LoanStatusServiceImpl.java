package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.entity.LoanStatus;
import com.stg.LoanManagement.repository.LoanStatusRepository;
import com.stg.LoanManagement.service.LoanStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanStatusServiceImpl implements LoanStatusService {
    private LoanStatusRepository loanStatusRepository;
@Autowired
    public LoanStatusServiceImpl(LoanStatusRepository loanStatusRepository) {
        this.loanStatusRepository = loanStatusRepository;
    }


    @Override
    public LoanStatus InsertLoanStatus(LoanStatus loanStatus) {
        return loanStatusRepository.save(loanStatus);
    }

    @Override
    public List<LoanStatus> getAllLoanStatus() {
        return loanStatusRepository.findAll();
    }
}
