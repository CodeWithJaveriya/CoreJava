package com.xworkz.exception;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class Tester10 {

    private static String[] args;

    public static void main(String[] args) {

        System.out.println("Main Started");
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter the string value");



            System.out.println(56 / 0);

        }catch(NullPointerException | ArithmeticException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Inside finally block ");
            if(sc != null){
                sc.close();
            }
        }
        System.out.println("Main Ended");

    }
}
