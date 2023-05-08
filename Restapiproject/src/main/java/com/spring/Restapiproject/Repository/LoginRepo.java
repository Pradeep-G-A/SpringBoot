package com.spring.Restapiproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Restapiproject.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
