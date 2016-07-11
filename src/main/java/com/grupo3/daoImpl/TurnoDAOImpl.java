package com.grupo3.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grupo3.dao.TurnoDAO;
import com.grupo3.dtos.TurnoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.entity.Turno;

public class TurnoDAOImpl implements TurnoDAO {

	private static Logger logger = Logger.getLogger(TurnoDAOImpl.class);
	private SessionFactory sessionFactory;

	public void saveTurno(Turno turno) {
		Session s = null;
		try {
			s = sessionFactory.openSession();
			s.save(turno);
		} catch (HibernateException e) {
			logger.error("Sucedio una excepción:", e);
		} finally {
			if (s.isOpen()) {
				s.close();
			}
		}

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
		Session s = sessionFactory.openSession();
		try {
		sessionFactory.getCurrentSession().update(turno);
		} catch (HibernateException e) {
			logger.error("Sucedio una excepción:", e);
		}
		finally{
			if(s.isOpen()){
				s.close();
			}
		}

	}

	public List<Turno> findAllTurns(Afiliado afiliado) {
		Session s = null;
		try {
			s = sessionFactory.openSession();
			Query query = s.createQuery("from Turnos where Id_Afiliado = :id");
			query.setParameter("id", afiliado.getId());
			List<Turno> turnos = query.list();
			return turnos;
		} catch (HibernateException e) {
			logger.error("Sucedio una excepción:", e);
			return null;
		} finally {
			if (s.isOpen()) {
				s.close();
			}
		}

	}

	public void updateTurno(Turno turno) {
		// TODO Auto-generated method stub

	}

}
