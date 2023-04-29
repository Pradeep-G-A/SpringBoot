package com.spring.plants.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.plants.Model.LoginModel;
import com.spring.plants.Repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
    private LoginRepository repository;
	
	public  String checkLogin(String username,String password){
		LoginModel user=repository.findByUsername(username);
		if (user==null) {
			return "No User Found";
			
		}
		else {
			if (user.getPassword().equals(password)) {
				return "Login Sucessful";
				
			}
			else {
				return "Login Failed";
			}
		}

	}
	public LoginModel addUser(LoginModel loginModel)
	{
		return repository.save(loginModel);
	}
	public List<LoginModel> getUser()
	{
		return repository.findAll();
	}

}
