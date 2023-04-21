package com.example.Day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Message {
	@RequestMapping("/")
	@ResponseBody
	public String Msg() {
		return"Hello";
	}
}
