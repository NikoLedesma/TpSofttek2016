package com.grupo3.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;

import com.grupo3.dao.TurnoDAO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Turno;

public class TurnoDAOImpl implements TurnoDAO {

	private static Logger logger = Logger.getLogger(TurnoDAOImpl.class);
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

	public List<Turno> findAllTurns(int id) {
		try {
		Session s = sessionFactory.getCurrentSession();
		Query query= s.createQuery("from Turnos where Id_Afiliado = :id");
		query.setParameter("id", id);
		List<Turno> turnos = query.list();
		return turnos;
		}catch (HibernateException e){
			logger.error("Sucedio una excepci�n:", e);
			return null;
		}
	}



	public void updateTurno(Turno turno) {
		// TODO Auto-generated method stub
		
	}

}
