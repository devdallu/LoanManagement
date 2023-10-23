package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.entity.Bank;
import com.stg.LoanManagement.entity.Customer;
import com.stg.LoanManagement.repository.BankRepository;
import com.stg.LoanManagement.repository.CustomerRepository;
import com.stg.LoanManagement.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    private BankRepository bankRepository;

    private CustomerRepository customerRepository;

    @Autowired
    public BankServiceImpl(BankRepository bankRepository, CustomerRepository customerRepository) {
        this.bankRepository = bankRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public Bank InsertBank(Bank bank) {
        return bankRepository.save(bank);
    }
    @Override
    public List<Bank> getBankList() {
        return bankRepository.findAll();
    }

    @Override
    public Object assignCustomerToBank(Long bankId, Long customerID) {
         Bank bank = bankRepository.findById(bankId).orElse(null);
        Customer customer = customerRepository.findById(customerID).orElse(null);
        if (bank != null && customer != null){
//            bank.getCustomers().add(customer);
//            customer.getBanks().add(bank);
//            bankRepository.save(bank);
        }
        return null;
    }
}
