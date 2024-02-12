package com.xworkz.shopapp.shop;

public class LightImpl implements Switch{
    @Override
    public void sOn() {
        System.out.println("Lights are turned on");
    }

    @Override
    public void sOff() {
        System.out.println("Lights are turned off");
    }
}
