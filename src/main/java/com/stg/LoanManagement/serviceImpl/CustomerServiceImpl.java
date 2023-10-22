package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.entity.Customer;
import com.stg.LoanManagement.repository.CustomerRepository;
import com.stg.LoanManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
     private CustomerRepository customerRepository;
@Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer InsertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomerList() {
        return customerRepository.findAll();
    }
}
