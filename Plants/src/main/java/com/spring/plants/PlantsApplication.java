package com.spring.plants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication

@OpenAPIDefinition(
		info = @Info(
				title = "Plant Details",
				version = "1.2.3",
				description = "Details of Plants",
				contact = @Contact(
						name = "Pradeep",
						email = "gapradeep123@gmail.com"
						)
				)
		)



public class PlantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantsApplication.class, args);
	}

}
