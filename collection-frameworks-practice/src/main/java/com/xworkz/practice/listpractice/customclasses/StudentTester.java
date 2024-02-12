package com.xworkz.practice.listpractice.customclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTester {

    public static void main(String[] args) {

        Student student = new Student(1,"Kartik", "Banglore");
        Student student1 = new Student(2, "Umair", "Udaipur");
        Student student2 = new Student(3, "Zahid", "Rajajinagar");

        List<Student> arrayList = new ArrayList<>();
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        Iterator<Student> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Student list:arrayList) {
            System.out.println(list);
        }
    }
}
