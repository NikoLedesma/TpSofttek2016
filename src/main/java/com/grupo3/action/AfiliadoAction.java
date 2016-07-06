package com.grupo3.action;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.service.AfiliadoService;
import com.opensymphony.xwork2.ActionSupport;

public class AfiliadoAction extends ActionSupport {

	private static final long serialVersionUID = 2085914562745618076L;

	AfiliadoService afiliadoService;
	AfiliadoDTO afiliadoDTO;
	private ArrayList<AfiliadoDTO> listAfiliadoDTO;

	// Methods
	public String guardarAfiliado() {
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

	List<AfiliadoDTO> persons = new ArrayList<AfiliadoDTO>();

	public List<AfiliadoDTO> getPersons() {
		return persons;
	}

	public void setPersons(List<AfiliadoDTO> persons) {
		this.persons = persons;
	}

	public String getAllAfiliado() {
		
		AfiliadoDTO afiliadoDTO = new AfiliadoDTO();
		afiliadoDTO.setId(0);
		afiliadoDTO.setNombreApellido("ivan");
		AfiliadoDTO afiliadoDTO1 = new AfiliadoDTO();
		afiliadoDTO1.setId(1);
		afiliadoDTO1.setNombreApellido("carlos");
		AfiliadoDTO afiliadoDTO2 = new AfiliadoDTO();
		afiliadoDTO2.setId(2);
		afiliadoDTO2.setNombreApellido("betoveen");
		AfiliadoDTO afiliadoDTO3 = new AfiliadoDTO();
		afiliadoDTO3.setId(3);
		afiliadoDTO3.setNombreApellido("yo");
		persons.add(afiliadoDTO);
		persons.add(afiliadoDTO1);
		persons.add(afiliadoDTO2);
		persons.add(afiliadoDTO3);

		System.out.println(lastName);
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

}
