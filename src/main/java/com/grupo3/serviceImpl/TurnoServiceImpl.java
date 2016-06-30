package com.grupo3.serviceImpl;

import java.util.List;

import com.grupo3.dao.TurnoDAO;
import com.grupo3.daoImpl.TurnoDAOImpl;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;
import com.grupo3.service.TurnoService;

public class TurnoServiceImpl implements TurnoService {
	
	private TurnoDAO turnoDAO;

	public TurnoDAO getTurnoDAO() {
		return turnoDAO;
	}

	public void setTurnoDAO(TurnoDAO turnDAO) {
		this.turnoDAO = turnDAO;
	}



	public List<Turno> findAllTurnos(TurnoDTO t) {
		List<Turno> turnos = turnoDAO.findAllTurns(t);
		return turnos;
		
	}

	public void updateTurn(TurnoDTO turno) {
		
		Turno t = new Turno();
		t.setValores(turno);
		turnoDAO.updateTurno(t);

	}

	public void deleteTurn(TurnoDTO turno) {
		Turno t = new Turno();
		t.setValores(turno);
		turnoDAO.deleteTurno(t);
		
	}

	public void addTurn(TurnoDTO turno) {
		Turno t = new Turno();
		t.setValores(turno);
		turnoDAO.saveTurno(t);
		
	}

}
