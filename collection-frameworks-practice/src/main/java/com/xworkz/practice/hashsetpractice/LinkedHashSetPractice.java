package com.xworkz.practice.hashsetpractice;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Thailand");
        linkedHashSet.add("America");
        linkedHashSet.add("Australia");
        linkedHashSet.add("Australia");
        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.remove("Australia"));
        System.out.println(linkedHashSet);

    }
}
