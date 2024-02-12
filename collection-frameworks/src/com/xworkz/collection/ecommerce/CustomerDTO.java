package com.xworkz.collection.ecommerce;

import com.xworkz.collection.constants.PaymentMode;
import com.xworkz.collection.constants.Review;
import com.xworkz.collection.patient.PatientDTO;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CustomerDTO implements Comparable<CustomerDTO> {

    private int customerId;
    private String customerName;
    private String emailId;
    private long phoneNo;
    private String location;
    private PaymentMode paymentMode;
    private Review review;


    @Override
    public int compareTo(CustomerDTO o) {
        return this.customerId - o.customerId;
    }
}
