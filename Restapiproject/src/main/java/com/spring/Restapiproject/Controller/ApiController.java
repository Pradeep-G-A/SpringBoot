package com.spring.Restapiproject.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.spring.Restapiproject.Model.UserModel;
import com.spring.Restapiproject.Service.ApiService;





@RestController
@CrossOrigin("http://localhost:3000")
public class ApiController {
	@Autowired
	private ApiService service;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> loginData) {
		String email=loginData.get("email");
		String password=loginData.get("Password");
		String result=service.login(email, password);
		return result;
		
	}
	

	@PostMapping("/adduser")
	public UserModel AddUser(@RequestBody UserModel userModel) {
		return service.addUser(userModel);
	}
	
	@GetMapping("/get")
	public List<UserModel> listAll() {
		return service.getUser();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		service.deleteLogin(id);
		return "Deleted";
	}
	@PutMapping("/{id}")
	public UserModel update(@PathVariable int id, @RequestBody UserModel userModel) {
		return service.editUserModel(id, userModel);
	}
}
