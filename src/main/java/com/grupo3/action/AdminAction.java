package com.grupo3.action;

import java.util.ArrayList;
import java.util.List;

import com.grupo3.dtos.PatientDTO;
import com.grupo3.entity.Patient;
import com.grupo3.service.PatientService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4925014518521977625L;



	private PatientService patientService;

	PatientDTO patientDTO;

	public String addPatientAction() {
		//example: mostramos que el dto recibe segun lo q  pongamos en el formulario
		System.out.println(patientDTO.getName());
		System.out.println(patientDTO.getLastName());
		//le mando un patient a un service para que me lo guarde en la base de datos
		Patient sd = new Patient();
		sd.setFirstName("Niko");
		sd.setLastName("Ledesma");
		patientService.savePatient(sd);
		return "addPatient";
	}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientBO) {
		this.patientService = patientBO;
	}
	
	public PatientDTO getPatientDTO() {
		return patientDTO;
	}

	public void setPatientDTO(PatientDTO patientDTO) {
		this.patientDTO = patientDTO;
	}
}
