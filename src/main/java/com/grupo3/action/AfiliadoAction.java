package com.grupo3.action;

import java.util.ArrayList;
import java.util.List;

import com.grupo3.dao.PlanDAO;
import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Plan;
import com.grupo3.service.AfiliadoService;
import com.opensymphony.xwork2.ActionSupport;

public class AfiliadoAction extends ActionSupport {

	private static final long serialVersionUID = 2085914562745618076L;

	AfiliadoService afiliadoService;
	AfiliadoDTO afiliadoDTO;
	private ArrayList<AfiliadoDTO> listAfiliadoDTO=new ArrayList<AfiliadoDTO>();
	private String lastName;

	public AfiliadoAction(){
	}


	public String guardarAfiliado() {
		this.afiliadoService.saveAfiliado(afiliadoDTO);
		return "saveAfiliado";
	}
	
	
	public String actualizarAfiliado() {
		System.out.println(afiliadoDTO.getMail());
		this.afiliadoService.updateAfiliado(afiliadoDTO);
		return "updateAfiliado";
	}
	

	public String getAllAfiliado() {
		listAfiliadoDTO=afiliadoService.getAfiliados(afiliadoDTO);
		System.out.println(afiliadoDTO.getNombreApellido());
		return "success";
	}

	// Getters y Setters

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

	public ArrayList<AfiliadoDTO> getListAfiliadoDTO() {
		return listAfiliadoDTO;
	}

	public void setListAfiliadoDTO(ArrayList<AfiliadoDTO> listAfiliadoDTO) {
		this.listAfiliadoDTO = listAfiliadoDTO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
