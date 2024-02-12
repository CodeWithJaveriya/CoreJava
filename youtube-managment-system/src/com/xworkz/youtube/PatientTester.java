package com.xworkz.youtube;

import com.xworkz.youtube.comparator.PNameComparator;
import com.xworkz.youtube.dto.PatientDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PatientTester {

    public static void main(String[] args) {

        List<PatientDTO> patientDTOList = new ArrayList<>();
        patientDTOList.add(new PatientDTO(1, "Sushma"));
        patientDTOList.add(new PatientDTO(2,"Rohit"));
        patientDTOList.add(new PatientDTO(3,"Kavya"));
        patientDTOList.add(new PatientDTO(4,"Javeriya"));
        patientDTOList.add(new PatientDTO(5,"Fahema"));

        Collections.sort(patientDTOList, new PNameComparator());
        System.out.println("For sorting in the form of name");
        for(PatientDTO dto : patientDTOList){
            System.out.println(dto);
        }
    }
}
