package com.stg.LoanManagement.repository;

import com.stg.LoanManagement.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,Long> {
}
