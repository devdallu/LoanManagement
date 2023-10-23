package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.dto.CustomerDtosItem;
import com.stg.LoanManagement.entity.Customer;
import com.stg.LoanManagement.mapper.CustomerMapper;
import com.stg.LoanManagement.repository.CustomerRepository;
import com.stg.LoanManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
     private CustomerRepository customerRepository;
     private CustomerMapper customerMapper;
@Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
    this.customerMapper = customerMapper;
}


    @Override
    public Customer InsertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<?> getCustomerList() {
//         return    customerMapper.getToDto(customerRepository.findAll()) ;

//        return (List<?>) customerMapper.jsonToCustomer(customerRepository.findById(1L));


//        CustomerDtos customerDtos = new CustomerDtos();
//       customers.forEach(data -> {
// customerDtos.setPhoneNumber(data.getPhoneNumber());
//           LoanApplication loanApplication = new LoanApplication();
//           loanApplication.setLoanAmount(data.getLoanApplications().get(0).getLoanAmount());
//       });
        return  customerRepository.findAll();
    }
}
