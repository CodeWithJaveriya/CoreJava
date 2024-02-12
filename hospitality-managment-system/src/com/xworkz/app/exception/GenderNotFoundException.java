package com.xworkz.app.exception;

import com.xworkz.app.constant.Gender;

public class GenderNotFoundException extends RuntimeException{

    public GenderNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
