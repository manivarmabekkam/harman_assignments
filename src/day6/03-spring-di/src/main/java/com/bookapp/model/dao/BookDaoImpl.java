package com.bookapp.model.dao;

import java.util.*;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Primary
@Repository
public class BookDaoImpl implements BookDao {
	// connection factory
	private Connection connection;

	public BookDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Book> getAll() {
		List<Book> books = new ArrayList<Book>();
		Book tempBook;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from books");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				tempBook = new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3));// rs to object :(
				books.add(tempBook);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public void addBook(Book b) {
		try {
			PreparedStatement pstmt = 
					connection.prepareStatement("insert into books(title, price) values(?,?)");
			pstmt.setString(1, b.getTitle());
			pstmt.setDouble(2, b.getPrice());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
