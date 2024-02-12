package com.xworkz.app.exception;

public class GenderNotUpdatedException extends RuntimeException {

    public GenderNotUpdatedException(String errorMessage){
        System.out.println(errorMessage);

    }
}
