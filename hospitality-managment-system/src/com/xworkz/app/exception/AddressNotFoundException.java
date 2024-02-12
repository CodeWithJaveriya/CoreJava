package com.xworkz.app.exception;

public class AddressNotFoundException extends Exception{

    public AddressNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
