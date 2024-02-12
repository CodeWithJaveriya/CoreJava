package com.xworkz.myntraapp.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CustomerDTO implements Serializable {

    private int id;
    private String name;
    private String email;
    private String password;
    private long phoneNo;
    private String address;



}
