package com.bookapp.web.controller;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookapp.config.AppConfig;
import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		BookService bookService= (BookService) ctx.getBean("bookService");
		
		List<Book>books=bookService.getAll();
		for(Book book: books) {
			System.out.println(book);
		}
//		Book book=new Book("effective java", 400);
//		bookService.addBook(book);
	}
}
