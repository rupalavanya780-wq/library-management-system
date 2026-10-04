package com.librarymanagement.controller;

import com.librarymanagement.model.Book;
import com.librarymanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    // Display all books
    @GetMapping("/books")
    public String books(Model model) {

        model.addAttribute("books", bookService.getAllBooks());

        return "books";
    }


    // Show Add Book Form
    @GetMapping("/add-book")
    public String addBookForm(Model model) {

        model.addAttribute("book", new Book());

        return "add-book";
    }


    // Add Book
    @PostMapping("/add-book")
    public String addBook(@ModelAttribute Book book) {

        bookService.addBook(book);

        return "redirect:/books";
    }


    // Show Edit Book Form
    @GetMapping("/edit-book/{id}")
    public String editBookForm(
            @PathVariable int id,
            Model model) {

        Book book = bookService.getBookById(id);

        if (book == null) {
            return "redirect:/books";
        }

        model.addAttribute("book", book);

        return "edit-book";
    }


    // Update Book
    @PostMapping("/edit-book/{id}")
    public String updateBook(
            @PathVariable int id,
            @ModelAttribute Book book) {

        bookService.updateBook(id, book);

        return "redirect:/books";
    }


    // Delete Book
    @GetMapping("/delete-book/{id}")
    public String deleteBook(@PathVariable int id) {

        bookService.deleteBook(id);

        return "redirect:/books";
    }
}