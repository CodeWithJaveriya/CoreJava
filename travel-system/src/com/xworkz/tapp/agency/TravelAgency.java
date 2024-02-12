package com.xworkz.tapp.agency;

import com.xworkz.tapp.bus.AbhiBus;

public class TravelAgency {

    String name = "Sri Bharat Travels";

    public AbhiBus abhibus;

    public TravelAgency(AbhiBus abhibus){
        this.abhibus = abhibus;
    }

    public boolean bookingTickets(int noOfTickets){
        System.out.println("Inside booking tickets");
        boolean isTicketBooked = false;
        if(abhibus != null){
          boolean isConditionGood =  this.abhibus.goodCondition();
          if(isConditionGood){
              // 5 <= 20
              if(noOfTickets <= this.abhibus.minBooking()){
                  System.out.println("No of tickets booked = " + noOfTickets);
                  System.out.println("Thank you!!! for booking tickets from " + this.name);
                  System.out.println("Do Visit Again!!!");
                  isTicketBooked = true;
              }else{
                  System.out.println("Cannot book ticket.. Please book only minimum tickets");
              }
          }else{
              System.out.println("Bus is not in good condition");
          }
        }else{
            System.out.println("Cannot book at null value");
        }
        return isTicketBooked;
    }
}
