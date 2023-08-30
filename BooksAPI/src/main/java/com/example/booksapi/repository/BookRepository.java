package com.example.booksapi.repository;


import com.example.booksapi.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {


}
