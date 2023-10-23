package com.stg.LoanManagement.service;

import com.stg.LoanManagement.dto.CustomerDtos;
import com.stg.LoanManagement.dto.CustomerDtosItem;
import com.stg.LoanManagement.entity.Customer;

import java.util.List;

public interface CustomerService {

    public Customer InsertCustomer(Customer customer);

    public List<?> getCustomerList();

}
