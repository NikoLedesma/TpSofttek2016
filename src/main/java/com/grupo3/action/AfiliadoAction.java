package com.grupo3.action;

import java.util.ArrayList;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.service.AfiliadoService;
import com.opensymphony.xwork2.ActionSupport;

public class AfiliadoAction extends ActionSupport {

	private static final long serialVersionUID = 2085914562745618076L;
	
	AfiliadoService afiliadoService;
	AfiliadoDTO afiliadoDTO;

	private static ArrayList<Afiliado> listAfiliado;
	private ArrayList<AfiliadoDTO> listAfiliadoDTO ;
	
	
	 // Methods 
	public String guardarAfiliado(){
//		Afiliado afiliado = new Afiliado();
		this.afiliadoService.saveAfiliado(afiliadoDTO);
		return "saveAfiliado";
	}
	
	public String getAllAfiliado(){
		listAfiliadoDTO = afiliadoService.getAfiliados(afiliadoDTO);
		for (AfiliadoDTO a : listAfiliadoDTO) {
			System.out.println(a.getNombreApellido());
			System.out.println(a.getId());
		  }
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

	public static ArrayList<Afiliado> getListAfiliado() {
		return listAfiliado;
	}

	public static void setListAfiliado(ArrayList<Afiliado> listAfiliado) {
		AfiliadoAction.listAfiliado = listAfiliado;
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
	
	
}
