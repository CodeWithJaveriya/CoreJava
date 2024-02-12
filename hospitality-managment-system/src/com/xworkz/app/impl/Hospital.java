package com.xworkz.app.impl;

import com.xworkz.app.constant.BloodGroup;
import com.xworkz.app.constant.Gender;
import com.xworkz.app.dto.PatientDTO;
import com.xworkz.app.exception.*;


public interface Hospital {

    public boolean createPatient(PatientDTO patient);

    public void getPatient();

    public String getPatientAttenderNameByPatientId(int patientId) throws AttenderNotFoundException;

    public Gender getPatientGenderByPatientName(String patientName) throws GenderNotFoundException;

    public int getPatientAgeByPatientId(int patientId) throws PatientAgeNotFoundException;

    public String getPatientAddressByPatientName(String patientName) throws AddressNotFoundException;

    public BloodGroup getPatientBloodGroupByPatientName(String patientName) throws BloodGroupNotFoundException;

    public boolean updatePatientAgeByPatientName(String existingPatientName, int updatedAge) throws PatientAgeNotUpdatedException;

    public boolean updatePatientNameByPatientId(int patientId, String updatedPatientName) throws PatientNameNotUpdatedException;

    public boolean updatePatientGenderByPatientName( String existingPatientName, Gender updatedGender) throws GenderNotUpdatedException;
}
