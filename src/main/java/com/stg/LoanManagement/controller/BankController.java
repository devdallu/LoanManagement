package com.stg.LoanManagement.controller;


import com.stg.LoanManagement.entity.Bank;
import com.stg.LoanManagement.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Bank")
public class BankController {
    private BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }
@PostMapping("/create-bank")
    public ResponseEntity<Bank> createBank(@RequestBody Bank bank){
        return  new ResponseEntity<>(bankService.InsertBank(bank), HttpStatus.OK);
    }
}
