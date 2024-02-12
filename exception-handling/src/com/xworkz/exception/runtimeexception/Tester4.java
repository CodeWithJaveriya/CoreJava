package com.xworkz.exception.runtimeexception;

public class Tester4 {

    public static void main(String[] args) {

        String phoneNumber = "9880432211";

        try {
            System.out.println(Long.parseLong(phoneNumber));
        }catch(NumberFormatException nf){
            nf.printStackTrace();
        }
    }
}
