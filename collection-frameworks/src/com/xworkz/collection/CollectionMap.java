package com.xworkz.collection;

import com.xworkz.collection.books.BooksDTO;
import com.xworkz.collection.constants.BookType;
import com.xworkz.collection.constants.Gender;
import com.xworkz.collection.constants.PaymentMode;
import com.xworkz.collection.constants.Review;
import com.xworkz.collection.ecommerce.CustomerDTO;
import com.xworkz.collection.patient.PatientDTO;

import java.util.*;

public class CollectionMap {

    public static void main(String[] args) {


        System.out.println("Integer and String map");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(2, "Rahul");
        map2.put(3, "Chudail");
        map2.put(4, "Rakshit");
        map2.put(5, "Kindle");
        String returned = map2.get(5);
        System.out.println(returned);

        Set<Map.Entry<Integer, String>> set2 = map2.entrySet();
        System.out.println("Fetching data using foreach loop");
        for(Map.Entry<Integer, String> entrySet : set2){
            System.out.println(entrySet.getKey());
            System.out.println(entrySet.getValue());
        }

        System.out.println("Fetching data through iterator");
        Iterator<Map.Entry<Integer, String>> itr2 =  set2.iterator();
        while(itr2.hasNext()){
               Map.Entry<Integer, String> entrySet =  itr2.next();
            System.out.println(entrySet.getKey());
            System.out.println(entrySet.getValue());
        }

        System.out.println("Fetching data through java8");
        set2.stream().forEach(System.out::println);


        System.out.println("Integer and PatientDTO map");
        Map<Integer, PatientDTO> map = new HashMap<>();
        map.put(1, new PatientDTO(2, "Ramya", 56, "Blore", Gender.female));
        map.put(2, new PatientDTO(1, "Kavya", 89, "Rajajinagar", Gender.female));
        map.put(3, new PatientDTO(3, "Raghu", 67,  "Jaginagar", Gender.male));
        map.put(4, new PatientDTO(5, "Basha", 89, "Dehli", Gender.male));
        map.put(5, new PatientDTO(4, "Raghu", 56, "Chikamanglur", Gender.male));

        //To fetch one particular data
        System.out.println(map.get(1));

        //To fetch all the data
        Set<Map.Entry<Integer,PatientDTO>> set = map.entrySet();
        for(Map.Entry<Integer, PatientDTO> entrySet : set){
            System.out.println(entrySet.getKey());
            System.out.println(entrySet.getValue());
        }


        //to fetch data through iterator
        Iterator<Map.Entry<Integer, PatientDTO>> itr1 = set.iterator();
        System.out.println("Fetching data through iterator");
        while(itr1.hasNext()){
            Map.Entry<Integer, PatientDTO> entrySet = itr1.next();
            System.out.println(entrySet.getKey());
            System.out.println(entrySet.getValue());
        }


        System.out.println("Integer and CustomerDTO map");
        Map<Integer, CustomerDTO> map1 = new HashMap<>();
        map1.put(1, new CustomerDTO(1, "Rahul", "rahul90@gmail.com", 468743439, "Banglore", PaymentMode.CashOnDelivery, Review.ThreeStar ));
        map1.put(2, new CustomerDTO(3, "Hemanth", "hema7856@gmail.com", 745693484, "Bellur", PaymentMode.GooglePay, Review.OneStar));
        map1.put(3, new CustomerDTO(2, "Vikas", "vikas4687367@gmail.com", 438957439, "Bagalkote", PaymentMode.Paytm, Review.FourStar));

        //To fetch only one particular data
        CustomerDTO isAdded = map1.get(2);
        System.out.println(isAdded);


        //to fetch entire data
        Set<Map.Entry<Integer, CustomerDTO>> set1 = map1.entrySet();

        for(Map.Entry<Integer, CustomerDTO> entrySet : set1){
            System.out.println(entrySet.getValue());
            System.out.println(entrySet.getKey());
        }


        //Another form of fetching the data
        //Iterator
        Iterator<Map.Entry<Integer, CustomerDTO>> itr = set1.iterator();
        System.out.println("Fetching the data through iterator");
        while(itr.hasNext()){
        Map.Entry<Integer , CustomerDTO>  emptySet =  itr.next();
            System.out.println(emptySet.getValue());
            System.out.println(emptySet.getKey());
        }


        System.out.println("Fetching data through java8");
        set1.stream().forEach(System.out::println);

        Map<BooksDTO, Integer> map3 = new HashMap<>();
        map3.put(new BooksDTO(2, "Game of Thrones", "Souzel", "Sapna Books",2012, 456, 5479.00,  BookType.Biography, 236984 ), 1);
        map3.put(new BooksDTO(1, "Yamha The Racer", "Gagan Gowda", "Arapana Books", 2018, 989, 348.90, BookType.Fiction, 632987) , 2);
        map3.put(new BooksDTO(4, "The Mircales", "Yaqoob", "Sapna Books", 2021, 567, 849.09, BookType.Mystery, 87439873) , 3);
        map3.put(new BooksDTO(3, "The Blood and Shed", "Royal Lambia", "Vahiyad Books", 1997, 643, 465.90, BookType.Novel, 4678346), 4);

        //to fetch a single data
        map3.get(3);

        //to fetch all the data
        Set<Map.Entry<BooksDTO, Integer>> set3 = map3.entrySet();
        for(Map.Entry<BooksDTO, Integer> emptySet : set3){
            System.out.println(emptySet.getValue());
            System.out.println(emptySet.getKey());
        }

        //to fetch data through iterator
        System.out.println("Fetching data through iterator");
        Iterator<Map.Entry<BooksDTO, Integer>> itr3 = set3.iterator();
        while(itr3.hasNext()){
         Map.Entry<BooksDTO, Integer> emptySet    = itr3.next();
            System.out.println(emptySet.getValue());
            System.out.println(emptySet.getKey());
            System.out.println(emptySet.getKey() + " " + emptySet.getValue());
        }

        System.out.println("To fetch data using java 8");
        set3.stream().forEach(System.out::println);


        Map<BooksDTO, Integer> map4 = new LinkedHashMap<>();
        map4.put(new BooksDTO(2, "Game of Thrones", "Souzel", "Sapna Books",2012, 456, 5479.00,  BookType.Biography, 236984 ), 5);
        map4.put(new BooksDTO(2, "Game of Thrones", "Souzel", "Sapna Books",2012, 456, 5479.00,  BookType.Biography, 236984 ), 1);
        map4.put(new BooksDTO(1, "Yamha The Racer", "Gagan Gowda", "Arapana Books", 2018, 989, 348.90, BookType.Fiction, 632987) , 2);
        map4.put(new BooksDTO(4, "The Mircales", "Yaqoob", "Sapna Books", 2021, 567, 849.09, BookType.Mystery, 87439873) , 3);
        map4.put(new BooksDTO(3, "The Blood and Shed", "Royal Lambia", "Vahiyad Books", 1997, 643, 465.90, BookType.Novel, 4678346), 4);

        System.out.println("Exchanging Key and value pairs");
        Set<Map.Entry<BooksDTO, Integer>> set4 = map4.entrySet();
        for (Map.Entry<BooksDTO, Integer> emptySet : set4){
            System.out.println(emptySet.getKey() + " " + emptySet.getValue());
        }
// getKey() - it internally invokes equals and hashCode method

    }



}
