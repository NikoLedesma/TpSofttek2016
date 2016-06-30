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

@Entity(name = "Turno")
public class Turno {
	@Id
	@Column(name = "Id_Turno")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
//	@JoinColumn(name = "Afiliados")
//	@ManyToOne
//	private int idAfiliado;
//	
	@Column
	private Date fechaInicio;
	
	@Column
	private Date fechaLlegada;
	
	@JoinColumn(name = "Id_Prestador")
	private int idPrestador;
	
	@JoinColumn(name = "Codgo_Practica")
	private int codigoPractica;
	
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

//	public int getIdAfiliado() {
//		return idAfiliado;
//	}
//
//	public void setIdAfiliado(int idAfiliado) {
//		this.idAfiliado = idAfiliado;
//	}

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

	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}

	public int getCodigoPractica() {
		return codigoPractica;
	}

	public void setCodigoPractica(int codigoPractica) {
		this.codigoPractica = codigoPractica;
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

	public void setValores(TurnoDTO turno) {
		this.codigoPractica = turno.getPracticeNumber();
		this.disponible = true;
		this.fechaInicio = turno.getHoraDeInicio();
		this.fechaLlegada = turno.getHoraDeLlegada();
		this.observaciones = turno.getObservaciones();
//		this.idAfiliado = turno.getIdAfiliado();
		this.idPrestador = turno.getIdProfesional();
		this.importe = turno.getImporte();
		
		
		
	}
	

	
	
}
