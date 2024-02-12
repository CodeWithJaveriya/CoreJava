package com.xworkz.exceptions.unchecked;

public class ExceptionUnchecked5 {

    public static void main(String[] args) {

        System.out.println("Started");
        int i = 50;
        int j = 0;
        int data;
        try{
            data = i/j;
            System.out.println(data);
        }catch (Exception e){
            System.out.println(i/(j+2));
            e.printStackTrace();
        }
        System.out.println("Ended");
    }
}
