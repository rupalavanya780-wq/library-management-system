package com.librarymanagement.model;

public class Book {

    private int id;
    private String title;
    private String author;
    private String status;
    private String notesFile;


    public Book() {
    }


    public Book(
            int id,
            String title,
            String author,
            String status,
            String notesFile) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
        this.notesFile = notesFile;
    }


    // ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    // Title

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    // Author

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    // Status

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    // Notes File

    public String getNotesFile() {
        return notesFile;
    }

    public void setNotesFile(String notesFile) {
        this.notesFile = notesFile;
    }
}