package com.xworkz.app.impl;

import com.xworkz.app.constant.BloodGroup;
import com.xworkz.app.constant.Gender;
import com.xworkz.app.dto.PatientDTO;
import com.xworkz.app.exception.*;


public class AppoloHospitalImpl implements Hospital {


   public  PatientDTO[] patient;

    public AppoloHospitalImpl(int size){

        patient = new PatientDTO[size];
    }
    int index = 0;
    int id = 0;

    @Override
    public boolean createPatient(PatientDTO patient) {

        boolean isAdded = false;

        if (patient != null) {
            patient.setPatientId(++id);
            this.patient[index++] = patient;
            isAdded = true;
        } else {
            System.out.println("Provide proper details");
        }
        return isAdded;
    }

    @Override
    public void getPatient(){
        for(int patientIndex =0; patientIndex < patient.length; patientIndex++){
            System.out.println(patient[patientIndex]);
        }
    }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) throws AttenderNotFoundException{
        String attenderName = null;
        for(int index = 0; index < patient.length; index++){
            if(patient[index].getPatientId() == patientId){
                attenderName = patient[index].getAttenderName();
            }
        }
        if(attenderName == null){
            AttenderNotFoundException attenderNotFoundException = new AttenderNotFoundException("Attender name not found for given patient id....");
                throw attenderNotFoundException;

        }
        return attenderName;
    }

   @Override
   public Gender getPatientGenderByPatientName(String patientName) throws GenderNotFoundException{
       Gender gender = null;
       for(int index = 0; index < patient.length; index++){
           if(patient[index].getPatientName().equals(patientName)){
               gender = patient[index].getGender();
           }
       }
       if(gender == null){
           GenderNotFoundException genderNotFoundException = new GenderNotFoundException("Gender not found for the given patient name....");
           throw genderNotFoundException;
       }
       return gender;
   }

   @Override
   public int getPatientAgeByPatientId(int patientId) throws PatientAgeNotFoundException{
       int patientAge = 0;
       for(int index = 0 ; index < patient.length; index ++){
           if(patient[index].getPatientId() == patientId){
               patientAge = patient[index].getAge();
           }
       }
       if(patientAge == 0){
           PatientAgeNotFoundException patientAgeNotFoundException = new PatientAgeNotFoundException("No age found for this patient id");
           throw patientAgeNotFoundException;
       }
       return patientAge;
   }

   @Override
   public String getPatientAddressByPatientName(String patientName) throws AddressNotFoundException{
       String patientAddress = null;
       for(int index = 0 ; index < patient.length; index++){
           if(patient[index].getPatientName().equals(patientName)){
               patientAddress = patient[index].getAddress();
           }
       }
       if(patientAddress == null){
           AddressNotFoundException addressNotFoundException = new AddressNotFoundException("Address not found for this patient name ");
           throw addressNotFoundException;
       }
       return patientAddress;
   }

    @Override
    public BloodGroup getPatientBloodGroupByPatientName(String patientName) throws BloodGroupNotFoundException{
        BloodGroup bloodGroup = null;
        for(int index = 0; index < patient.length ; index++){
            if(patient[index].getPatientName().equals(patientName)){
                bloodGroup = patient[index].getBloodGroup();
            }
        }
        if(bloodGroup == null){
            BloodGroupNotFoundException bloodGroupNotFoundException = new BloodGroupNotFoundException("Blood group not found for this patient name");
            throw bloodGroupNotFoundException;
        }
        return bloodGroup;
    }

    @Override
    public boolean updatePatientAgeByPatientName(String existingPatientName, int updatedAge) throws PatientAgeNotUpdatedException{
        boolean isAgeUpdated = false;
        for(int index = 0; index< patient.length; index++) {
            if (existingPatientName != null && updatedAge > 0) {
                if (patient[index].getPatientName().equals(existingPatientName)) {
                    patient[index].setAge(updatedAge);
                    isAgeUpdated = true;
                }
            }
        }
        if(!isAgeUpdated){
            PatientAgeNotUpdatedException patientAgeNotUpdatedException = new PatientAgeNotUpdatedException("Cannot update as patient age is not found");
            throw patientAgeNotUpdatedException;
        }
        return isAgeUpdated;
    }

    @Override
    public boolean updatePatientNameByPatientId(int patientId, String updatedPatientName) throws PatientNameNotUpdatedException{
        boolean isNameUpdated = false;
        for(int index = 0 ; index < patient.length; index++){
            if(patient[index].getPatientId() == patientId){
                patient[index].setPatientName(updatedPatientName);
                isNameUpdated = true;
            }
        }
        if(!isNameUpdated){
            PatientNameNotUpdatedException patientNameNotUpdatedException = new PatientNameNotUpdatedException("Cannot update patient name for these values");
            throw patientNameNotUpdatedException;
        }
        return isNameUpdated;
    }

    @Override
    public boolean updatePatientGenderByPatientName( String existingPatientName, Gender updatedGender) throws GenderNotUpdatedException{
        boolean isGenderUpdated = false;
        for(int index = 0; index < patient.length; index++){
            if(patient[index].equals(existingPatientName)){
                patient[index].setGender(updatedGender);
                isGenderUpdated = true;
            }
        }
        if(!isGenderUpdated){
            GenderNotUpdatedException genderNotUpdatedException = new GenderNotUpdatedException("Cannot update gender for these values....");
            throw genderNotUpdatedException;
        }
        return isGenderUpdated;
    }
}
