package com.librarymanagement.service;

import com.librarymanagement.model.Book;
import com.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> getAllBooks() {

        return bookRepository.getAllBooks();
    }


    public Book getBookById(int bookId) {

        return bookRepository.getBookById(bookId);
    }


    public void addBook(Book book) {

        bookRepository.addBook(book);
    }


    public boolean updateBook(
            int bookId,
            Book book) {

        return bookRepository.updateBook(
                bookId,
                book
        );
    }


    public boolean deleteBook(int bookId) {

        return bookRepository.deleteBook(bookId);
    }
}