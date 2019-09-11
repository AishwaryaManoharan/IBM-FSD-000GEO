package com.example.springh2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springh2.repository.BookRepository;

@Controller
@RequestMapping("/api")
public class BookController {
	
	private BookRepository bookRepository;
	
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@RequestMapping("/books")
	public String getAllBooks(Model theModel)
	{
		theModel.addAttribute("books",bookRepository.findAll());
		return "books";
	}

}