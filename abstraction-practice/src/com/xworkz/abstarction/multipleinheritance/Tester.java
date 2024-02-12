package com.xworkz.abstarction.multipleinheritance;

public class Tester {

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.shapeDetecting();

        Rectangle rectangle = new Shape();
        rectangle.shapeDetecting();

        Traingle traingle = new Shape();
        traingle.shapeDetecting();
    }
}
