package com.xworkz.exception.compiletimeexception;

public class Tester7 {


    public static void main(String[] args) {

        //loading class to memory
        try {
           Class tester7 = Class.forName("com.xworkz.exception.compiletimeexception.Tester7");
            System.out.println("The class name is : " + tester7);
        }catch (ClassNotFoundException n){
            n.printStackTrace();
        }
    }
}