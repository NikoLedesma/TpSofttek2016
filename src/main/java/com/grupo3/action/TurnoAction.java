package com.grupo3.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;
import com.grupo3.service.TurnoBO;
import com.grupo3.service.TurnoBOImpl;
import com.opensymphony.xwork2.ActionSupport;

public class TurnoAction extends ActionSupport{

	private static final long serialVersionUID = 2L;
	
	private TurnoDTO turnoDto;
	private TurnoBO turnoBO;
	
	public TurnoDTO getTurnoDto() {
		return turnoDto;
	}

	public void setTurnoDto(TurnoDTO turnoDto) {
		this.turnoDto = turnoDto;
	}

	public TurnoBO getTurnoBO() {
		return turnoBO;
	}

	public void setTurnoBO(TurnoBO turnoBO) {
		this.turnoBO = turnoBO;
	}

	public String execute() 
			       {
			
			
					
		List<Turno> list = turnoBO.findAllTurnos(turnoDto.idAfiliado);
				/*	
				dynaCustomerListForm.set("customerList", list);
				        
				return mapping.findForward("success");
				  */
		return "SUCCESS";
		
			       }
	
}
