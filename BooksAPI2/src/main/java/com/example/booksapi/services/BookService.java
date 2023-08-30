package com.example.booksapi.services;

import com.example.booksapi.models.Book;
import com.example.booksapi.repository.BookRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }


  public void deleteBook(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id);
    if (optionalBook.isPresent()) {
      bookRepository.deleteById(id);
    }
  }

  public Book createBook(Book book) {
    return bookRepository.save(book);
  }


  public Book updateBook(Book book) {
    return bookRepository.save(book);
  }
}