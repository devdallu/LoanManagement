package com.stg.LoanManagement.repository;

import com.stg.LoanManagement.entity.BankLoanType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankLoanRepository extends JpaRepository<BankLoanType, Long> {
}
