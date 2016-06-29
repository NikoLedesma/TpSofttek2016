package com.grupo3.dao;

import java.util.List;

import com.grupo3.entity.Turno;

public interface TurnoDAO {
	public void saveTurno(Turno turno);

	public void updatePatient(Turno turno);

	public void deletePatient(Turno turno);

}
