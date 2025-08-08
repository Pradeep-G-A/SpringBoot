package com.example.Day1;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
	@Value(" hidgvfdvnvdfknbjgndghfghg")
	private String data;
	@RequestMapping("/")

	public String Msg() {
		return"Hello"+data;
	}
}
