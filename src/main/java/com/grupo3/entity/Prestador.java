package com.grupo3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Prestadores")
public class Prestador {
	@Id
	@Column(name = "Id_Prestador")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "ApellidoYNombre")
	private String apellidoYNombre;
	
	@Column(name = "Filial")
	private String filial;
	
	@Column(name = "Especialidad")
	private String especialidad;
	
	@Column(name = "Domicilio")
	private String domicilio;
	
	@Column(name = "Localiad")
	private String localidad;
	
	@Column(name = "Telefono")
	private String telefono;

	/* Constructor default*/
	public Prestador() {}

	/* Accessors */
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
