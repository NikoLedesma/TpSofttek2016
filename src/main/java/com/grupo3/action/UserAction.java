package com.grupo3.action;

import java.util.ArrayList;
import java.util.List;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.dtos.PracticaDTO;
import com.grupo3.dtos.PrestadorDTO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Practica;
import com.grupo3.entity.Prestador;
import com.grupo3.service.AfiliadoService;
import com.grupo3.service.PatientService;
import com.grupo3.service.TurnoService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = -5476308048996680762L;
	private ArrayList<Integer> planesCombo = new ArrayList<Integer>();
	private PatientService patientService;
	private AfiliadoService afiliadoService;
	private TurnoService turnoService;
	private List<PracticaDTO> practicasCombo;
	private List<PrestadorDTO> prestadoresCombo;
	private AfiliadoDTO afiliadoDTO;
	private TurnoDTO turnoDTO;

	public String addPatientAction() {
		planesCombo.add(210);
		planesCombo.add(310);
		planesCombo.add(410);
		planesCombo.add(510);
		
		return "addPatient";
	}

	public String editPatientAction() {

		return "editPatient";
	}

	public String bajaPatientAction() {

		afiliadoService.deleteAfiliado(afiliadoDTO);
		return "success";
	}

	public String bajaTurnoAction() {

		turnoService.deleteTurno(turnoDTO);
		return "success";
	}
	
	public String addTurnoAction() {
		practicasCombo= turnoService.getPracticas();
		prestadoresCombo= turnoService.getPrestadores();
		return "addTurno";
	}
	
	public String editTurnoAction() {
		turnoDTO = turnoService.getTurnoById(turnoDTO.getNroTurn());		
		return "editTurno";
	}


	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	public ArrayList<Integer> getPlanesCombo() {
		return planesCombo;
	}

	public void setPlanesCombo(ArrayList<Integer> planesCombo) {
		this.planesCombo = planesCombo;
	}
	public TurnoService getTurnosService() {
		return turnoService;
	}

	public void setTurnosService(TurnoService turnoService) {
		this.turnoService = turnoService;
	}

	public List<PracticaDTO> getPracticasCombo() {
		return practicasCombo;
	}

	public void setPracticasCombo(List<PracticaDTO> practicasCombo) {
		this.practicasCombo = practicasCombo;
	}

	public List<PrestadorDTO> getPrestadoresCombo() {
		return prestadoresCombo;
	}

	public void setPrestadoresCombo(List<PrestadorDTO> prestadoresCombo) {
		this.prestadoresCombo = prestadoresCombo;
	}
	
	public TurnoService getTurnoService() {
		return turnoService;
	}

	public void setTurnoService(TurnoService turnoService) {
		this.turnoService = turnoService;
	}

	
	public AfiliadoService getAfiliadoService() {
		return afiliadoService;
	}

	public void setAfiliadoService(AfiliadoService afiliadoService) {
		this.afiliadoService = afiliadoService;
	}


	public AfiliadoDTO getAfiliadoDTO() {
		return afiliadoDTO;
	}

	public void setAfiliadoDTO(AfiliadoDTO afiliadoDTO) {
		this.afiliadoDTO = afiliadoDTO;
	}

	public TurnoDTO getTurnoDTO() {
		return turnoDTO;
	}

	public void setTurnoDTO(TurnoDTO turnoDTO) {
		this.turnoDTO = turnoDTO;
	}

}
