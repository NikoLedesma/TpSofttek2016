package com.grupo3.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.entity.Turno;
import com.grupo3.service.TurnoService;
import com.grupo3.serviceImpl.TurnoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class TurnoAction extends ActionSupport{

	private static final long serialVersionUID = 2L;
	
	private TurnoDTO turnoDTO;
	private TurnoService turnoService;
	private List<TurnoDTO> turnosDTO;
	

	public List<TurnoDTO> getTurnosDTO() {
		return turnosDTO;
	}

	public void setTurnosDTO(List<TurnoDTO> turnosDTO) {
		this.turnosDTO = turnosDTO;
	}

	public TurnoDTO getTurnoDTO() {
		return turnoDTO;
	}

	public void setTurnoDTO(TurnoDTO turnoDTO) {
		this.turnoDTO = turnoDTO;
	}



	public TurnoService getTurnoService() {
		return turnoService;
	}

	public void setTurnoService(TurnoService turnoService) {
		this.turnoService = turnoService;
	}

	public String findAllTurnos() {
			    
		turnosDTO = turnoService.findAllTurnos(turnoDTO);
		return "SUCCESS";
					       }
	
	public String addTurno(){
		this.turnoService.addTurno(turnoDTO);
		
		return "SUCCESS";
	}
	
	public String deleteTurn(){
		turnoService.deleteTurno(turnoDTO);
		return "SUCCESS";
	}
	
	public String updateTurn(){
		turnoService.updateTurno(turnoDTO);
		return "SUCCESS";
	}
	
}
