package com.grupo3.service;

import java.util.List;

import com.grupo3.dtos.TurnoDTO;

public interface TurnoService {

	public List<TurnoDTO> findAllTurnos(TurnoDTO turno);
	public void updateTurno(TurnoDTO turno );
	public void deleteTurno(TurnoDTO turno);
	public void addTurno(TurnoDTO turno);
	
	
}
