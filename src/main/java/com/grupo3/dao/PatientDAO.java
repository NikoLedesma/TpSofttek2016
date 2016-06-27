package com.grupo3.dao;

import java.util.List;

import com.grupo3.entity.Patient;

public interface PatientDAO {
	public void savePatient(Patient patient);

	public void updatePatient(Patient patient);

	public void deletePatient(Patient patient);

	public List <Patient> getPatientsByFirstName(String firstName);
}
