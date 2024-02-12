package com.xworkz.myntraapp;

import com.xworkz.myntraapp.dto.CustomerDTO;
import com.xworkz.myntraapp.ecommerce.ECommerceMyntra;
import com.xworkz.myntraapp.ecommerce.impl.ECommerceMyntraImpl;

import java.util.Currency;

public class Tester {

    public static void main(String[] args) {

        System.out.println("Main Started");

        ECommerceMyntra myntra = new ECommerceMyntraImpl();
        CustomerDTO dto = new CustomerDTO();

        myntra.addCustomer(dto);

        System.out.println("Main Ended");
    }
}
