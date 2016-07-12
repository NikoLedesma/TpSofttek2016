package com.grupo3.action;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.service.AfiliadoService;
import com.grupo3.service.PatientService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5476308048996680762L;

	private PatientService patientService;
	private AfiliadoService afiliadoService;
	
	 public AfiliadoService getAfiliadoService() {
		return afiliadoService;
	}

	public void setAfiliadoService(AfiliadoService afiliadoService) {
		this.afiliadoService = afiliadoService;
	}

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
	
	public String bajaPatientAction() {

		afiliadoService.deleteAfiliado(afiliadoDTO);
		return "success";
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
