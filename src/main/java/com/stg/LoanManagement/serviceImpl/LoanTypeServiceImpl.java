package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.entity.LoanType;
import com.stg.LoanManagement.repository.LoanTypeRepository;
import com.stg.LoanManagement.service.LoanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanTypeServiceImpl implements LoanTypeService {
    private LoanTypeRepository loanTypeRepository;
@Autowired
    public LoanTypeServiceImpl(LoanTypeRepository loanTypeRepository) {
        this.loanTypeRepository = loanTypeRepository;
    }

    @Override
    public LoanType InsertLoanType(LoanType loanType) {
        return loanTypeRepository.save(loanType);
    }
}
