package com.grupo3.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.entity.Turno;
import com.grupo3.service.AfiliadoService;
import com.grupo3.service.TurnoService;
import com.grupo3.serviceImpl.AfiliadoServiceImpl;
import com.grupo3.serviceImpl.TurnoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class TurnoAction extends ActionSupport{


	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 5419318238961534643L;
	private TurnoDTO turnoDTO;
	private TurnoService turnoService;
	private ArrayList<TurnoDTO> turnosDTO=new ArrayList<TurnoDTO>();
	private AfiliadoService afiliadoService;
	
	public ArrayList<TurnoDTO> getTurnosDTO() {
		return turnosDTO;
	}

	public void setTurnosDTO(ArrayList<TurnoDTO> turnosDTO) {
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
			    
		turnosDTO = (ArrayList<TurnoDTO>) turnoService.findAllTurnos(turnoDTO);
		return "success";
					       }
	
	public String addTurno(){
		
		turnoDTO.setAfiliado(afiliadoService.getAfiliadoById(turnoDTO.getIdAfiliado()));
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

	public AfiliadoService getAfiliadoService() {
		return afiliadoService;
	}

	public void setAfiliadoService(AfiliadoService afiliadoService) {
		this.afiliadoService = afiliadoService;
	}
	
}
