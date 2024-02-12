package com.xworkz.socialmedia.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ProfileDTO implements Serializable {

    private int id;
    private String profileName;
    private long profilePhoneNumber;
    private int age;
    private String password;
    private int noOfFollowers;
    private int noOfFollowing;

}
