package com.xworkz.app.dto;

import com.xworkz.app.constant.BookType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BookDTO {

   private int bookId;
   private String bookName;
    private String authorName;
    private String publisher;
    private int yearOfPublish;
    private int noOfPages;
    private double price;
    private BookType bookType;
    private int bookNo;
}
