package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.BookDaoImpl;
import com.bookapp.model.dao.BookDaoImplHib;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;

	public BookServiceImpl() {
		bookDao=new BookDaoImplHib();//bad code
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
