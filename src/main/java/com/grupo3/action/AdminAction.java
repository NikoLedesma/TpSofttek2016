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

	List<Patient> list;

	public List<Patient> getList() {
		return list;
	}

	public void setList(List<Patient> list) {
		this.list = list;
	}

	private PatientService patientService;

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientBO) {
		this.patientService = patientBO;
	}

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
		list = new ArrayList<Patient>();
		Patient a= new Patient();
		a.setId(1);
		a.setFirstName("aaaa");
		a.setLastName("AAAA");
		Patient b= new Patient();
		b.setId(2);
		b.setFirstName("bbbb");
		b.setLastName("BBBB");
		Patient c= new Patient();
		c.setId(3);
		c.setFirstName("cccc");
		c.setLastName("CCCC");
		list.add(a);
		list.add(b);
		list.add(c);
		Patient sd = new Patient();
		sd.setFirstName("Niko");
		sd.setLastName("Ledesma");
		patientService.savePatient(sd);
		return "addPatient";
	}

}
