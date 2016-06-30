package com.grupo3.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;
import com.grupo3.service.TurnoService;
import com.grupo3.serviceImpl.TurnoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class TurnoAction extends ActionSupport{

	private static final long serialVersionUID = 2L;
	
	private TurnoDTO turnoDTO;
	private TurnoService turnoService;
	
	

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

	public String findAllTurnos() 
			    
	{
		List<Turno> turnos = turnoService.findAllTurnos(turnoDTO);
		turnoDTO.setTurnos(turnos);
		return "SUCCESS";
					       }
	
	public String addTurn(){
		
		turnoService.addTurn(turnoDTO);
		return "SUCCESS";
	}
	
	public String deleteTurn(){
		turnoService.deleteTurn(turnoDTO);
		return "SUCCESS";
	}
	
	public String updateTurn(){
		turnoService.updateTurn(turnoDTO);
		return "SUCCESS";
	}
	
}
