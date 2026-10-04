package com.librarymanagement.model;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private String address;
    private ArrayList<Book> books;

    // Constructor
    public Library(String libraryName, String address) {

        this.libraryName = libraryName;
        this.address = address;
        this.books = new ArrayList<>();

    }

    // Getters
    public String getLibraryName() {
        return libraryName;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int getTotalBooks() {
        return books.size();
    }

    // Setters
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Add Book
    public void addBook(Book book) {

        books.add(book);

        System.out.println("Book added successfully.");
        System.out.println();

    }

    // Remove Book
    public void removeBook(Book book) {

        if (books.remove(book)) {

            System.out.println("Book removed successfully.");

        } else {

            System.out.println("Book not found.");

        }

        System.out.println();

    }

    // Display Library Information
    public void displayLibraryDetails() {

        System.out.println("Library Name : " + libraryName);
        System.out.println("Address      : " + address);
        System.out.println("Total Books  : " + getTotalBooks());

        System.out.println();

    }

    // Display All Books
    public void displayBooks() {

        if (books.isEmpty()) {

            System.out.println("No books available.");

            return;

        }

        for (Book book : books) {

            System.out.println(book);
            System.out.println();

        }

    }

}