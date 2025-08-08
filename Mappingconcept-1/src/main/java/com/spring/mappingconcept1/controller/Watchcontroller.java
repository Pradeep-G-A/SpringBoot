package com.spring.mappingconcept1.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mappingconcept1.Model.Watch;
import com.spring.mappingconcept1.service.Watchservice;

@RestController
@RequestMapping("/api")
public class Watchcontroller {
	@Autowired
	private Watchservice dd;
	 
	
	@GetMapping
	public List<Watch> read()
	{
		return dd.getWatch();
	}
	

}
