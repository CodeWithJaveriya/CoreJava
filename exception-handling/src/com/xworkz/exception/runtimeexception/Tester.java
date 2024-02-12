package com.xworkz.exception.runtimeexception;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Main Started");

        String str[] = new String[2];
        try {
            str[1] = "neha";
            str[2] = "komal";
            str[3] = "rohit";
        }catch(ArrayIndexOutOfBoundsException e){
           // e.printStackTrace();
            System.out.println("Size is full enter the values within size");
        };

        System.out.println("Main Ended");

    }
}
