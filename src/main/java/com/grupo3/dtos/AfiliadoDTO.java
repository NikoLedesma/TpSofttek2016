package com.grupo3.dtos;

import java.util.Date;
import java.util.List;

import com.grupo3.entity.Afiliado;
import com.grupo3.entity.Plan;

public class AfiliadoDTO {

	private int id;

	private String nombreApellido;

	private String tipoDoc;

	private String numeroDoc;

	private String direccion;
	private String telefono;

	private String mail;

	private Date fechaNacimiento;

	private char sexo;

	private String estadoCivil;

	private Integer plan;

	private Afiliado personaResponsable;

	private Date fechaBaja;

	
	public AfiliadoDTO(){};
	
	public AfiliadoDTO(Afiliado afiliado){
		this.direccion=afiliado.getDireccion();
		this.fechaBaja = afiliado.getFechaBaja();
		this.estadoCivil=afiliado.getEstadoCivil();
		this.fechaNacimiento = afiliado.getFechaNacimiento();
		this.id=afiliado.getId();
		this.mail=afiliado.getMail();
		this.numeroDoc=afiliado.getNumeroDoc();
		this.nombreApellido=afiliado.getNombreApellido();
		this.personaResponsable=afiliado.getPersonaResponsable();
		this.telefono=afiliado.getTelefono();
		this.plan=(Integer)afiliado.getIdPlan();
		this.sexo=afiliado.getSexo();
		this.tipoDoc=afiliado.getTipoDoc();
	}
	
	
	
	/*Accessors*/
	public Afiliado getPersonaResponsable() {
		return personaResponsable;
	}

	public void setPersonaResponsable(Afiliado personaResponsable) {
		this.personaResponsable = personaResponsable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getPlan() {
		return plan;
	}

	public void setPlan(Integer plan) {
		this.plan = plan;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

}
