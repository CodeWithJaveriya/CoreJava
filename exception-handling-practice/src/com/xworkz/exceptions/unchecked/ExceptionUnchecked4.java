package com.xworkz.exceptions.unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionUnchecked4 {

    public static void main(String[] args) {
        int name = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        try {
            System.out.println("Checking try block");
            name = sc.nextInt();
            System.out.println("Checking out the try block");
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("The value is : " + name);
        System.out.println("Main Ended");
    }
}
