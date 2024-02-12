package com.xworkz.app.exception;

public class AttenderNotFoundException extends RuntimeException {

    public AttenderNotFoundException(String errorMessage){
        System.out.println(errorMessage);

    }
}
