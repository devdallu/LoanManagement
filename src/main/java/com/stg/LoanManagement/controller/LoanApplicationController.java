package com.stg.LoanManagement.controller;


import com.stg.LoanManagement.entity.LoanApplication;
import com.stg.LoanManagement.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loanApplication")
public class LoanApplicationController {
  private LoanApplicationService loanApplicationService;
@Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @PostMapping("/create-loanApplication")
    public ResponseEntity<LoanApplication> createLoanApplication(@RequestBody LoanApplication loanApplication){
        return  new ResponseEntity<>(loanApplicationService.InsertLoanApplication(loanApplication), HttpStatus.OK);
    }

    @GetMapping("/loanApplicationList")
    public  ResponseEntity<List<LoanApplication>> getAllLoanApplication(){
       return  new ResponseEntity<>(loanApplicationService.getAllLoanApplication(),HttpStatus.OK);
    }
}
