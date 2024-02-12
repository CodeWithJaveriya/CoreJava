package com.xworkz.app.exception;

public class PatientAgeNotUpdatedException extends RuntimeException {

    public PatientAgeNotUpdatedException(String errorMessage){

        System.out.println(errorMessage);
    }
}
