package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.entity.BankLoanType;
import com.stg.LoanManagement.repository.BankLoanRepository;
import com.stg.LoanManagement.service.BankLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankLoanServiceImpl implements BankLoanService {
    private BankLoanRepository bankLoanRepository;

    @Autowired
    public BankLoanServiceImpl(BankLoanRepository bankLoanRepository) {
        this.bankLoanRepository = bankLoanRepository;
    }

    @Override
    public BankLoanType insertBankLoanType(BankLoanType bankLoanType) {
        return bankLoanRepository.save(bankLoanType);
    }
}
