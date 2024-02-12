package com.xworkz.practice.conversions;

import java.util.*;

public class ListToArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List is:" + list);


        String[] alphabets = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(alphabets));

        ListIterator<String > listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println("Index "+listIterator.nextIndex() +"Value"+ listIterator.next());
        }

        ListIterator<String > listIterator1 = list.listIterator(list.size());
        while (listIterator1.hasPrevious()){
            System.out.println("Index" + listIterator1.previousIndex() +"Value "+ listIterator1.previous());
        }

        LinkedList<String> ll = new LinkedList<>();
        ll.add("asd");
        ll.add("fgidj");

        //only for linked list
        Iterator<String> itr = ll.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        ListIterator<String> listIterator2 = ll.listIterator(ll.size());
        while (listIterator2.hasPrevious()){
            System.out.println(listIterator2.previous());
        }

    }
}
