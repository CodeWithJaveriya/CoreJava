package com.xworkz.practice.listpractice.customclasses;

import java.util.LinkedList;

public class BookTester {

    public static void main(String[] args) {

        Book book = new Book(1, "The Faults In Our Stars", "Javeriya Taj");
        Book book1 = new Book(2,"Atomic Habits", "Thouqir");


        LinkedList<Book> list = new LinkedList<>();
        list.add(book);
        list.add(book1);
        list.add( new Book(3, "The Power Of Now", "Sufiyah"));
        System.out.println(list);

    }
}
