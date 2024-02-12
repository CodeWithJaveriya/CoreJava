package com.xworkz.exception.wrapper;

import javax.swing.text.html.parser.TagElement;

public class WrapperClasses {

    public static void main(String[] args) {

        int i;
        i = 90;
        //boxing - Object creation
        //literals
        Integer age = i;
       // Integer age2 = new Integer(i);

        //unboxing
        int age1 = age;

        //New object is created and stored
        age1 = age1 +100;

        System.out.println(age1);

        char ch = 'B';
        //boxing
        Character ch1 = ch;
        //Typical object cretion
        //Character ch2 = new Character(ch);
        //unboxing
        char ch3 = ch1;

        System.out.println(ch1);

        boolean isConnected = true;
        //boxing
        Boolean isConnected1 = isConnected;

        System.out.println(isConnected1);

        float w = 34.67F;
        Float w1 = w;
        System.out.println(w1);

        double s = 327498.349D;
        Double s1 = s;
        System.out.println(s1);

        byte a = 12;
        Byte a1 = a;
        System.out.println(a1);

        short bh = 263;
        Short bh1 = bh;
        System.out.println(bh1);





    }
}
