package com.xworkz.collection.ecommerce;

import com.xworkz.collection.comparator.CustomerNameComparator;
import com.xworkz.collection.constants.PaymentMode;
import com.xworkz.collection.constants.Review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerTester {

    public static void main(String[] args) {

        List<CustomerDTO> dto = new ArrayList<>();
        if(dto.isEmpty()){
            dto.add(new CustomerDTO(1, "Rahul", "rahul90@gmail.com", 468743439, "Banglore", PaymentMode.CashOnDelivery, Review.ThreeStar ));
            dto.add(new CustomerDTO(3, "Hemanth", "hema7856@gmail.com", 745693484, "Bellur", PaymentMode.GooglePay, Review.OneStar));
            dto.add(new CustomerDTO(2, "Vikas", "vikas4687367@gmail.com", 438957439, "Bagalkote", PaymentMode.Paytm, Review.FourStar));
        }

        System.out.println("For sorting in the form of id");
        Collections.sort(dto);
        for(CustomerDTO dtos : dto){
            System.out.println(dtos);
        }

        Collections.sort(dto, new CustomerNameComparator());




    }
}
