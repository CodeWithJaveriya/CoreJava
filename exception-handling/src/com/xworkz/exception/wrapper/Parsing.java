package com.xworkz.exception.wrapper;

import javafx.util.converter.FloatStringConverter;

public class Parsing {

    public static void main(String[] args) {

        //parsing
        //Converting string type of data to any wrapper class
        String phoneNumber = "9880432211";
        //conversion of String to Long
        Long contactNo = Long.parseLong(phoneNumber);

        System.out.println(contactNo);

        //conversion of String to Integer
        String age = "23";

        Integer age1 = Integer.parseInt(age);

        System.out.println(age1);

        //conversion of String to Short
        String number = "231";

        Short number1 = Short.parseShort(number);

        System.out.println(number1);

        //conversion of String to Byte

        String byt = "45";

        Byte byt1 = Byte.parseByte(byt);

        System.out.println(byt1);

        //conversion of String to Float

        String flo = "45.90";

        Float flo1 = Float.parseFloat(flo);

        System.out.println(flo1);

        //conversion of String to Double

        String dou = "7493.398";

        Double dou1 = Double.parseDouble(dou);

        System.out.println(dou1);






    }
}
