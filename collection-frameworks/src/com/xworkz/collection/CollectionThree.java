package com.xworkz.collection;

import java.util.*;

public class CollectionThree {

    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Baba");
        map.put(1,"Baba");
        map.put(2, "Sameer");
        System.out.println("Map preference");
        System.out.println(map.get(1));
        System.out.println(map.get(1));
        System.out.println(map.get(2));

        Set<String> set = new HashSet();
        boolean isAdded = set.add("Baba");
        boolean isAdded1 = set.add("Baba");
        set.add("Rahul");
        set.add("Kavya");
        set.add("Vinod");
        System.out.println(isAdded);
        System.out.println(isAdded1);
        for (String str: set) {
            System.out.println(str);
        }



    }
}
