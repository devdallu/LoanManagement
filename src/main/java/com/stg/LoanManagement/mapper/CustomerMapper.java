package com.stg.LoanManagement.mapper;

import com.stg.LoanManagement.dto.*;
import com.stg.LoanManagement.entity.Customer;
import com.stg.LoanManagement.entity.LoanApplication;
import com.stg.LoanManagement.entity.LoanStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Optional;

@Mapper(componentModel = "spring")

public interface CustomerMapper {
//    List<CustomerDtosItem> getToDto(List<Customer> source);

//    @Mappings({
//            @Mapping(target = "loanApplications", source = "loanApplications"),
//            @Mapping(target = "loanStatuses", source = "loanApplications[0].loanStatuses"),
//            @Mapping(target = "customerId", source = "customerId") // You may need to map the ID field
//    })
//    Customer jsonToCustomer(Optional<Customer> jsonCustomer);
//
//    LoanApplication jsonToLoanApplication(LoanApplicationsItem jsonLoanApplication);
//
//    BankLoanType jsonToBankLoanType(BankLoanType jsonBankLoanType);
//
//    Bank jsonToBank(Bank jsonBank);
//
//    LoanType jsonToLoanType(LoanType jsonLoanType);
//
//    LoanStatus jsonToLoanStatus(LoanStatusesItem jsonLoanStatus);

}
