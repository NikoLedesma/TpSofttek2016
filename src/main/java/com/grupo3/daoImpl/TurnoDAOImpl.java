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
import com.grupo3.entity.Prestador;
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

	public void updateTurno(Turno turno) {
		Session s = sessionFactory.openSession();
		try {
		s.beginTransaction();
		s.update(turno);
		s.getTransaction().commit();
		} catch (HibernateException e) {
			s.getTransaction().rollback();
			System.out.println("Sucedio una excepción:"+e);
		}
		finally{
			if(s.isOpen()){
				s.close();
			}
		}

	}

	public void deleteTurno(Turno turno) {
		//No se implementa
	}

	public List<Turno> findAllTurns(int idAfiliado) {
		Session s = null;
		try {
			s = sessionFactory.openSession();
			Query query = s.createQuery("from Turnos where Id_Afiliado = :id and Disponible = 1");
			query.setParameter("id",idAfiliado);
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

	public Turno getTurnoById(int nroTurno) {
		Session s = sessionFactory.openSession();

		try {
			Turno turno = (Turno) s.get(Turno.class,nroTurno);
			return turno;
		} catch (HibernateException e) {
			System.out.println("Sucedio una excepción:" + e);
			return null;
		} finally {
			if (s.isOpen()) {
				s.close();
			}
		}
	}



}
