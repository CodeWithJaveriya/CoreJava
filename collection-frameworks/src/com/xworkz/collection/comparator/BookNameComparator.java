package com.xworkz.collection.comparator;

import com.xworkz.collection.books.BooksDTO;

import java.util.Comparator;

public class BookNameComparator implements Comparator<BooksDTO> {


    @Override
    public int compare(BooksDTO o1, BooksDTO o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
}
