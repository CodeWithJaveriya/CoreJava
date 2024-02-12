package com.xworkz.collection.books;

import com.xworkz.collection.comparator.BookNameComparator;
import com.xworkz.collection.constants.BookType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookTester {

    public static void main(String[] args) {

        List<BooksDTO> books = new ArrayList<>();
        books.add(new BooksDTO(2, "Game of Thrones", "Souzel", "Sapna Books",2012, 456, 5479.00,  BookType.Biography, 236984));
        books.add(new BooksDTO(1, "Yamha The Racer", "Gagan Gowda", "Arapana Books", 2018, 989, 348.90, BookType.Fiction, 632987));
        books.add(new BooksDTO(4, "The Mircales", "Yaqoob", "Sapna Books", 2021, 567, 849.09, BookType.Mystery, 87439873));
        books.add(new BooksDTO(3, "The Blood and Shed", "Royal Lambia", "Vahiyad Books", 1997, 643, 465.90, BookType.Novel, 4678346));


        Collections.sort(books);
        System.out.println("Sorting books through book id");
        for(BooksDTO dto : books){
            System.out.println(dto);
        }
        Collections.sort(books, new BookNameComparator());
        System.out.println("Sorting book through book name");
        for(BooksDTO dto : books){
            System.out.println(dto);
        }



        //Java 8 features
/*        System.out.println("Sorting in the form of id");
        books.stream().sorted().collect(Collectors.toList());
        for (BooksDTO book:books) {
            System.out.println(book);
        }

        System.out.println("Sorting in the form of author name");
        books.stream().sorted(Comparator.comparing(BooksDTO::getAuthorName)).collect(Collectors.toList());
        for (BooksDTO book:books) {
            System.out.println(book);
        }*/


    }



}
