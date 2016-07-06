package com.grupo3.action;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.service.AfiliadoService;
import com.opensymphony.xwork2.ActionSupport;

public class AfiliadoAction extends ActionSupport {

	private static final long serialVersionUID = 2085914562745618076L;
	
	AfiliadoService afiliadoService;
	AfiliadoDTO afiliadoDTO;
	private ArrayList<AfiliadoDTO> listAfiliadoDTO ;
	
	
	 // Methods 
	public String guardarAfiliado(){
//		Afiliado afiliado = new Afiliado();
		this.afiliadoService.saveAfiliado(afiliadoDTO);
		return "saveAfiliado";
	}
	
	
	private String lastName;
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	private Map<String, String> persons = new LinkedHashMap<String, String>();
	public String getAllAfiliado(){
		
		//listAfiliadoDTO = afiliadoService.getAfiliados(afiliadoDTO);
		persons.put("1", "ivan");
		persons.put("2", "bethoveen");
		persons.put("3", "niko");
		persons.put("4", "carlos");
	
        System.out.println(lastName);
		return "success";
		}
	
	// Getters y Setters
	

	public Map<String, String> getPersons() {
		return persons;
	}

	public void setPersons(Map<String, String> persons) {
		this.persons = persons;
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
