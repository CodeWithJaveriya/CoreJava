package com.xworkz.exceptions.unchecked;

public class ExceptionUnchecked2 {

    public static void main(String[] args) {

        System.out.println("Main Started");
        try {
            int a[] = new int[2];
            a[0] = 2;
            a[1] = 3;
            a[2] = 1;
            a[3] = 1;
            System.out.println(a);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


        System.out.println("Main Ended");
    }
}
