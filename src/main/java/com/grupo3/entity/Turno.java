package com.grupo3.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.grupo3.dtos.TurnoDTO;
import com.grupo3.dtos.TurnoDTO;

@Entity(name = "Turnos")
public class Turno {
	@Id
	@Column(name = "Id_Turno")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@JoinColumn(name = "Id_Afiliado")
	@ManyToOne
	private Afiliado afiliado;
	
	@Column(name="Fecha_Inicio")
	private Date fechaInicio;
	
	@Column(name="Fecha_Llegada")
	private Date fechaLlegada;
	
	@JoinColumn(name = "Id_Prestador")
	@ManyToOne
	private Prestador prestador;
	
	@JoinColumn(name = "Codigo_Practica")
	@ManyToOne
	private Practica practica;
	
	@Column(name = "Importe")
	private float importe;
	
	@Column(name = "Observaciones")
	private String observaciones;

	@Column(name = "Disponible" , columnDefinition = "BIT", length = 1)
	private boolean disponible;

	/* Constructor Default */
	
	/*Accessors*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Afiliado getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public Prestador getPrestador() {
		return prestador;
	}

	public void setPrestador(Prestador Prestador) {
		this.prestador = prestador;
	}

	public Practica getPractica() {
		return practica;
	}

	public void setPractica(Practica practica) {
		this.practica = practica;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	/* Constructores */
	public Turno(){
	}

	public Turno(TurnoDTO turno) {
	//	this.practica = turno.getPractica();
		this.disponible = true;
		this.fechaInicio = turno.getFechaInicio();
		this.fechaLlegada = turno.getFechaLlegada();
		this.observaciones = turno.getObservaciones();
		//this.afiliado = turno.getAfiliado();
	//	this.prestador = turno.getPrestador();
		this.importe = turno.getImporte();
		
		
		
	}

	public int getPlan() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
}
