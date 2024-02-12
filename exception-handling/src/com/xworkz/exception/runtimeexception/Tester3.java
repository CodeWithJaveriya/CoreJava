package com.xworkz.exception.runtimeexception;

public class Tester3 {
    public static void main(String[] args) {
        System.out.println("Main started");

        try {
            int a = 5 / 0;
            System.out.println(a);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Cannot divide by zero");
        }


        System.out.println("Main Ended");
    }
}
