package com.xworkz.practice.hashsetpractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetPractice {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Tiger");
        hashSet.add("Lion");
        hashSet.add("Monkey");
        hashSet.add("Donkey");
        hashSet.add("Donkey");

        hashSet.remove("Lion");
        System.out.println(hashSet.contains("Monkey"));

        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Tasmiya");
        hashSet1.add("Weds");
        hashSet1.add("Waseem");
        System.out.println(hashSet1);
        hashSet1.addAll(hashSet);
        System.out.println(hashSet1);

        hashSet1.removeAll(hashSet);
        System.out.println(hashSet1);
        System.out.println(hashSet);


    }
}
