package com.application.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.springboot.model.Books;
import com.application.springboot.repository.BooksRepository;

@RestController
@RequestMapping("/api/books")
public class BooksController {
	@Autowired
private BooksRepository booksRepo;
@GetMapping
public List<Books> getBooks(){
	return this.booksRepo.findAll();
}
@PostMapping
public Books addBooks(@RequestBody Books data) {
	return this.booksRepo.save(data);
}
	
}
