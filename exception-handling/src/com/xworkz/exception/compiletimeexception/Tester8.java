package com.xworkz.exception.compiletimeexception;

import java.io.File;
import java.io.IOException;

public class Tester8 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Javeriya Taj\\Documents\\newFile,docx");
        try {
            if(!file.exists()){
                file.createNewFile();
            }else{
                System.out.println("File exists!! ");
            }
        }catch (IOException io){
            io.printStackTrace();

        }

    }
}
