package com.grupo3.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.grupo3.dao.TurnoDAO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;
import com.grupo3.service.TurnoService;
@Service
public class TurnoServiceImpl implements TurnoService {
	
	private TurnoDAO turnoDAO;
	@Transactional
	public TurnoDAO getTurnoDAO() {
		return turnoDAO;
	}
	@Transactional
	public void setTurnoDAO(TurnoDAO turnDAO) {
		this.turnoDAO = turnDAO;
	}


	@Transactional
	public List<TurnoDTO> findAllTurnos(TurnoDTO t) {
		//TODO: Castear turnos a dto
		List<Turno> turnos = turnoDAO.findAllTurns(t);
		
		return null;
		
	}
	@Transactional
	public void updateTurno(TurnoDTO turno) {
		
		Turno t = new Turno();
		t.setValores(turno);
		turnoDAO.updateTurno(t);
	}
	
	@Transactional
	public void deleteTurno(TurnoDTO turno) {
		Turno t = new Turno();
		t.setValores(turno);
		turnoDAO.deleteTurno(t);
		
	}
	@Transactional
	public void addTurno(TurnoDTO turno) {
		Turno t = new Turno();
		t.setValores(turno);
		turnoDAO.saveTurno(t);
		
	}

}
