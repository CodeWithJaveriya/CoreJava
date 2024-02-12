package com.xworkz.abstarction.abstarctclasses;

public abstract class ShoppingMall {


    final String mallName = "Rmz";

    public ShoppingMall(){
        System.out.println("Constructor is invoked");
    }

    public abstract void famousMall();

    public void mallEntry(){
        System.out.println("Entry fees is 1000 rupees");
    }

}
