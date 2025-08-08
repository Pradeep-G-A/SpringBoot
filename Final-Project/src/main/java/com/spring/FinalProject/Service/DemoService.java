package com.spring.FinalProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.FinalProject.Model.Demo;
import com.spring.FinalProject.Repository.DemoRepo;

@Service
public class DemoService {
	@Autowired
	private DemoRepo hello;
	
	public List<Demo> addUser(Demo u) {
		return hello.save(u)
	}
	
	
}
