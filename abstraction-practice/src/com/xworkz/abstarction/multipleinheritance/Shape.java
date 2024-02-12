package com.xworkz.abstarction.multipleinheritance;

import java.util.RandomAccess;

public class Shape  implements Rectangle, Traingle {
    @Override
    public void shapeDetecting() {
        System.out.println("Implementing shapes of both traingle and rectangle");
    }
}
