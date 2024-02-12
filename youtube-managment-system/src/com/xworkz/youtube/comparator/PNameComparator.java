package com.xworkz.youtube.comparator;

import com.xworkz.youtube.dto.PatientDTO;

import java.util.Comparator;

public class PNameComparator implements Comparator<PatientDTO> {

    @Override
    public int compare(PatientDTO o1, PatientDTO o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
