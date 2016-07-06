package com.grupo3.dao;

import java.util.List;

import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;

public interface TurnoDAO {
	public void saveTurno(Turno turno);

	public void updateTurno(Turno turno);

	public void deleteTurno(Turno turno);
	
	public List<Turno> findAllTurns(int id);

}
