package com.xworkz.exception.runtimeexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester1 {
    public static void main(String[] args) {

        System.out.println("Main Started");
        int name = 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the name");
        try {
            name = scr.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Enter the integer value");
            e.printStackTrace();
        }
        System.out.println("The name is :  " + name);

        System.out.println("Main Ended");
    }
}
