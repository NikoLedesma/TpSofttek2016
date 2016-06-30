package com.grupo3.serviceImpl;

import java.util.List;

import com.grupo3.dao.TurnoDAO;
import com.grupo3.daoImpl.TurnoDAOImpl;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;
import com.grupo3.service.TurnoService;

public class TurnoServiceImpl implements TurnoService {
	
	private TurnoDAOImpl turnDAO;

	public TurnoDAO getTurnDAO() {
		return turnDAO;
	}

	public void setTurnDAO(TurnoDAOImpl turnDAO) {
		this.turnDAO = turnDAO;
	}



	public List<Turno> findAllTurnos(TurnoDTO t) {
		List<Turno> turnos = turnDAO.findAllTurns(t);
		return turnos;
		
	}

	public void updateTurn(TurnoDTO turno) {
		
		Turno t = new Turno();
		t.setValores(turno);
		turnDAO.updateTurno(turno);

	}

	public void deleteTurn(TurnoDTO turno) {
		Turno t = new Turno();
		t.setValores(turno);
		turnDAO.deleteTurno(t);
		
	}

	public void addTurn(TurnoDTO turno) {
		Turno t = new Turno();
		t.setValores(turno);
		turnDAO.saveTurno(t);
		
	}

}
