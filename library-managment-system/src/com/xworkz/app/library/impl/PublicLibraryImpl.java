package com.xworkz.app.library.impl;

import com.xworkz.app.constant.BookType;
import com.xworkz.app.dto.BookDTO;
import com.xworkz.app.library.Library;

import java.util.Arrays;

public class PublicLibraryImpl implements Library {

    public BookDTO book[];

    int index ;


    public PublicLibraryImpl(int size){
    book = new BookDTO[size];
    }

    int id;
    @Override
    public boolean addBook(BookDTO book){
        boolean isAdded = false;

        if(book != null){
            book.setBookId(++id);
            this.book[index++] = book;
        isAdded = true;
        }else{
            System.out.println("Cannot add book at null value");
        }
        return isAdded;
    }

    @Override
    public void getAllBooks(){
        for(int index = 0; index < book.length; index++){
            System.out.println(book[index]);
        }
    }

    @Override
    public BookDTO getAllBooksByBookId(int bookId){
     BookDTO dto = null;
     for(int index = 0; index < book.length; index++) {
         if (book[index].getBookId() == bookId) {
             dto = book[index];
         }
     }
     return  dto;
    }

    @Override
    public BookDTO[] getBookByBookYear(int bookYear){
        BookDTO[] dto1 = null;
        int newIndex = 0;
        for(int index = 0; index < book.length; index++) {
            if (book[index].getYearOfPublish() == bookYear) {
                newIndex++;
            }
        }

            dto1 = new BookDTO[newIndex];
            newIndex = 0;
            for (index = 0; index < book.length; index++) {
                if (book[index].getYearOfPublish() == bookYear) {
                    book[newIndex++] = this.book[index];
                }
        }
        return dto1;
    }

    @Override
    public BookDTO[] getBookByBookAuthorName(String authorName){
        BookDTO[] dto = null;
        int newIndex =0;
        for(int index = 0; index < book.length; index++) {
            if (book[index].getAuthorName().equals(authorName)) {
                newIndex++;
            }
        }
            dto = new BookDTO[newIndex];
            newIndex = 0;
            for(index = 0; index <book.length ; index++){
                if(book[index].getAuthorName().equals(authorName)){
                dto[newIndex++] = this.book[index];
            }
        }
        return dto;
    }

    @Override
    public BookDTO[] getBookByBookPublisher(String publisherName){
        BookDTO[] dto = null;
        int newIndex =0;
        for(int index = 0; index < book.length; index++){
            if(book[index].getPublisher().equals(publisherName)){
              newIndex++;
            }
        }
        dto = new BookDTO[newIndex];
        newIndex = 0;
        for(index = 0; index < book.length; index++){
            if(book[index].getPublisher().equals(publisherName)){
                dto[newIndex++] = this.book[index];
            }
        }
        return dto;
    }


    @Override
    public String getBookNameByBookType(BookType type){
        String bookName = null;
        for(int index = 0; index < book.length; index++){
            if(book[index].getBookType().equals(type)){
                bookName = book[index].getBookName();
            }
        }
       return bookName;
    }

    @Override
    public String[]  getBookNameByYearOfPublisher(int yearOfPublish){
        String[] bookName ;
        int newIndex = 0;
        for(int index = 0; index < book.length; index++){
            if(book[index].getYearOfPublish() == yearOfPublish){
                newIndex++;
            }
        }
        bookName = new String[newIndex];
        newIndex = 0;
        for(index = 0; index < book.length; index++){
            if(book[index].getYearOfPublish() == yearOfPublish){
                bookName[newIndex++] = this.book[index].getBookName();
            }
        }
        return bookName;
    }
    @Override
    public boolean updateBookNameByBookId(int existingBookId, String updatedBookName){
        boolean isUpdated = false;
        for(int index = 0; index < book.length; index++){
            if(book[index].getBookId() == existingBookId){
                book[index].setBookName(updatedBookName);
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public boolean updateBookPriceByBookId(int existingBookId, double updatedPrice){
        boolean isUpdated = false;
        for(int index = 0; index < book.length; index++){
            if(book[index].getBookId() == existingBookId){
                book[index].setPrice(updatedPrice);
                isUpdated = true;
            }
        }
        return isUpdated;
    }


    @Override
    public boolean updatePublisherByAuthorName(String existingAuthorName, String updatedPublisherName){
        boolean isUpdated = false;
        for(int index = 0; index < book.length; index++){
            if(book[index].getAuthorName().equals(existingAuthorName)){
              book[index].setPublisher(updatedPublisherName);
              isUpdated = true;
            }
        }
        return isUpdated;
    }

    @Override
    public boolean deleteBooksByBookId(int bookId){
        boolean isDeleted = false;
        int index , newIndex;
        for(index =0, newIndex =0; index < book.length; index++){
            if(!(book[index].getBookId() == bookId)){
                book[newIndex++] = this.book[index];
                isDeleted = true;
            }
        }
        book = Arrays.copyOf(book, newIndex);
        return isDeleted;
    }


}
