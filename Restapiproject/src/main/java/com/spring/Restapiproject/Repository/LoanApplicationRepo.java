package com.spring.Restapiproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Restapiproject.Model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
