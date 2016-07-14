package com.grupo3.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grupo3.dao.PracticaDAO;
import com.grupo3.dtos.PracticaDTO;
import com.grupo3.entity.Practica;
import com.grupo3.entity.Practica;

public class PracticaDAOImpl implements PracticaDAO {
	
	private static Logger logger = Logger.getLogger(PracticaDAOImpl.class);
	private SessionFactory sessionFactory;


	@SuppressWarnings("unchecked")
	public List<Practica> getPracticas() {
		Session s = null;
		try {
			s = sessionFactory.openSession();
			List<Practica> practicas =(List<Practica>) s.createCriteria(Practica.class).list();
			return practicas;
		} catch (HibernateException e) {
			logger.error("Sucedio una excepción:", e);
			return null;
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



	public Practica getPrestadorByID(PracticaDTO practicaDTO) {
		Session s = sessionFactory.openSession();

		try {
			Practica practica = (Practica) s.get(Practica.class,practicaDTO.getCodigo());
			return practica;
		} catch (HibernateException e) {
			// logger.debug("Sucedio una excepción:", e);
			System.out.println("Sucedio una excepción:" + e);

			return null;
		} finally {
			if (s.isOpen()) {
				s.close();
			}
		}
	}
}
