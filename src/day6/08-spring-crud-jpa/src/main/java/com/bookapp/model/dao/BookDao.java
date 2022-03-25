package com.bookapp.model.dao;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//spring data is a declerative way of writing crud ie dao layer :)

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
	public List<Book> findByTitle(String title);
}
