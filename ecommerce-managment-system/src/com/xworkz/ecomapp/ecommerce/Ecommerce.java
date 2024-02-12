package com.xworkz.ecomapp.ecommerce;

import com.xworkz.ecomapp.dto.CustomerDTO;

public class Ecommerce {

   public CustomerDTO customer[] ;
    int index;
    static int id;

    public Ecommerce(int size){

        customer = new CustomerDTO[size];
    }
    public boolean addCustomer(CustomerDTO customer){
        boolean isAdded = false;
        if(customer != null){
        customer.setCustomerId(++id);
            this.customer[index++]= customer;
            isAdded = true;
        }else{
            System.out.println("Cannot add customer at null value");
        }
        return isAdded;
    }

    public void getCustomer(){
        for(int customerIndex = 0; customerIndex < customer.length; customerIndex++)
            System.out.println(customer[customerIndex]);
    }

    public String getCustomerNameByCustomerId(int customerId){
        String customerName = null;
       for(int index = 0; index< customer.length; index++){
           if(customer[index].getCustomerId() == customerId){
               customerId = customer[index].getCustomerId();

           }
       }
       return customerName;

    }


}
