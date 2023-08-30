package com.example.booksapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class BooksApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(BooksApiApplication.class, args);
  }

}
