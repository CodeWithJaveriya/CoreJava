package com.xworkz.ecomapp;

import com.xworkz.ecomapp.constant.PaymentMode;
import com.xworkz.ecomapp.constant.Review;
import com.xworkz.ecomapp.dto.CustomerDTO;
import com.xworkz.ecomapp.ecommerce.Ecommerce;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        Ecommerce ecom = new Ecommerce(size);
        for(int index = 0; index < ecom.customer.length ; index++) {
            CustomerDTO dto = new CustomerDTO();
           // System.out.println("Enter Customer ID: ");
            //dto.setCustomerId(sc.nextInt());
            System.out.println("Enter Customer name: ");
            dto.setCustomerName(sc.next());
            System.out.println("Enter Customer emailId: ");
            dto.setEmailId(sc.next());
            System.out.println("Enter Customer PhoneNo: ");
            dto.setPhoneNo(sc.nextLong());
            System.out.println("Enter Customer Location: ");
            dto.setLocation(sc.next());
            System.out.println("Enter Customer payment mode: ");
            dto.setPaymentMode(PaymentMode.valueOf(sc.next()));
            System.out.println("Enter Customer review: ");
            dto.setReview(Review.valueOf(sc.next()));
            ecom.addCustomer(dto);
        }
        ecom.getCustomer();


    }
}
