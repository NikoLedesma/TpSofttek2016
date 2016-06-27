package com.grupo3.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.grupo3.dao.PatientDAO;
import com.grupo3.entity.Patient;
import com.grupo3.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	
	private PatientDAO patientDAO;
	
	@Transactional
	public void savePatient(Patient patient) {
		// TODO Auto-generated method stub
		patientDAO.savePatient(patient);		
	}
	
	@Transactional
	public void updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Patient> getPatientsByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	public PatientDAO getPatientDAO() {
		return patientDAO;
	}

	public void setPatientDAO(PatientDAO patientDAO) {
		this.patientDAO = patientDAO;
	}

}
