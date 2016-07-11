package com.grupo3.action;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.service.PatientService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5476308048996680762L;

	private PatientService patientService;
	
	 AfiliadoDTO afiliadoDTO;


	public AfiliadoDTO getAfiliadoDTO() {
		return afiliadoDTO;
	}

	public void setAfiliadoDTO(AfiliadoDTO afiliadoDTO) {
		this.afiliadoDTO = afiliadoDTO;
	}
	
	public String addPatientAction() {

		//patientService.savePatient(Patient);
		return "addPatient";
	}
	
	public String editPatientAction() {

		//patientService.savePatient(Patient);
		return "editPatient";
	}
	public String addTurnoAction (){
		
	return "addTurno";	
	}
	
	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	
}
