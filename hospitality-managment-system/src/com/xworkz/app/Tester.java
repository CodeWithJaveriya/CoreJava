package com.xworkz.app;

import com.sun.org.apache.xpath.internal.operations.String;
import com.xworkz.app.constant.BloodGroup;
import com.xworkz.app.constant.Gender;
import com.xworkz.app.dto.PatientDTO;

import com.xworkz.app.exception.*;
import com.xworkz.app.impl.AppoloHospitalImpl;
import com.xworkz.app.impl.Hospital;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        AppoloHospitalImpl hos = new AppoloHospitalImpl(sc.nextInt());
        for (int index = 0; index < hos.patient.length; index++) {
            PatientDTO dto = new PatientDTO();

            System.out.println("Enter patient Name : ");
            dto.setPatientName(sc.next());
            System.out.println("Enter patient Age : ");
            dto.setAge(sc.nextInt());
            System.out.println("Enter patient BloodGroup: ");
            dto.setBloodGroup(BloodGroup.valueOf(sc.next()));
            System.out.println("Enter patient Gender : ");
            dto.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter patient Phone Number: ");
            dto.setPhoneNumber(sc.nextLong());
            System.out.println("Enter patient Address : ");
            dto.setAddress(sc.next());
            System.out.println("Enter patient Attender Name: ");
            dto.setAttenderName(sc.next());

            hos.createPatient(dto);

        }
       // hos.getPatient();

        String userInput = null;
        do {
            System.out.println("Press 1 To get all patients");
            System.out.println("Press 2 To get attender name");
            System.out.println("Press 3 To get patient gender");
            System.out.println("Press 4 To get patient age");
            System.out.println("Press 5 to get patient address");
            System.out.println("Press 6 to get patient blood group");
            System.out.println("Press 7 to update patient name by patient age");
            System.out.println("Press 8 to update patient name by patient id");
            System.out.println("Press 9 to update");
            int options = sc.nextInt();
            switch (options) {
                case 1:
                    hos.getPatient();
                    break;

                case 2:
                    System.out.println("Enter the patient id to get attender name");
                    try {
                        String getPatientAttenderByPatientID = hos.getPatientAttenderNameByPatientId(sc.nextInt());
                        System.out.println(getPatientAttenderByPatientID);
                    } catch (AttenderNotFoundException p) {
                      p.printStackTrace();
                    }

                    break;

                case 3 :
                    System.out.println("Enter the patient name to get patient gender ");
                    try {
                        Gender gender = hos.getPatientGenderByPatientName(sc.next());
                        System.out.println(gender);
                    }catch(GenderNotFoundException g){
                        g.printStackTrace();

                    }
                    break;

                case 4 :
                    System.out.println("Enter patient id to get patient age");
                    try {
                        int patientId = hos.getPatientAgeByPatientId(sc.nextInt());
                        System.out.println(patientId);
                    }catch(PatientAgeNotFoundException p){
                        p.printStackTrace();
                    }
                    break;

                case 5 :
                    System.out.println("Enter patient name to get patient address");
                    try {
                        String patientAddress = hos.getPatientAddressByPatientName(sc.next());
                        System.out.println(patientAddress);
                    }catch (AddressNotFoundException a){
                        a.printStackTrace();
                    }
                    break;

                case 6 :
                    System.out.println("Enter patient name to get patient blood group");
                    try {
                        BloodGroup bloodGroup = hos.getPatientBloodGroupByPatientName(sc.next());
                        System.out.println(bloodGroup);
                    }catch(BloodGroupNotFoundException b){
                        b.printStackTrace();
                    }
                    break;

                case 7 :
                    System.out.println("Enter patient name and patient age to be updated");
                    try {
                        boolean isAgeUpdated = hos.updatePatientAgeByPatientName(sc.next(), sc.nextInt());
                        System.out.println(isAgeUpdated);
                    }catch(PatientAgeNotUpdatedException p){
                        p.printStackTrace();
                    }
                    finally {
                        System.out.println("Entering into finally block");
                        if(sc == null){
                            sc.close();
                        }
                }
                    break;

                case 8:
                    System.out.println("Enter patient id and the patient name to be updated");
                    try {
                        boolean isNameUpdated = hos.updatePatientNameByPatientId(sc.nextInt(), sc.next());
                        System.out.println(isNameUpdated);
                    }catch (PatientNameNotUpdatedException e){
                        e.printStackTrace();
                    }
                    break;

                case 9 :
                    System.out.println("Enter the patient name and gender to be updated");
                    try {
                        boolean isGenderUpdated = hos.updatePatientGenderByPatientName(sc.next(), Gender.valueOf(sc.next()));
                        System.out.println(isGenderUpdated);
                    }catch(GenderNotUpdatedException g){
                        g.printStackTrace();
                    }
                    break;
            }
            System.out.println("Do you want to continue or not :  Yes or No");
            userInput = sc.next();
        }while (userInput.equals("Yes")) ;
            System.out.println("Thank you... Visit Again!!!!!");



    }
}
