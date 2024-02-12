package com.xworkz.practice.listpractice;


import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> collegeNames = new ArrayList<>();
        collegeNames.add("SJCIT");
        collegeNames.add("SJBIT");
        collegeNames.add("BMSIT");
        Collections.sort(collegeNames);
        System.out.println("Using Iterator");
        Iterator<String> itr = collegeNames.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Using for each loop");
        for (String collegeName: collegeNames) {
            System.out.println(collegeName);
        }
        System.out.println("Get and set methods");
        System.out.println(collegeNames.get(2));
        //collegeNames.set(3,"JCOEAT");
        System.out.println("Iterating through listIterator");
        //backward direction
        ListIterator<String> listIterator = collegeNames.listIterator(collegeNames.size());
            while (listIterator.hasPrevious()){
                System.out.println(listIterator.previous());
            }

        System.out.println("Iterating through for loop");
            for (int i =0; i < collegeNames.size(); i++){
                System.out.println(collegeNames.get(i));
            }
    collegeNames.add("GUVIT");
        System.out.println(collegeNames);
            List<String> schoolNames = new ArrayList<>();
            schoolNames.add("Goodwill School");
            schoolNames.add("Bharat School");
            schoolNames.add("Presidency School");
        System.out.println(schoolNames);
       /* System.out.println("Add all method");*/
        /*System.out.println(schoolNames.addAll(collegeNames));
        System.out.println(schoolNames);*/
      /* schoolNames.addAll(1,collegeNames);
        System.out.println(schoolNames);*/
        collegeNames.remove("GUVIT");
        System.out.println(collegeNames);
        /*collegeNames.clear();
        System.out.println(collegeNames);*/
        collegeNames.remove(2);
        System.out.println(collegeNames);
        collegeNames.removeAll(schoolNames);
        System.out.println(collegeNames);
        System.out.println(schoolNames);
        schoolNames.removeAll(collegeNames);
        System.out.println(schoolNames);
        System.out.println(collegeNames);
        schoolNames.retainAll(collegeNames);
        System.out.println(schoolNames);

    }


}
