package com.xworkz.app.dto;

import com.xworkz.app.constant.BloodGroup;
import com.xworkz.app.constant.Gender;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class PatientDTO {

    private int patientId;
    private String patientName;
    private int age;
    private BloodGroup bloodGroup;
    private Gender gender;
    private long phoneNumber;
    private boolean isAlive;
    private String address;
    private String attenderName;
}
