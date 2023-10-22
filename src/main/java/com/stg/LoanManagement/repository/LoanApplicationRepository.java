package com.stg.LoanManagement.repository;

import com.stg.LoanManagement.entity.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Long> {
}
