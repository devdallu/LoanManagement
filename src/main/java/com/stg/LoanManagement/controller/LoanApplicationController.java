package com.stg.LoanManagement.controller;


import com.stg.LoanManagement.entity.LoanApplication;
import com.stg.LoanManagement.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
