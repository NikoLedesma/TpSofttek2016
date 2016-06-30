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
	
	private TurnoDTO turnoDto;
	private TurnoService turnoBO;
	
	
	public TurnoDTO getTurnoDto() {
		return turnoDto;
	}

	public void setTurnoDto(TurnoDTO turnoDto) {
		this.turnoDto = turnoDto;
	}

	public TurnoService getTurnoBO() {
		return turnoBO;
	}

	public void setTurnoBO(TurnoService turnoBO) {
		this.turnoBO = turnoBO;
	}

	public String findAllTurnos() 
			    
	{
		List<Turno> turnos = turnoBO.findAllTurnos(turnoDto);
		turnoDto.setTurnos(turnos);
		return "SUCCESS";
					       }
	
	public String addTurn(){
		
		
		
		
		
		
		return "SUCCESS";
	}
	
}
