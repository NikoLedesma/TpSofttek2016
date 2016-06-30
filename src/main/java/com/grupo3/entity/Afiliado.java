package com.grupo3.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "Afiliado")
public class Afiliado {

	@Id
	@Column(name = "Id_Afiliado")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Nombre_Apellido")
	private String nombreApellido;
	
	@Column(name = "Tipo_Doc")
	private String tipoDoc;
	
	@Column(name = "Numero_Doc")
	private String numeroDoc;
	
	@Column(name = "Direccion")
	private String direccion;
	
	@Column(name = "Telefono")
	private String telefono;
	
	@Column(name = "Mail")
	private String mail;
	
	@Column(name = "Fecha_Nac")
	private Date fechaNacimiento;
	
	@Column(name = "Sexo")
	private char sexo;
	
	@Column(name = "Estado_Civil")
	private String estadoCivil;
	
//	@JoinColumn(name = "ID_Plan")
//	@ManyToOne
//	private Plan plan;
	@ManyToOne
	@JoinColumn(name = "Id_Persona_ACargo")
	private Afiliado personaResponsable;

	@OneToMany(mappedBy="personaResponsable")
	List<Afiliado> afiliadosACargo;
	
	
	
	public Afiliado getPersonaResponsable() {
		return personaResponsable;
	}

	public void setPersonaResponsable(Afiliado personaResponsable) {
		this.personaResponsable = personaResponsable;
	}

	public List<Afiliado> getAfiliadosACargo() {
		return afiliadosACargo;
	}

	public void setAfiliadosACargo(List<Afiliado> afiliadosACargo) {
		this.afiliadosACargo = afiliadosACargo;
	}

	@Column(name = "Fecha_Baja")	
	private Date fechaBaja;
	
	
	/*Constructores*/
	
	public Afiliado(){}
	
	public Afiliado(int id, String nombreApellido, String tipoDoc,
			String numeroDoc, String direccion, String telefono, String mail,
			Date fechaNacimiento, char sexo, String estadoCivil, Plan plan,
			Afiliado personaResponsable, Date fechaBaja) {
		this.id = id;
		this.nombreApellido = nombreApellido;
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mail = mail;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
//		this.plan = plan;
		this.personaResponsable = personaResponsable;
		this.fechaBaja = fechaBaja;
	}

	public Afiliado getPersonaACargo() {
		return personaResponsable;
	}

	public void setPersonaACargo(Afiliado personaACargo) {
		this.personaResponsable = personaACargo;
	}

	/*Getters y setters*/	
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

//	public Plan getPlan() {
//		return plan;
//	}
//
//	public void setPlan(Plan plan) {
//		this.plan = plan;
//	}

	
	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

}
