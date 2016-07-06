package com.grupo3.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.grupo3.dao.TurnoDAO;
import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Afiliado;
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
	public List<TurnoDTO> findAllTurnos(TurnoDTO turnoDTO) {
		List<TurnoDTO> turnosDTOS = new ArrayList<TurnoDTO>();
		List<Turno> turnos = turnoDAO.findAllTurns(turnoDTO.getIdAfiliado());
		for(Turno t: turnos){
			turnosDTOS.add(new TurnoDTO(t));
		}
		return null;
		
	}
	@Transactional
	public void updateTurno(TurnoDTO turnoDTO) {
		
		Turno turno = new Turno();
		turno.setValores(turnoDTO);
		turnoDAO.updateTurno(turno);
	}
	
	@Transactional
	public void deleteTurno(TurnoDTO turno) {
		Turno t = new Turno();
		t.setValores(turno);
		turnoDAO.deleteTurno(t);
		
	}
	@Transactional
	public void addTurno(TurnoDTO turnoDTO) {
		Turno turno = new Turno();
		turno.setValores(turnoDTO);
		turnoDAO.saveTurno(turno);
		
	}

}
