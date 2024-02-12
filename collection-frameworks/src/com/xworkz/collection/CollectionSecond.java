package com.xworkz.collection;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import sun.net.TelnetInputStream;

import java.util.*;

public class CollectionSecond {

    public static void main(String[] args) {

        //normal array
        String cityNames[] = new String[4];
        cityNames[0] = "Banglore";
        cityNames[1] = "Bhutan";
        cityNames[2] = "Chinsandar";
        cityNames[3] = "Xavier";
        System.out.println(cityNames);


        //list interface
        List<String> cityName = new ArrayList<>();
        cityName.add("Banglore");
        cityName.add("Shivajinagar");
        cityName.add("NehruNagar");
        cityName.add("Banglore");
        cityName.add("Shivajinagar");
        cityName.add("NehruNagar");
        cityName.add(null);
        cityName.add(null);
        cityName.add(null);
        cityName.add(2,"Kurudupalya");
        cityName.remove("NehruNagar");
        System.out.println(cityName);
        System.out.println(cityName.get(2));


        Set<String> cityName1 = new HashSet<>();
        cityName1.add("Banglore");
        cityName1.add("Shivajinagar");
        cityName1.add("NehruNagar");
        cityName1.add(null);
        cityName1.add(null);
        cityName1.add("Shivajinagar");
        cityName1.add("NehruNagar");
        System.out.println(cityName1);

        Queue<String> numbers = new LinkedList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add(null);
        numbers.add("three");
        numbers.add("four");

        boolean match = numbers.contains("five");
        System.out.println(match);
        System.out.println(numbers);

        Queue<String> number = new PriorityQueue<>();
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");
        //number.add(null);
        number.add("three");
        number.add("four");
        boolean match1 = number.containsAll(numbers);
        System.out.println(match1);
        System.out.println(number);

        //Collection in collection
        List<String>  movieNames = new ArrayList<>();
        movieNames.add("Radha");
        movieNames.add("Sanju");
        movieNames.add("Prem");

        List<String> movieNames1 = new ArrayList<>();

        //add
        movieNames1.add("Dhoom");
        movieNames1.add("English");
        movieNames1.add("Vinglish");

        for(Object movieName : movieNames){
            System.out.println(movieName);
        }

        //addAll
       movieNames.addAll(movieNames1);



       //retainAll
        boolean isRetained = movieNames.retainAll(movieNames1);
        System.out.println("Is movie retained " + isRetained);


        //size
        System.out.println(movieNames1.size());
        //remove
        movieNames1.remove("English");
        System.out.println(movieNames1);

        //removeAll
        boolean movie = movieNames1.removeAll(movieNames);
        System.out.println(movie);

        System.out.println(movieNames1);

        //clear
        movieNames.clear();

        System.out.println(movieNames);


        List<String> peopleNames = new ArrayList<>();
        if(peopleNames.isEmpty()) {
            peopleNames.add("Raghu");
            peopleNames.add("Anusha");
            peopleNames.add("Archana");
            peopleNames.add("Nawaz");
            peopleNames.add("Pallavi");
        }


        List<String> peopleNames1 = new ArrayList<>();
        if(peopleNames1.isEmpty()) {
            peopleNames1.add("Raj");
            peopleNames1.add("Kausalya");
            peopleNames1.add("Hemath");
            peopleNames1.add("Afrid");
            peopleNames.add("Nawaz");
            peopleNames.add("Pallavi");
        }

//Take common data and print and remove others from list......
        peopleNames1.retainAll(peopleNames);

        System.out.println("The people names are " + peopleNames);
        System.out.println("The people names 1 are " + peopleNames1);

        Queue<String> name = new LinkedList<>();
        name.add(null);
        name.add("Radha");
        name.add(null);
        name.add("Kiran");
        name.add("Kiran");
        System.out.println(name);

        String[] names = new String[1];
        System.out.println(names[0]);
        System.out.println(names.length);


        List<String> lst = new ArrayList<>(3);
        lst.add("last");
        lst.add("First");
        lst.add("Youth");
        lst.add("People");
        System.out.println(lst);
        System.out.println(lst.size());

        LinkedList<String> dry = new LinkedList<>();
        dry.add("Badam");
        dry.add("Khajur");
        dry.addFirst("Pista");
        dry.addLast("Munekha");
        System.out.println(dry);


        //Sorting the array
        List<String> words = new ArrayList<>();
        words.add("Hi");
        words.add("Hello");
        words.add("Bye");
        words.add("Hacker");
        Collections.sort(words);
        System.out.println(words);
    }
}