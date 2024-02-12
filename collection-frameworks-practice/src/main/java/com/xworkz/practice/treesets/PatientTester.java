package com.xworkz.practice.treesets;

import java.util.TreeSet;

public class PatientTester {

    public static void main(String[] args) {

        TreeSet<PatientDTO> patient = new TreeSet<>();
        patient.add(new PatientDTO(1,"Thank"));
        patient.add(new PatientDTO(2,"Uziae"));
        System.out.println(patient);
    }
}
