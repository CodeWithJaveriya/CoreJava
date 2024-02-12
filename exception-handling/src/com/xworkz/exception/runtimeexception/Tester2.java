package com.xworkz.exception.runtimeexception;

public class Tester2 {
    public static void main(String[] args) {

        System.out.println("Main Started");
        String str = null;
       try{
           System.out.println(str.length());
       }catch(NullPointerException e){
           e.printStackTrace();
           System.out.println("Cannot get length of null value");
       }

        System.out.println("Main Ended");
    }
}
