package com.xworkz.exception.compiletimeexception;

import java.awt.peer.SystemTrayPeer;

public class Tester6 {

    public static void main(String[] args) {

        // to load class in memory
        try {
            Class tester6 = Class.forName("com.xworkz.exception.compiletimeexception.Tester6");
            System.out.println("Class loaded successfully " + tester6);
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();

        }
    }
}
