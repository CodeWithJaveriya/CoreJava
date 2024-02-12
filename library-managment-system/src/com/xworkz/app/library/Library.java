package com.xworkz.app.library;

import com.xworkz.app.constant.BookType;
import com.xworkz.app.dto.BookDTO;

import java.awt.print.Book;

public interface Library {

    public boolean addBook(BookDTO book);

    public void getAllBooks();

    public BookDTO getAllBooksByBookId(int bookId);

    public BookDTO[] getBookByBookYear(int bookYear);

    public BookDTO[] getBookByBookAuthorName(String authorName);

    public BookDTO[] getBookByBookPublisher(String publisherName);

    public String getBookNameByBookType(BookType type);

    public String[]  getBookNameByYearOfPublisher(int yearOfPublish);

    public boolean updateBookNameByBookId(int existingBookId, String updatedBookName);

    public boolean updateBookPriceByBookId(int existingBookId, double updatedPrice);

    public boolean updatePublisherByAuthorName(String existingAuthorName, String updatedPublisherName);

    public boolean deleteBooksByBookId(int bookId);


}
