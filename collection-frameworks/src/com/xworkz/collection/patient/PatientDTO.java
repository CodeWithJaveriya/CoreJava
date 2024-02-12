package com.xworkz.collection.patient;

import com.xworkz.collection.constants.Gender;
import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class PatientDTO implements Comparable<PatientDTO> {

    private int id;
    private String pName;
    private int age;
    private String address;
    private Gender gender;


    public PatientDTO(int id, String pName, int age, String address, Gender gender){
        this.id = id;
        this.pName = pName;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }



    @Override
    public int compareTo(PatientDTO o) {
        return this.id - o.id;
        //return Integer.parseInt(this.getPName()) - Integer.parseInt(o.getPName());
        // return this.getPName().compareTo(o.getPName());
    }
//custom sorting
}
