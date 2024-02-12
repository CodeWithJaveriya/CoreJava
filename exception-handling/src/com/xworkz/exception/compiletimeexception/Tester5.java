package com.xworkz.exception.compiletimeexception;

import java.io.File;
import java.io.IOException;

public class Tester5 {

    public static void main(String[] args) {

        /*File file = new File("C:\\Users\\Javeriya Taj\\Desktop\\jav.pdf");

        try{
            if(!file.exists()) {
                file.createNewFile();
            }else{
                System.out.println("File already exists");
            }
        }catch (IOException io){
            io.printStackTrace();
        }*/

        try {
            File file = new File("C:\\Users\\Javeriya Taj\\Desktop\\jabis.txt");
            if (file.exists()) {
             file.createNewFile();
            }else{
                System.out.println("File already exists ");
            }
        }catch(IOException io){
            io.printStackTrace();

        }

        {
            System.out.println("Hii");
        }
    }
}
