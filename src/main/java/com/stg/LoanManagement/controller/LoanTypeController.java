package com.stg.LoanManagement.controller;

import com.stg.LoanManagement.entity.LoanType;
import com.stg.LoanManagement.service.LoanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loanType")
public class LoanTypeController {

    private LoanTypeService loanTypeService;
@Autowired
    public LoanTypeController(LoanTypeService loanTypeService) {
        this.loanTypeService = loanTypeService;
    }
@PostMapping("/create-LoanType")
    public ResponseEntity<LoanType> createLoanType(LoanType loanType){
return  new ResponseEntity<>(loanTypeService.InsertLoanType(loanType), HttpStatus.OK);
    }
}
