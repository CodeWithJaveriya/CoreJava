        //standard package
package com.xworkz.tapp;

        import com.xworkz.tapp.agency.TravelAgency;
        import com.xworkz.tapp.bus.AbhiBus;
        import com.xworkz.tapp.bus.impl.SrsImpl;
        import com.xworkz.tapp.bus.impl.VrlImpl;

        public class AbhiBusExecutor {

    public static void main(String[] args) {
         //abstraction - object creation for interface and impl class
        AbhiBus abhibus = new VrlImpl();

        AbhiBus abhibus1 = new SrsImpl();

        //object creation for travel agency
        TravelAgency agency = new TravelAgency(abhibus);

        TravelAgency agency1 = new TravelAgency(abhibus1);

        agency.bookingTickets(5);

        agency1.bookingTickets(25);


    }
}
