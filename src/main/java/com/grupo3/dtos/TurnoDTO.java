package com.grupo3.dtos;

import java.util.Date;
import java.util.List;

import com.grupo3.entity.Turno;


public class TurnoDTO  {
	
	
	private int idAfiliado;
	private int idPrestador;
	private Date  fechaInicio;
	private Date fechaLlegada;
	private int nroTurn; 
	private String observaciones;
	private int plan;
	private float importe;
	private int codigoPractica;

	
	public TurnoDTO(Turno turno){
//		this.idAfiliado = turno.getIdAfiliado();
		this.idPrestador = turno.getIdPrestador();
		this.fechaInicio = turno.getFechaInicio();
		this.fechaLlegada= turno.getFechaLlegada();
		this.nroTurn = turno.getId();
		this.observaciones = turno.getObservaciones();
//		this.plan=turno.getPlan();
		this.importe=turno.getImporte();
		this.codigoPractica=turno.getCodigoPractica();
	}
	
	/* Accessors*/
	public int getIdAfiliado() {
		return idAfiliado;
	}
	public void setIdAfiliado(int idAfiliado) {
		this.idAfiliado = idAfiliado;
	}
	public int getIdPrestador() {
		return idPrestador;
	}
	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
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
	public int getCodigoPractica() {
		return codigoPractica;
	}
	public void setCodigoPractica(int codigoPractica) {
		this.codigoPractica = codigoPractica;
	}
	

}
