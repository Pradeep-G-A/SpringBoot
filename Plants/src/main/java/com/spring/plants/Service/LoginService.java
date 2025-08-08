package com.spring.plants.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public  Optional<LoginModel> getUserbyId(int id) {
		return repository.findById(id);
	}
	
	public LoginModel editLogin(int id,LoginModel loginModel) {
		LoginModel loginModely =repository.findById(id).orElse(null);
		if(loginModely != null) {
			loginModely.setUsername(loginModel.getUsername());
			loginModely.setPassword(loginModel.getPassword());
			loginModely.setName(loginModel.getName());
			loginModely.setAge(loginModel.getAge());
			loginModely.setEmail(loginModel.getEmail());
			loginModely.setPhone(loginModel.getPhone());
			loginModely.setAddress(loginModel.getAddress());
			loginModely.setState(loginModel.getState());
			loginModely.setCountry(loginModel.getCountry());
			
			return repository.saveAndFlush(loginModely);
		}
		else {
			return null;
		}
	}
	
	
	public String deleteLogin(int id) {
		repository.deleteById(id);
		return id+ "deleted";
	}
	
	//sorting
	public List<LoginModel> sortDesc(String alogin)
	{
		return repository.findAll(Sort.by(alogin).ascending());
	}
	
	//pagination
	public List<LoginModel> paginationData(int pageNu, int pageSize)
	{
		Page<LoginModel> b=repository.findAll(PageRequest.of(pageNu, pageSize));
		return b.getContent();
	}

	//pagination & sorting
	public List<LoginModel> paginationDataSort(int pageNu,int pageSize,String col)
	{
		Page<LoginModel> b=repository.findAll(PageRequest.of(pageNu, pageSize,Sort.by(col).ascending()));
		return b.getContent();
	}
	
	
	
	
}
