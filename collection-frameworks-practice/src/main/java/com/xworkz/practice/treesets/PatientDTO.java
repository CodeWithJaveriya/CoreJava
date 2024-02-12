package com.xworkz.practice.treesets;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PatientDTO implements Comparable<PatientDTO> {

    private int id;
    private String name;

    @Override
    public int compareTo(PatientDTO o) {
        return 0;
    }
}
