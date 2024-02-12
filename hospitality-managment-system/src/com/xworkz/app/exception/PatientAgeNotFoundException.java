package com.xworkz.app.exception;

public class PatientAgeNotFoundException extends Exception{

    public PatientAgeNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
