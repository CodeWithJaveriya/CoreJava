package com.xwrokz.ecommrece;

import com.xwrokz.ecommrece.dto.CustomerDTO;
import com.xwrokz.ecommrece.ecommerce.Ecommerce;
import com.xwrokz.ecommrece.ecommerce.impl.EcommerceAmazonImpl;

import java.util.List;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Main Started");
        Ecommerce ecommerce = new EcommerceAmazonImpl();
        Scanner sc = new Scanner(System.in);
        CustomerDTO dto = new CustomerDTO();
      /*  System.out.println("Enter the customer id");
        dto.setId(sc.nextInt());
        System.out.println("Enter the customer name ");
        dto.setName(sc.next());
        System.out.println("Enter the email of the customer ");
        dto.setEmail(sc.next());
        System.out.println("Enter the address of the customer");
        dto.setAddress(sc.next());
        System.out.println("Enter the phone number");
        dto.setPhoneNo(sc.nextLong());
        System.out.println("Enter the history of customer if present");
        dto.setHistoryOfCustomer(sc.nextBoolean());
        ecommerce.addCustomer(dto);*/

        List<CustomerDTO> dtos =  ecommerce.getAllCustomers();
        System.out.println(dtos);
        dtos.stream().forEach(System.out::println);
        System.out.println("Main Ended");
    }

}
