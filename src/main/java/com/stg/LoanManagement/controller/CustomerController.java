package com.stg.LoanManagement.controller;


import com.stg.LoanManagement.dto.CustomerDtos;
import com.stg.LoanManagement.dto.CustomerDtosItem;
import com.stg.LoanManagement.entity.Customer;
import com.stg.LoanManagement.responsehandler.ResponseHandler;
import com.stg.LoanManagement.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    private CustomerService customerService;
    private ResponseHandler responseHandler;

    @Autowired
    public CustomerController(CustomerService customerService, ResponseHandler responseHandler) {
        this.customerService = customerService;
        this.responseHandler = responseHandler;
    }
    @PostMapping("/create-customer")
    public ResponseEntity<?> createCustomer(@RequestBody @Valid Customer customer){
    return  responseHandler.createdResponse(customerService.InsertCustomer(customer),"Customer Created Successfully");
    }


    @GetMapping("/customerList")
    public  ResponseEntity<List<?>> getCustomerList(){
        return  new ResponseEntity<>(customerService.getCustomerList(),HttpStatus.OK);
    }
}
