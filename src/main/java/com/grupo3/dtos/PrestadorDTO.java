package com.grupo3.dtos;

import com.grupo3.entity.Prestador;


public class PrestadorDTO {
	private int id;

	private String apellidoYNombre;

	private String filial;

	private String especialidad;

	private String domicilio;

	private String localidad;

	private String telefono;
	
	public PrestadorDTO(){};
	
	public PrestadorDTO(Prestador prestador){
		id = prestador.getId();
		apellidoYNombre = prestador.getApellidoYNombre();
		filial = prestador.getFilial();
		especialidad = prestador.getEspecialidad();
		domicilio = prestador.getDomicilio();
		localidad = prestador.getLocalidad();
		telefono = prestador.getTelefono();
	};
	
	/*Accessors*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidoYNombre() {
		return apellidoYNombre;
	}

	public void setApellidoYNombre(String apellidoYNombre) {
		this.apellidoYNombre = apellidoYNombre;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
