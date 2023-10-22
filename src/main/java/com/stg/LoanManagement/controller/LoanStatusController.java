package com.stg.LoanManagement.controller;


import com.stg.LoanManagement.entity.LoanStatus;
import com.stg.LoanManagement.service.LoanStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loanStatus")
public class LoanStatusController {

    private LoanStatusService loanStatusService;
@Autowired
    public LoanStatusController(LoanStatusService loanStatusService) {
        this.loanStatusService = loanStatusService;
    }
@PostMapping("/create-loanStatus")
    public ResponseEntity<LoanStatus> createLoanStatus(@RequestBody LoanStatus loanStatus){
        return  new ResponseEntity<>(loanStatusService.InsertLoanStatus(loanStatus), HttpStatus.OK);
    }

    @GetMapping("/loanStatusList")
    public  ResponseEntity<List<LoanStatus>> getAllLoanStatus(){
     return  new ResponseEntity<>(loanStatusService.getAllLoanStatus(),HttpStatus.OK);
    }
}
