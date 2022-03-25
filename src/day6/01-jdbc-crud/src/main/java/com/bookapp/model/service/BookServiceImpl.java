package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;

	public BookServiceImpl() {
		bookDao=new BookDaoImpl();//bad code
	}

	@Override
	public List<Book> getAll() {
		return bookDao.getAll();
	}

	@Override
	public void addBook(Book b) {
		bookDao.addBook(b);
	}

}
