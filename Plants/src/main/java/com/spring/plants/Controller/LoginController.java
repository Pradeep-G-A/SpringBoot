package com.spring.plants.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.plants.Model.LoginModel;
import com.spring.plants.Service.LoginService;

@RestController
@RequestMapping("/plantss")
public class LoginController {
	@Autowired
	 private LoginService service;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> loginData) {
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=service.checkLogin(username, password);
		return result;
		
	}
	@PostMapping("/adduser")
	public LoginModel AddUser(@RequestBody LoginModel loginModel) {
		return service.addUser(loginModel);
	}
	@GetMapping
	public List<LoginModel> listAll() {
		return service.getUser();
	}

}
