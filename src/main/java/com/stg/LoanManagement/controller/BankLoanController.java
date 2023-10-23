package com.stg.LoanManagement.controller;


import com.stg.LoanManagement.entity.BankLoanType;
import com.stg.LoanManagement.responsehandler.ResponseHandler;
import com.stg.LoanManagement.service.BankLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BankLoan")
public class BankLoanController {
    private BankLoanService bankLoanService;

    private ResponseHandler responseHandler;
@Autowired
    public BankLoanController(BankLoanService bankLoanService, ResponseHandler responseHandler) {
        this.bankLoanService = bankLoanService;
    this.responseHandler = responseHandler;
}

    @PostMapping("/create-bankLoan")
    public ResponseEntity<?> createBankLoan(@RequestBody BankLoanType bankLoanType){
        return  responseHandler.successResponse(bankLoanService.insertBankLoanType(bankLoanType)) ;
    }
}
