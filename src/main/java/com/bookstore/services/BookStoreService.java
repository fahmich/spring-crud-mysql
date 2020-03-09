package com.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dao.IBookStoreDAO;
import com.bookstore.entity.Book;

@Service
public class BookStoreService implements IBookStoreService {
	
	@Autowired
	private IBookStoreDAO dao;

	@Override
	public List<Book> getBooks() {
		return dao.findAll() ;
	}

	@Override 
	public Book createBook(Book book) {
		return dao.save(book);
	}

	@Override
	public Book updateBook( Book book) {
		return dao.save(  book);
	}

	@Override
	public Book getBook(int bookId) {
		return dao.findById(bookId);
	}

	@Override
	public boolean deleteBook(int bookId) {
		 dao.delete(bookId);
		 return true;
	}

}
