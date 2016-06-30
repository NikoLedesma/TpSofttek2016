package com.grupo3.dtos;

import java.util.List;

import com.grupo3.entity.Turno;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class TurnoDTO  {
	
	private int idAfiliado;
	private int idProfesional;
	private java.util.Date  horaDeInicio;
	private java.util.Date horaDeLlegada;
	private int nroTurn; 
	private String observaciones;
	private int plan;
	private float importe;
	private int practiceNumber;

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	
	public java.util.Date getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(java.util.Date horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public java.util.Date getHoraDeLlegada() {
		return horaDeLlegada;
	}

	public void setHoraDeLlegada(java.util.Date horaDeLlegada) {
		this.horaDeLlegada = horaDeLlegada;
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

	public int getPracticeNumber() {
		return practiceNumber;
	}

	public void setPracticeNumber(int practiceNumber) {
		this.practiceNumber = practiceNumber;
	}

	private List<Turno> turnos;
	
	public int getIdAfiliado() {
		return idAfiliado;
	}

	public void setIdAfiliado(int idAfiliado) {
		this.idAfiliado = idAfiliado;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
	
	
	
}
