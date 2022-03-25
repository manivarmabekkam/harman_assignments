package com.bookapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

@RestController//@Controller+ @ResponseBody
@RequestMapping(path="api")
public class BookRestController {
	
	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}
	
	//------get all books-----@GetMapping
	
	@GetMapping(path = "books")
	public List<Book> getAll(){
		return bookService.getAllBooks();
	}
	
	//Pathvariable		vs RequestParam
	//------get an book-----@GetMapping
	
	@GetMapping(path = "books/{id}")
	public Book getAnBook(@PathVariable(name = "id") int id){
		return bookService.getBookById(id);
	}
	
	//------add an book-----@PostMapping--@RequestBody it will convert json to java
	@PostMapping(path = "books")
	public Book addAnBook(@RequestBody Book book){
		return bookService.addBook(book);
	}
	
	//------delete an book-----@DeleteMapping
	@DeleteMapping(path = "books/{id}")
	public Book deleteAnBook(@PathVariable(name = "id") int id){
		return bookService.deleteBook(id);
	}
	
	//------update the book-----@PostMapping
	@PutMapping(path = "books/{id}")
	public Book updateAnBook(@PathVariable(name = "id") int id,   @RequestBody Book book){
		return bookService.updateBook(id, book);
	}

}
