package com.xworkz.ecomapp.dto;

import com.xworkz.ecomapp.constant.PaymentMode;
import com.xworkz.ecomapp.constant.Review;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {

    private int customerId;
    private String customerName;
    private String emailId;
    private long phoneNo;
    private String location;
    private PaymentMode paymentMode;
    private Review review;

    @Override
    public String toString(){
        return "Customers { Customer Id = "+this.customerId+" Customer Name = "+this.customerName+" Email Id = "+this.emailId+" Phone No : "+this.phoneNo+" Location : "+this.location+" Cash Through : "+this.paymentMode+"  Review : "+this.review+"}";
    }
}
