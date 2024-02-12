package com.xworkz.practice.hashsetpractice.custom;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class BookTester {
    public static void main(String[] args) {

        HashSet<BookDTO> book = new HashSet<>();
        book.add(new BookDTO(1,"The Stars","Taskin"));
        book.add(new BookDTO(2,"Yunches","Yaktu"));
        System.out.println(book);


    }
}
