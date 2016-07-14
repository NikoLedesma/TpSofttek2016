package com.grupo3.util;

import java.sql.Date;

public class DataPerson {
	
private int nroTurno;
private String planMedico;
private Date horarioLlegada;
private Date horarioAtencion;
private String nombrePractica;
private float importe;
private String observaciones;

private String nombrePrestador;
public int getNroTurno() {
	return nroTurno;
}
public void setNroTurno(int nroTurno) {
	this.nroTurno = nroTurno;
}
public String getPlanMedico() {
	return planMedico;
}
public void setPlanMedico(String planMedico) {
	this.planMedico = planMedico;
}
public Date getHorarioLlegada() {
	return horarioLlegada;
}
public void setHorarioLlegada(Date horarioLlegada) {
	this.horarioLlegada = horarioLlegada;
}
public Date getHorarioAtencion() {
	return horarioAtencion;
}
public void setHorarioAtencion(Date horarioAtencion) {
	this.horarioAtencion = horarioAtencion;
}
public String getNombrePractica() {
	return nombrePractica;
}
public void setNombrePractica(String nombrePractica) {
	this.nombrePractica = nombrePractica;
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
public String getNombrePrestador() {
	return nombrePrestador;
}
public void setNombrePrestador(String nombrePrestador) {
	this.nombrePrestador = nombrePrestador;
}


}
