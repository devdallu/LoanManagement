package com.stg.LoanManagement.serviceImpl;

import com.stg.LoanManagement.dto.CustomerDtos;
import com.stg.LoanManagement.dto.CustomerDtosItem;
import com.stg.LoanManagement.dto.LoanApplicationsItem;
import com.stg.LoanManagement.entity.Customer;
import com.stg.LoanManagement.entity.LoanApplication;
import com.stg.LoanManagement.mapper.CustomerMapper;
import com.stg.LoanManagement.repository.CustomerRepository;
import com.stg.LoanManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
 Optional<Customer> customers = customerRepository.findById(1L);

        List<LoanApplicationsItem> loanApplicationsItemList = new ArrayList<>();
        customers.get().getLoanApplications(). forEach(data -> {
            LoanApplicationsItem loanApplicationsItem = new LoanApplicationsItem();
            loanApplicationsItem.setLoanAmount(data.getLoanAmount());
            loanApplicationsItemList.add(loanApplicationsItem);
        });
        return  loanApplicationsItemList;




//        CustomerDtos customerDtos = new CustomerDtos();
//        List<CustomerDtosItem> customerDtosItems = new ArrayList<>();
//       customers.forEach(data -> {
//           CustomerDtosItem customerDtosItem = new CustomerDtosItem();
//           customerDtosItem.setName(data.getName());
//           customerDtosItems.add(customerDtosItem);
//           customerDtos.setCustomerDtos(customerDtosItems);
//       });
//        return  customerDtosItems;
    }
}
