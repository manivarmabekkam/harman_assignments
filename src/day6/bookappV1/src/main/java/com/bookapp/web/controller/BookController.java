package com.bookapp.web.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

@WebServlet("/bookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookService bookService;

	public BookController() {
		bookService = new BookServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get data from service layer
		String action = request.getParameter("action");
		if (action.equals("showall")) {
			List<Book> books = bookService.getAll();

			// put data into request scope
			request.setAttribute("books", books);

			// request dispache to jsp
			RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
			rd.forward(request, response);
		} else if (action.equals("addbook")) {
			RequestDispatcher rd = request.getRequestDispatcher("addbook.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String title=request.getParameter("title");
		Double price= Double.parseDouble(request.getParameter("price"));
		
		Book book=new Book(title, price);
		bookService.addBook(book);
		//double form submission problem ? //PRG pattern
		response.sendRedirect("bookController?action=showall");
	}
	
	
}
