package com.xworkz.practice.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        String[] collegeNames = {"SJCIT", "SJBIT", "GUVIT"};
        for (String collegeName: collegeNames) {
            System.out.println(collegeName);
        }
        System.out.println(Arrays.toString(collegeNames));

        //conversion of array to list
        List<String> list = new ArrayList<>();
        for (String colleges:collegeNames) {
            list.add(colleges);
        }
        System.out.println("List of college names "+ list);
    }
}
