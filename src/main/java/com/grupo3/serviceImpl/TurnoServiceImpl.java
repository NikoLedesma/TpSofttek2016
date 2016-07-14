package com.grupo3.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.grupo3.dao.PracticaDAO;
import com.grupo3.dao.PrestadorDAO;
import com.grupo3.dao.TurnoDAO;
import com.grupo3.dtos.PracticaDTO;
import com.grupo3.dtos.PrestadorDTO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Practica;
import com.grupo3.entity.Prestador;
import com.grupo3.entity.Turno;
import com.grupo3.service.TurnoService;
@Service
public class TurnoServiceImpl implements TurnoService {
	
	private TurnoDAO turnoDAO;
	private PracticaDAO practicaDAO;
	private PrestadorDAO prestadorDAO;

	@Transactional
	public List<TurnoDTO> findAllTurnos(TurnoDTO turnoDTO) {
		List<TurnoDTO> turnosDTOS = new ArrayList<TurnoDTO>();
		List<Turno> turnos = turnoDAO.findAllTurns(turnoDTO.getIdAfiliado());
		for(Turno t: turnos){
			turnosDTOS.add(new TurnoDTO(t));
		}
		return turnosDTOS;
		
	}
	@Transactional
	public void updateTurno(TurnoDTO turnoDTO) {
		
		Turno turno = new Turno(turnoDTO);
		turnoDAO.updateTurno(turno);
	}
	
	@Transactional
	public void deleteTurno(TurnoDTO turnoDTO) {
		Turno turno = new Turno(turnoDTO);
		turnoDAO.deleteTurno(turno);
		
	}
	@Transactional
	public void addTurno(TurnoDTO turnoDTO) {
		Turno turno = new Turno(turnoDTO);
		turno.setPrestador(prestadorDAO.getPrestadorByID(turnoDTO.getPrestador()));
		turno.setPractica(practicaDAO.getPrestadorByID(turnoDTO.getPractica()));
		turnoDAO.saveTurno(turno);
		
	}
	@Transactional
	public ArrayList<PracticaDTO> getPracticas() {
		List<Practica> practicas = practicaDAO.getPracticas();
		ArrayList<PracticaDTO> practicasDTO = new ArrayList<PracticaDTO>();
		for(Practica p: practicas){
			practicasDTO.add(new PracticaDTO(p));
		}
		return practicasDTO;
	}
	@Transactional
	public ArrayList<PrestadorDTO> getPrestadores() {
		List<Prestador> prestadores = prestadorDAO.getPrestadores();
		ArrayList<PrestadorDTO> prestadoresDTO = new ArrayList<PrestadorDTO>();
		for(Prestador p: prestadores){
			prestadoresDTO.add(new PrestadorDTO(p));
		}
		return prestadoresDTO;
	}
	
	public TurnoDAO getTurnoDAO() {
		return turnoDAO;
	}
	public void setTurnoDAO(TurnoDAO turnDAO) {
		this.turnoDAO = turnDAO;
	}
	
	public PracticaDAO getPracticaDAO() {
		return practicaDAO;
	}
	public void setPracticaDAO(PracticaDAO practicaDAO) {
		this.practicaDAO = practicaDAO;
	}
	public PrestadorDAO getPrestadorDAO() {
		return prestadorDAO;
	}
	public void setPrestadorDAO(PrestadorDAO prestadorDAO) {
		this.prestadorDAO = prestadorDAO;
	}

}
