package com.abhii.library.service;

import com.abhii.library.entity.Book;
import java.util.List;

public interface BookService {

    Book addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Long id);
}