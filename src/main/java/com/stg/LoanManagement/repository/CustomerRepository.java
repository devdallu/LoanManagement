package com.stg.LoanManagement.repository;

import com.stg.LoanManagement.entity.Customer;
import com.stg.LoanManagement.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
