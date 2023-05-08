package com.spring.Restapiproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Restapiproject.Model.LoanApplicationModel;
import com.spring.Restapiproject.Model.UserModel;
import com.spring.Restapiproject.Repository.LoanApplicationRepo;
import com.spring.Restapiproject.Repository.UserRepo;


@Service
public class ApiService {
	@Autowired
	UserRepo apiRepo;
	@Autowired
	LoanApplicationRepo apiRepox;

	public String login(String email, String Password) {
		UserModel user = apiRepo.findByemail(email);
		if (user == null) {
			return "Email not Found";
		} else {
			if (user.getPassword().equals(Password)) {
				return "Login Successful";
			} else {
				return "Password Wrong";
			}
		}
	}


	public UserModel addUser(UserModel u) {
		return apiRepo.save(u);
	}

	public List<UserModel> getUser() {
		return apiRepo.findAll();
	}


	public List<UserModel> getAllUsers() {
		return apiRepo.findAll();	}

	public LoanApplicationModel viewLoan(int user) {
		return apiRepox.findById(user).get();
	}
	public String deleteLogin(int id) {
		apiRepo.deleteById(id);
		return id+ "deleted";
	}
	public UserModel editUserModel(int id,UserModel userModel) {
		UserModel UserModely = apiRepo.findById(id).orElse(null);
		if(UserModely != null) {
			UserModely.setId(userModel.getId());
			UserModely.setEmail(userModel.getEmail() );
			UserModely.setPassword(userModel.getPassword());
			UserModely.setUsername(userModel.getUsername());
			UserModely.setMobileNumber(userModel.getMobileNumber());
			UserModely.setUserRole(userModel.getUserRole());
			UserModely.setLoanId(userModel.getLoanId());
		
			return apiRepo.saveAndFlush(UserModely);
			
		}
		else {
			return null;
		}
 	}


	
}
