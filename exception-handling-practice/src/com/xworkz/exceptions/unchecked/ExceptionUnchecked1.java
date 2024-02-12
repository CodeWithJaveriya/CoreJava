package com.xworkz.exceptions.unchecked;

public class ExceptionUnchecked1 {

    //runtime exceptions
    public static void main(String[] args) {

        System.out.println("Main Started");
        try {
            int a = 20 / 0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main Ended");
    }
}
