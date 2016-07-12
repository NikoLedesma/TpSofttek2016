package com.grupo3.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;

import com.grupo3.dtos.AfiliadoDTO;

@Transactional
@Entity(name = "Afiliados")
public class Afiliado {

	@Id
	@Column(name = "Id_Afiliado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@OneToMany(mappedBy="personaResponsable",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
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
	
	public Afiliado(AfiliadoDTO afiliadoDTO) {
		this.id = afiliadoDTO.getId();
		this.nombreApellido = afiliadoDTO.getNombreApellido();
		this.tipoDoc = afiliadoDTO.getTipoDoc();
		this.numeroDoc = afiliadoDTO.getNumeroDoc();
		this.direccion = afiliadoDTO.getDireccion();
		this.telefono = afiliadoDTO.getTelefono();
		this.mail = afiliadoDTO.getMail();
		this.fechaNacimiento = afiliadoDTO.getFechaNacimiento();
		this.sexo = afiliadoDTO.getSexo();
		this.estadoCivil = afiliadoDTO.getEstadoCivil();
//		this.plan = afiliadoDTO.getPlan();
		this.personaResponsable = afiliadoDTO.getPersonaResponsable();
		this.fechaBaja = afiliadoDTO.getFechaBaja();
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

	public void setCambios(AfiliadoDTO afiliadoDTO) {

        this.setDireccion(afiliadoDTO.getDireccion());
        this.setEstadoCivil(afiliadoDTO.getEstadoCivil());
        this.setMail(afiliadoDTO.getMail());
        this.setTelefono(afiliadoDTO.getTelefono()); 
		
	}

}
