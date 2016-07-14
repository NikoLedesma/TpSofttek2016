package com.grupo3.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grupo3.dao.PrestadorDAO;
import com.grupo3.dtos.PrestadorDTO;
import com.grupo3.entity.Prestador;
import com.grupo3.entity.Prestador;

public class PrestadorDAOImpl implements PrestadorDAO {
	private static Logger logger = Logger.getLogger(PrestadorDAOImpl.class);
	SessionFactory sessionFactory;

	@SuppressWarnings("finally")
	public List<Prestador> getPrestador(String prestador) {
		Session s = sessionFactory.openSession();
		try {
			Query query = s.createSQLQuery("CALL traerPrestadores(:prestador)")
					.addEntity(Prestador.class)
					.setParameter("prestador", prestador);
			List result = query.list();
			return result;
		} catch (HibernateException e) {
			logger.error("Sucedio una excepción:", e);
		} finally {
			if (s.isOpen()) {
				s.close();
			}
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Prestador> getPrestadores() {
		Session s = null;
		try {
			s = sessionFactory.openSession();
			List<Prestador> prestadores = (List<Prestador>) s.createCriteria(
					Prestador.class).list();
			return prestadores;
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

	public Prestador getPrestadorByID(int prestadorDTO) {
		Session s = sessionFactory.openSession();

		try {
			Prestador prestador = (Prestador) s.get(Prestador.class,prestadorDTO);
			return prestador;
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
