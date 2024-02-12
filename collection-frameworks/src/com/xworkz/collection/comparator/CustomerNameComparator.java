package com.xworkz.collection.comparator;

import com.xworkz.collection.ecommerce.CustomerDTO;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<CustomerDTO> {
    @Override
    public int compare(CustomerDTO o1, CustomerDTO o2) {
        return o1.getCustomerName().compareTo(o2.getCustomerName());
    }
}
