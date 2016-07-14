package com.grupo3.dtos;

import java.util.Date;

import com.grupo3.entity.Afiliado;
import com.grupo3.entity.Practica;
import com.grupo3.entity.Prestador;
import com.grupo3.entity.Turno;


public class TurnoDTO  {
	
	
	private Afiliado afiliado;
	private int idAfiliado;
	private int prestador;
	private Date  fechaInicio;
	private Date fechaLlegada;
	private int nroTurn; 
	private String observaciones;
	private int plan;
	private float importe;
	private int practica;

	public TurnoDTO(){}
	
	public TurnoDTO(Turno turno){
		this.afiliado = turno.getAfiliado();
		this.prestador = turno.getPrestador().getId();
		this.fechaInicio = turno.getFechaInicio();
		this.fechaLlegada= turno.getFechaLlegada();
		this.nroTurn = turno.getId();
		this.observaciones = turno.getObservaciones();
		this.plan=turno.getPlan();
		this.importe=turno.getImporte();
		this.practica=turno.getPractica().getCodigo();
	}
	
	/* Accessors*/


	public Date getFechaInicio() {
		return fechaInicio ;
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
	public int getNroTurn() {
		return nroTurn;
	}
	public void setNroTurn(int nroTurn) {
		this.nroTurn = nroTurn;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}


	public int getIdAfiliado() {
		return idAfiliado;
	}

	public void setIdAfiliado(int idAfiliado) {
		this.idAfiliado = idAfiliado;
	}
	
	public Afiliado getAfiliado() {
		return afiliado;
	}
	
	public void setAfiliado(Afiliado afiliado) {
		this.afiliado = afiliado;
	}

	public int getPrestador() {
		return prestador;
	}

	public void setPrestador(int prestador) {
		this.prestador = prestador;
	}

	public int getPractica() {
		return practica;
	}

	public void setPractica(int practica) {
		this.practica = practica;
	}
	

}
