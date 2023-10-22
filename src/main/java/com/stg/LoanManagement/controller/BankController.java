package com.stg.LoanManagement.controller;


import com.stg.LoanManagement.entity.Bank;
import com.stg.LoanManagement.service.BankService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bank")
public class BankController {
    private BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }
@PostMapping("/create-bank")
    public ResponseEntity<?> createBank(@RequestBody @Valid Bank bank){
        return  new ResponseEntity<>(bankService.InsertBank(bank), HttpStatus.OK);
    }

    @GetMapping("/bankList")
    private ResponseEntity<List<Bank>> getAllBank(){
        return  new ResponseEntity<>(bankService.getBankList(),HttpStatus.OK);
    }
}

