package com.xworkz.practice.listpractice.customclasses;

import lombok.ToString;

@ToString
public class Student {

    int rollNo;
    String name;
    String address;

    public Student(int rollNo, String name, String address){
        this.rollNo = rollNo;

        this.name = name;

        this.address = address;
    }
}
