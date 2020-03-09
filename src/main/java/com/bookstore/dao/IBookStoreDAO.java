package com.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Book;

 @Repository
public interface IBookStoreDAO extends JpaRepository<Book, Integer> {

	 Book findById(int id);
}
