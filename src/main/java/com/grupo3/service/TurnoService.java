package com.grupo3.service;

import java.util.List;

import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;

public interface TurnoService {

	public List<Turno> findAllTurnos(TurnoDTO t);
	public void updateTurn(TurnoDTO t );
	public void deleteTurn(TurnoDTO t);
	public void addTurn(TurnoDTO t);
	
	
}
