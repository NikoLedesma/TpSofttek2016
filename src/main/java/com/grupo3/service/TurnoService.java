package com.grupo3.service;

import java.util.List;

import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;

public interface TurnoService {

	public List<Turno> findAllTurnos(TurnoDTO turno);
	public void updateTurno(TurnoDTO turno );
	public void deleteTurno(TurnoDTO turno);
	public void addTurno(TurnoDTO turno);
	
	
}
