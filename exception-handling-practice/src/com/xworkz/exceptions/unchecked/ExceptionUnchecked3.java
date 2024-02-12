package com.xworkz.exceptions.unchecked;

public class ExceptionUnchecked3 {

    public static void main(String[] args) {
        System.out.println("Main Started");
        try {
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Main Ended");
    }
}
