package com.spring.Restapiproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Restapiproject.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {
	UserModel findByemail(String email);
}
