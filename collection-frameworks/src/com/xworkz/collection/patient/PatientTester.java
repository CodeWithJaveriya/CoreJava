package com.xworkz.collection.patient;

import com.xworkz.collection.comparator.AddressComparator;
import com.xworkz.collection.comparator.AgeComparator;
import com.xworkz.collection.comparator.PNameComparator;
import com.xworkz.collection.constants.Gender;

import java.time.temporal.Temporal;
import java.util.*;

public class PatientTester {

    public static void main(String[] args) {

            List<PatientDTO> dtos = new ArrayList<>();
                dtos.add(new PatientDTO(2, "Ramya", 56, "Blore", Gender.female));
                dtos.add(new PatientDTO(1, "Kavya", 65, "Rajajinagar", Gender.female));
                dtos.add(new PatientDTO(4, "Humair", 23, "Kolar", Gender.male));
                dtos.add(new PatientDTO(5, "Basha", 89, "Dehli", Gender.male));
                dtos.add(new PatientDTO(3, "Raghu", 56, "Chikamanglur", Gender.male));

             Collections.sort(dtos);
        System.out.println("For sorting in the form of id");
        for(PatientDTO dto : dtos){
            System.out.println(dto);
        }

             Collections.sort(dtos, new PNameComparator());
        System.out.println("For sorting in the form of name");
        for(PatientDTO dto : dtos){
            System.out.println(dto);
        }

             Collections.sort(dtos, new AddressComparator());
        System.out.println("For sorting in the form of address");
        for(PatientDTO dto : dtos){
            System.out.println(dto);
        }

             Collections.sort(dtos, new AgeComparator());
        System.out.println("For sorting in the form of age");
        for(PatientDTO dto : dtos){
            System.out.println(dto);
        }

            System.out.println(dtos);
        System.out.println(dtos.size());

           /* List<PatientDTO> dtos1 = new ArrayList<>();
            if(dtos1.isEmpty()) {
                dtos1.add(new PatientDTO(6, "Navya", 67, "Hosur", Gender.female));
                dtos1.add(new PatientDTO(7, "Bharat", 78, "Guragon", Gender.male));
            }
            System.out.println(dtos1);
          boolean isAdded = dtos.addAll(dtos1);
        System.out.println(isAdded);

        System.out.println(dtos.get(2));

        System.out.println(dtos1.size());

         dtos.remove(2);
        System.out.println(dtos);

        boolean isRemoved = dtos.removeAll(dtos1);
        System.out.println("Is patient data removed = " + isRemoved);

        for (PatientDTO dto:dtos) {
            System.out.println(dto);
        }*/








    }
}
