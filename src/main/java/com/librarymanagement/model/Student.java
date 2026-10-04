package com.librarymanagement.model;

public class Student extends Person {

    private String department;

    public Student(int personId, String name, String department) {

        super(personId, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayStudentDetails() {

        displayPersonDetails();
        System.out.println("Department : " + department);
        System.out.println();

    }

    @Override
    public String toString() {

        return super.toString() +
                ", Department: " + department;

    }
}