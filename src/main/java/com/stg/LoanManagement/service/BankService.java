package com.stg.LoanManagement.service;


import com.stg.LoanManagement.entity.Bank;

import java.util.List;

public interface BankService {

    public Bank InsertBank(Bank bank);

    public List<Bank> getBankList();
}
