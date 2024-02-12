package com.xworkz.abstarction.interfaceinheritance;

public class AirportTester {

    public static void main(String[] args) {

        Airport airport = new Airport();
        airport.toTakeRest();

        RestRooms restRooms = new Airport();
        restRooms.toTakeRest();

        HandWashers handWashers = new Airport();
        handWashers.toTakeRest();

    }
}
