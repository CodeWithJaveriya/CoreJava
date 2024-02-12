package com.xworkz.abstarction.interfaceinheritance;

public class Airport implements RestRooms, HandWashers{
    @Override
    public void toTakeRest() {
        System.out.println("Both are for good use of washrooms");
    }
}
