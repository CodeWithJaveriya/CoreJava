package com.xworkz.collection;

import java.util.*;

public class CollectionFirst {


    public static void main(String[] args) {

        //normal array
        String movieNames[] = new String[3];
        movieNames[0] = "Kanak";
        movieNames[1] = "Thappad";
        movieNames[2] = "Julus";
        System.out.println(movieNames);

        //using collections
        Collection moviesNames1 = new ArrayList();
        moviesNames1.add("Kanak");
        moviesNames1.add("Thappad");
        moviesNames1.add("Julus");
        moviesNames1.add(1);
        moviesNames1.add(true);
        System.out.println(moviesNames1);
        for (Object movieName: moviesNames1) {
            System.out.println(movieName);
        }


        Collection<String> moviesNames2 = new ArrayList();
        moviesNames2.add("Kanak");
        moviesNames2.add("Thappad");
        moviesNames2.add("Julus");
        //moviesNames2.add(3);
        System.out.println(moviesNames2);
        for (String movieName: moviesNames2) {
            System.out.println(movieName);
        }
        System.out.println(moviesNames2.size());
        System.out.println(moviesNames2.remove("Julus"));
        System.out.println(moviesNames2);


        List<Integer> price = new ArrayList<>();

        price.add(23);
        price.add(455);
        price.add(789);
        price.add(67);
        price.add(587);
        Collections.sort(price);
        System.out.println(price);
        System.out.println("The size of price is " + price.size());

    }
}
