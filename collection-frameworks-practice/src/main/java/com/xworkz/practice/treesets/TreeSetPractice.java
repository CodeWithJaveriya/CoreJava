package com.xworkz.practice.treesets;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Dhadak");
        treeSet.add("Nulaiya");
        treeSet.add("Bhava");
        System.out.println(treeSet);

        Iterator<String> itr = treeSet.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        NavigableSet<String> nav = treeSet.descendingSet();
        System.out.println(nav);

      /*  System.out.println("before polling" + treeSet);
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println("after polling");*/
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        System.out.println(treeSet1.size());
        treeSet1.add(23);
        treeSet1.add(43);
        treeSet1.add(54);
        treeSet1.add(67);
        treeSet1.add(90);
        treeSet1.add(74);
        System.out.println("head set");
        System.out.println(treeSet1.headSet(74,false));
        System.out.println("subset");
        System.out.println(treeSet1.subSet(43,true,90,false));
        System.out.println("tailset");
        System.out.println(treeSet1.tailSet(43,false));

    }
}
