package com.bookapp.web.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

@Controller
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	//show all the books into jsp page
	@GetMapping(path = "allbooks")
	public ModelAndView getAllBooks(ModelAndView mv){
		mv.addObject("books", bookService.getAll());
		mv.setViewName("show");
		return mv;
	}
	
	
	
//	@GetMapping(path = "hellourl")
//	public ModelAndView hello(ModelAndView mv) {
//		mv.setViewName("show");
//		mv.addObject("message", "i love teaching food and traveling");
//		return mv;//put into request scope and then we do request dispaching to to the jsp page?
//	}
}
