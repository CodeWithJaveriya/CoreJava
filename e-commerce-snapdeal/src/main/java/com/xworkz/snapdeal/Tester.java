package com.xworkz.snapdeal;



import com.xworkz.snapdeal.dto.CustomerDTO;
import com.xworkz.snapdeal.ecommerce.Ecommerce;
import com.xworkz.snapdeal.ecommerce.impl.EcommerceSnapdealImpl;

import java.util.List;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Main Started");
        Ecommerce ecommerce = new EcommerceSnapdealImpl();
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
