package com.example.booksapi.controllers;

import com.example.booksapi.models.Book;
import com.example.booksapi.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksApi {

  private final BookService bookService;

  public BooksApi(BookService bookService) {
    this.bookService = bookService;
  }

  @PostMapping(value = "/api/books/create")
  public Book createBook(@RequestBody Book book) {
    return bookService.createBook(book);
  }

  @RequestMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
  public void destroy(@PathVariable("id") Long id) {
    bookService.deleteBook(id);
  }

  @PostMapping(value = "/api/books/update")
  public Book updateBook(@RequestBody Book book) {
    return bookService.createBook(book);
  }

  @GetMapping("/api/books/delete")
  public void deleteBook(@RequestParam Long id){
    this.bookService.deleteBook(id);
  }
}
