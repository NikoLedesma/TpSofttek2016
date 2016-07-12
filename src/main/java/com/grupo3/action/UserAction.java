package com.grupo3.action;

import java.util.ArrayList;

import com.grupo3.dao.PlanDAO;
import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Plan;
import com.grupo3.service.AfiliadoService;
import com.grupo3.service.PatientService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = -5476308048996680762L;
	private ArrayList<Plan> planesCombo = new ArrayList<Plan>();
	private PatientService patientService;
	private AfiliadoService afiliadoService;
	private PlanDAO planDAO;

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
		Plan a=new Plan();
		a.setDescripcion("forro");
		Plan b=new Plan();
		b.setDescripcion("kpo");
		planesCombo.add(a);
		planesCombo.add(b);
		return "addPatient";
	}

	public String editPatientAction() {

		// patientService.savePatient(Patient);
		return "editPatient";
	}

	public String bajaPatientAction() {

		afiliadoService.deleteAfiliado(afiliadoDTO);
		return "success";
	}

	public String addTurnoAction() {

		return "addTurno";
	}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	public ArrayList<Plan> getPlanesCombo() {
		return planesCombo;
	}

	public void setPlanesCombo(ArrayList<Plan> planesCombo) {
		this.planesCombo = planesCombo;
	}

	public PlanDAO getPlanDAO() {
		return planDAO;
	}

	public void setPlanDAO(PlanDAO planDAO) {
		this.planDAO = planDAO;
	}

}
