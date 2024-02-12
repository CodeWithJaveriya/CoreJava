package com.xwrokz.ecommrece.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO {

    private int id;
    private String name;
    private String email;
    private String address;
    private long phoneNo;
    private boolean historyOfCustomer;
    //private Payment paymentMode;


    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CustomerDTO " + "Customer ID = " +  this.id + "Customer Name " + this.name + "Customer Email " + this.email + "Customer Address " + this.address +"Customer PhoneNo " + this.phoneNo + "History Of Customer " + this.historyOfCustomer ;
    }

    @Override
    public boolean equals(Object obj){

        if(this instanceof CustomerDTO){
            CustomerDTO dto = (CustomerDTO) obj;
            if(this.hashCode() == dto.hashCode() && this.name.equals(dto.getName()) && this.email.equals(dto.getEmail()) && this.address.equals(dto.getAddress()) && this.phoneNo == dto.getPhoneNo()){
                return true;
            }
        }
        return false;

    }
}
