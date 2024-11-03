package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    private int rollNo;
    private String firstName;
    private String lastName;
    private String grades;

    @Autowired
    @Qualifier("createAddress2")
    private Address address;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

//    Only required while injecting manually not in case of @Autowired
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

        public String getGrades() {
            return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void displayDetails() {
        System.out.println("Name : "+this.firstName+" "+this.lastName);
        System.out.println("Roll Number : "+this.rollNo);
        System.out.println("Grades : "+this.grades);
        System.out.println("Address : "+this.address.addressDisplay());
    }
}
