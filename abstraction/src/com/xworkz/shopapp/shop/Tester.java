package com.xworkz.shopapp.shop;

public class Tester {
    public static void main(String[] args) {

        //abstraction
        Switch lightSwitch = new LightImpl();
        lightSwitch.sOff();
        lightSwitch.sOn();

        Shop medicalShop = new LifeCareMedicals();
        medicalShop.doBuisness();



       // Laptop amazonLaptop = new Amazon();
        //amazonLaptop.toWork();
    }
}
