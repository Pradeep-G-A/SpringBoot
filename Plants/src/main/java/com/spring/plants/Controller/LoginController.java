package com.spring.plants.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.plants.Model.LoginModel;
import com.spring.plants.Service.LoginService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/plantss")
public class LoginController {
	@Autowired
	 private LoginService service;
	@Tag(name = "Login",description = "Login Initial Point")
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> loginData) {
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=service.checkLogin(username, password);
		return result;
		
	}
	@Tag(name = "AddUser",description = "Adding the user data")
	@PostMapping("/adduser")
	public LoginModel AddUser(@RequestBody LoginModel loginModel) {
		return service.addUser(loginModel);
	}
	
	@Tag(name = "EditUser",description = "Editing the user data")
	@PutMapping("/edituser/{id}")
	public LoginModel update(@PathVariable int id,@RequestBody LoginModel loginModel) {
		return service.editLogin(id, loginModel);
	}
	
	@Tag(name = "Login Details",description = "Getting The Data")
	@GetMapping
	public List<LoginModel> listAll() {
		return service.getUser();
	}
	
	
	@Tag(name = "Login Details",description = "Getting The Data by ID")
	@GetMapping("/{id}")
	public Optional<LoginModel> listAllbyId(@PathVariable int id) {
		return service.getUserbyId(id);
	}
	
	
	
	@Tag(name = "Deletion",description = "Deleting The Data")
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") int id) {
		service.deleteLogin(id);
		return "Deleted";
	}

	//sorting
	@GetMapping("/sortdes/(alogin)")
	public List<LoginModel> sortLogin(@PathVariable("alogin") String alogin)
	{
		return service.sortDesc(alogin);
	}
	
	//pagination
	@GetMapping("/pagination/{aname}/{acountry}")
	public List<LoginModel> paginationDate(@PathVariable("aname") int name, @PathVariable("country") int country)
	{
		return service.paginationData(name, country);
		
	}
	
	//pagination and sorting
		@GetMapping("/paginationSorting/{aname}/{acountry}/{alogin}")
		public List<LoginModel> paginationSorting(@PathVariable("aname") int name,@PathVariable("acountry") int country ,@PathVariable("alogin") String alogin)
		{
			return service.paginationDataSort(name, country, alogin);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
