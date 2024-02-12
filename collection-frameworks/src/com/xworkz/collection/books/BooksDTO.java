package com.xworkz.collection.books;


import com.xworkz.collection.constants.BookType;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BooksDTO implements Comparable<BooksDTO>{

    private int bookId;
    private String bookName;
    private String authorName;
    private String publisher;
    private int yearOfPublish;
    private int noOfPages;
    private double price;
    private BookType bookType;
    private int bookNo;


    @Override
    public int hashCode() {
        return this.bookId;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Invocking equals values");
        BooksDTO dto =(BooksDTO) obj;
        if(this instanceof BooksDTO){
            System.out.println("Comparing values");
            if(this.hashCode() == dto.hashCode() && this.bookName.equals(dto.bookName) && this.authorName.equals(dto.authorName) && this.publisher.equals(dto.publisher) && this.yearOfPublish == dto.yearOfPublish && this.noOfPages == dto.noOfPages && this.price == dto.price && this.bookNo == dto.bookNo){
                return true;
            }else{
                System.out.println("Cannot have same values");
            }
        }
        return false;
    }

    @Override
    public int compareTo(BooksDTO o) {
        return this.bookId - o.bookId;
    }



}
