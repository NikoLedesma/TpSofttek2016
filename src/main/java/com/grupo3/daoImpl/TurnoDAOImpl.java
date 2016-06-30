package com.grupo3.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grupo3.dao.TurnoDAO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;

public class TurnoDAOImpl implements TurnoDAO {

	private SessionFactory sessionFactory;
	
	
	public void saveTurno(Turno turno) {
		Session s = this.sessionFactory.getCurrentSession();
		s.save(turno);
		
	}



	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public void updateTurno(TurnoDTO turno) {
		// TODO Auto-generated method stub
		
	}

	public void deleteTurno(Turno turno) {
		// TODO Auto-generated method stub
		
	}

	public List<Turno> findAllTurns(TurnoDTO t) {
		// TODO Auto-generated method stub
		return null;
	}



	public void updateTurno(Turno turno) {
		// TODO Auto-generated method stub
		
	}

}
