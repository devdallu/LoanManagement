package com.stg.LoanManagement.repository;

import com.stg.LoanManagement.entity.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoanTypeRepository extends JpaRepository<LoanType,Long> {
}
