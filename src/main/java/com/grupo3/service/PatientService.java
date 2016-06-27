package com.grupo3.service;

import java.util.List;

import com.grupo3.entity.Patient;

public interface PatientService {

	public void savePatient(Patient patient);

	public void updatePatient(Patient patient);

	public void deletePatient(Patient patient);

	public List <Patient> getPatientsByFirstName(String firstName);
}
