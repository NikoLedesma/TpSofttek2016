package com.grupo3.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grupo3.dao.PatientDAO;
import com.grupo3.entity.Patient;

public class PatientDAOImpl implements PatientDAO{

	
	private SessionFactory sessionFactory;
	
	

	public void savePatient(Patient patient) {
		Session s=this.sessionFactory.getCurrentSession();
		s.save(patient);
	}

	public void updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	public List<Patient> getPatientsByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
