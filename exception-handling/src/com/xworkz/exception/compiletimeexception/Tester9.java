package com.xworkz.exception.compiletimeexception;

public class Tester9 {

    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            method1();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Main Ended");
    }

    private static void method1() throws ClassNotFoundException{
        System.out.println("Method 1 Started");
        method2();
        System.out.println("Method 1 Ended");
    }

    private static void method2() throws ClassNotFoundException{
        System.out.println("Method 2 Started");
        method3();
        System.out.println("Method 2 Ended");
    }

    private static void method3() throws ClassNotFoundException {
        System.out.println("Method 3 Started");
        method4();
        System.out.println("Method 3 Ended");
    }

    private static void method4() throws ClassNotFoundException{
        System.out.println("Method 4 Started");
        Class.forName("com.xworkz.exception.compiletimeexception.Tester9");
        System.out.println("Method 4 Ended");
    }
//throws - specify exception


}
