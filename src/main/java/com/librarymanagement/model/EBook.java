package com.librarymanagement.model;

public class EBook extends Book {

    private double fileSize;


    public EBook(int id,
                 String title,
                 String author,
                 String status,
                 double fileSize) {

        super(id, title, author, status, String.valueOf(fileSize));

        this.fileSize = fileSize;
    }


    public double getFileSize() {
        return fileSize;
    }


    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }


    public void displayFileSize() {

        System.out.println("File Size: " + fileSize + " MB");

    }


    @Override
    public String toString() {

        return super.toString() +
                ", File Size: " + fileSize + " MB";
    }
}