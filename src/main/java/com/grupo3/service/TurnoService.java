package com.grupo3.service;

import java.util.ArrayList;
import java.util.List;

import com.grupo3.dtos.PracticaDTO;
import com.grupo3.dtos.PrestadorDTO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;

public interface TurnoService {

	public List<TurnoDTO> findAllTurnos(TurnoDTO turno);
	public void updateTurno(TurnoDTO turno );
	public void deleteTurno(TurnoDTO turno);
	public void addTurno(TurnoDTO turno);
	public ArrayList<PracticaDTO> getPracticas();
	public ArrayList<PrestadorDTO> getPrestadores();
	public TurnoDTO getTurnoById(int nroTurn);	
	public List<Turno> findAllTurnosByIdAfiliado(int idAfiliado);

}
