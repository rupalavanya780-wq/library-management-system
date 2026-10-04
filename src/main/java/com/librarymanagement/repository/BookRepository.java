package com.librarymanagement.repository;

import com.librarymanagement.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final List<Book> books = new ArrayList<>();


    public BookRepository() {

        books.add(new Book(
                10145,
                "Java Programming",
                "James Gosling",
                "Available",
                "java-programming.pdf"
        ));


        books.add(new Book(
                27801,
                "Python Programming",
                "Guido Van Rossum",
                "Available",
                "python-programming.pdf"
        ));


        books.add(new Book(
                10148,
                "PHP",
                "S. Balagurusamy",
                "Not Available",
                "php.pdf"
        ));
    }


    // Add Book

    public void addBook(Book book) {

        books.add(book);
    }


    // Get All Books

    public List<Book> getAllBooks() {

        return books;
    }


    // Get Book By ID

    public Book getBookById(int bookId) {

        for (Book book : books) {

            if (book.getId() == bookId) {

                return book;
            }
        }

        return null;
    }


    // Update Book

    public boolean updateBook(
            int bookId,
            Book updatedBook) {

        Book existingBook =
                getBookById(bookId);

        if (existingBook != null) {

            existingBook.setTitle(
                    updatedBook.getTitle()
            );

            existingBook.setAuthor(
                    updatedBook.getAuthor()
            );

            existingBook.setStatus(
                    updatedBook.getStatus()
            );

            existingBook.setNotesFile(
                    updatedBook.getNotesFile()
            );

            return true;
        }

        return false;
    }


    // Delete Book

    public boolean deleteBook(int bookId) {

        Book book =
                getBookById(bookId);

        if (book != null) {

            books.remove(book);

            return true;
        }

        return false;
    }
}