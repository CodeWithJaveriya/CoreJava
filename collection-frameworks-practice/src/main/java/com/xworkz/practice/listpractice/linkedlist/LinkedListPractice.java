package com.xworkz.practice.listpractice.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {


        //adding elements
        LinkedList<String> setOfPlaces = new LinkedList<>();
        setOfPlaces.add("Rajajinagar");
        setOfPlaces.add("Ireland");
        setOfPlaces.add("Dharwad");
        System.out.println(setOfPlaces);

        System.out.println("Using iterator");
        Iterator<String> itr = setOfPlaces.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        setOfPlaces.add(1,"India");
        System.out.println(setOfPlaces);

        LinkedList<String> setOfCountries = new LinkedList<>();
        setOfCountries.add("Japan");
        setOfCountries.add("India");
        setOfCountries.add("Pakistan");
        System.out.println(setOfCountries);
        setOfCountries.addAll(setOfPlaces);
        System.out.println(setOfCountries);
        System.out.println(setOfPlaces);

        LinkedList<String> setOfStatues = new LinkedList<>();
        setOfStatues.add("Goldman");
        setOfStatues.add("Yashurka");
        System.out.println(setOfStatues);
        setOfStatues.addAll(1,setOfPlaces);
        System.out.println(setOfStatues);
        System.out.println(setOfPlaces);

        setOfPlaces.addFirst("Jaynagar");
        setOfPlaces.addLast("Vijaynagar");
        System.out.println(setOfPlaces);

        //removing elements
        LinkedList<String> names = new LinkedList<>();
        names.add("Sanju");
        names.add("Manju");
        names.add("Vijay");
        names.add("Radha");
        names.add("Shashi");
        System.out.println(names);

        names.remove();
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        names.remove("Radha");
        System.out.println(names);

        LinkedList<String> cuteNames = new LinkedList<>();
        cuteNames.add("Poppy");
        cuteNames.add("Mommy");
        cuteNames.add("Mama");
        cuteNames.add("Baba");
        System.out.println(cuteNames);
        cuteNames.addAll(names);
        System.out.println(cuteNames);
        cuteNames.removeAll(names);
        System.out.println(cuteNames);
        System.out.println(names);

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Tiger");
        animals.add("Kite");
        animals.add("Lion");
        animals.add("Girraffe");
        animals.add("Kite");
        animals.add("Eagle");
        animals.add("Girraffe");
        animals.add("Virtue");
        System.out.println(animals);
        animals.removeFirst();
        animals.removeLast();
        System.out.println(animals);
        animals.removeFirstOccurrence("Kite");
        System.out.println(animals);
        animals.removeLastOccurrence("Girraffe");
        System.out.println(animals);
        Iterator<String> itrs = animals.descendingIterator();
        while (itrs.hasNext()){
            System.out.println(itrs.next());
        }

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Hunmai");
        ll.add("Sufiyah");
        Iterator<String > iterator = ll.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
