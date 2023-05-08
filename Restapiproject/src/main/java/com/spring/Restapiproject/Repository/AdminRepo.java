package com.spring.Restapiproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Restapiproject.Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
