package com.librarymanagement.model;

public class Person {

    private int personId;
    private String name;

    // Constructor
    public Person(int personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    // Getters
    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Display
    public void displayPersonDetails() {
        System.out.println("Person ID : " + personId);
        System.out.println("Name      : " + name);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Person ID: " + personId +
                ", Name: " + name;
    }
}