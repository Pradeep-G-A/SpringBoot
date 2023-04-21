package com.example.Day02.programs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Phones {
	@Value("Samsung")
	private String company;
	@Value("50")
	private int camara;
	@Value("Snapdragon720")
	private String processor;
	@RequestMapping("/fello")
	@ResponseBody
	public String Data() {
		return "Company:" +company+"<br>" + "Camara:" +camara+ "<br>"+"Processor:" +processor;
	}
}
