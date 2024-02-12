package com.xworkz.exception;

public class Tester11 {

    public Tester11(){

        System.out.println("Constructor is invoked");
    }

    public static void main(String[] args) {
        System.out.println("Main Started");

       Tester11 tester11 = new Tester11();
       tester11.method();

        System.out.println("Main Ended");
    }

    public void method(){

        System.out.println("Method is invoked");
    }
    {
        System.out.println("Init block is invoked");
    }

   static {
        System.out.println("Static block1 is invoked");
        {
           System.out.println("Nested of block1 of 1 is invoked");
            {
                System.out.println("Nested of block1 of 2 is invoked");
            }
       }
    }
    static{
        System.out.println("Static block2 is invoked");
    }
   static  {
        System.out.println("Static block3 is invoked");
    }
   static  {
        System.out.println("Static block4 is invoked");
    }
    static{
        System.out.println("Static block5 is invoked");

    }


}
