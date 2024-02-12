package com.xworkz.app;

import com.xworkz.app.constant.BookType;
import com.xworkz.app.dto.BookDTO;
import com.xworkz.app.library.impl.PublicLibraryImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of books ");
      PublicLibraryImpl lib = new PublicLibraryImpl(sc.nextInt());
      for(int index = 0; index < lib.book.length; index++) {
          BookDTO dto = new BookDTO();
         // System.out.println("Enter the BookId : ");
         // dto.setBookId(sc.nextInt());
          System.out.println("Enter the Book name : ");
          dto.setBookName(sc.next());
          System.out.println("Enter the Book author name : ");
          dto.setAuthorName(sc.next());
          System.out.println("Enter the Book publisher name : ");
          dto.setPublisher(sc.next());
          System.out.println("Enter the year of publish: ");
          dto.setYearOfPublish(sc.nextInt());
          System.out.println("Enter the no of pages : ");
          dto.setNoOfPages(sc.nextInt());
          System.out.println("Enter the book price: ");
          dto.setPrice(sc.nextDouble());
          System.out.println("Enter the book type : ");
          dto.setBookType(BookType.valueOf(sc.next()));
          System.out.println("Enter the Book number : ");
          dto.setBookNo(sc.nextInt());

          lib.addBook(dto);
      }

      String userInput = null;
      do{
        System.out.println("Press 1 to get all books");
        System.out.println("Press 2 to get all books by book id");
        System.out.println("Press 3 to get all books by year of publish ");
        System.out.println("Press 4 to get all books by  author name");
        System.out.println("Press 5 to get all books by  publisher name");
        System.out.println("Press 6 to get book type by book name");
        System.out.println("Press 7 to get book type by book name");
        System.out.println("Press 8 to update book name by book id");
        System.out.println("Press 9 to update book price by book id");
        System.out.println("Press 10 to update publisher name by author name");
        System.out.println("Press 11 to delete book by book id");


          int options = sc.nextInt();
      switch (options){
          case 1: lib.getAllBooks();
          break;

          case 2: System.out.println("Enter the book id to get all details of books");
          BookDTO book = lib.getAllBooksByBookId(sc.nextInt());
          System.out.println(book);
          break;

          case 3: System.out.println("Enter the year of publish to get all details of books ");
          BookDTO[] book1 = lib.getBookByBookYear(sc.nextInt());
         /* for(int i =0; i < book1.length; i++){
              System.out.println(book1[i].getBookName());
              System.out.println(book1[i].getBookId());
          }*/
            System.out.println(Arrays.toString(book1));

          break;

          case 4: System.out.println("Enter the author name to get all details of book");
          BookDTO[] book2 = lib.getBookByBookAuthorName(sc.next());
          System.out.println(Arrays.toString(book2));

          break;

          case 5: System.out.println("Enter the publisher name to get all details of book ");
          BookDTO[] book3 = lib.getBookByBookPublisher(sc.next());
          System.out.println(Arrays.toString(book3));
          break;

          case 6: System.out.println("Enter the book type to get book name");
          String bookName = lib.getBookNameByBookType(BookType.valueOf(sc.next()));
          System.out.println(bookName);
          break;

          case 7 : System.out.println("Enter the year of publish to get book name");
          String[] bookName1  = lib.getBookNameByYearOfPublisher(sc.nextInt());
          System.out.println(Arrays.toString(bookName1));

          case 8 : System.out.println("Enter the book id and book name to be updated ");
         boolean isNameUpdated =  lib.updateBookNameByBookId(sc.nextInt(), sc.next());
         System.out.println(isNameUpdated);
         break;

          case 9 : System.out.println("Enter the book id and updated book price");
          boolean isPriceUpdated = lib.updateBookPriceByBookId(sc.nextInt(), sc.nextDouble());
          System.out.println(isPriceUpdated);
          break;

          case 10 : System.out.println("Enter the author name and publisher name to be updated ");
          boolean isPublisherNameUpdated = lib.updatePublisherByAuthorName(sc.next(), sc.next());
          System.out.println(isPublisherNameUpdated);
          break;

          case 11 : System.out.println("Enter the book id to delete books");
          boolean isBookDeleted = lib.deleteBooksByBookId(sc.nextInt());
          System.out.println(isBookDeleted);
          break;

          default: System.out.println("Choose one of the options from above!!!!");
          break;

      }
      System.out.println("Do you want to continue Yes/ No");
      userInput = sc.next();
    }while(userInput.equals("Yes"));
      System.out.println("Thank you!! Visit Again!!");
}
}
