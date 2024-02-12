package com.xworkz.collection.comparator;

import com.xworkz.collection.patient.PatientDTO;

import java.util.Comparator;

public class AgeComparator implements Comparator<PatientDTO> {
    @Override
    public int compare(PatientDTO o1, PatientDTO o2) {
        return o1.getAge() - o2.getAge();
    }
}
