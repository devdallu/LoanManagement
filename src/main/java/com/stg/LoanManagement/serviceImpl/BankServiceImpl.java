package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.entity.Bank;
import com.stg.LoanManagement.repository.BankRepository;
import com.stg.LoanManagement.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {

    private BankRepository bankRepository;

    @Autowired
    public BankServiceImpl(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public Bank InsertBank(Bank bank) {
        return bankRepository.save(bank);
    }
}
