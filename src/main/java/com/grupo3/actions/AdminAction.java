package com.grupo3.actions;

import com.grupo3.dtos.PatientDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4925014518521977625L;
	PatientDTO patientDTO;
	
	 public PatientDTO getPatientDTO() {
		return patientDTO;
	}

	public void setPatientDTO(PatientDTO patientDTO) {
		this.patientDTO = patientDTO;
	}

	public String addPatientAction() {
		 System.out.println(patientDTO.getName());
		 System.out.println(patientDTO.getLastName());
		 return "addPatient";
	 }
	
}
