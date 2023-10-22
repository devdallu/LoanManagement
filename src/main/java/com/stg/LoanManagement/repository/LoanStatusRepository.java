package com.stg.LoanManagement.repository;

import com.stg.LoanManagement.entity.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoanStatusRepository extends JpaRepository<LoanStatus,Long> {
}
