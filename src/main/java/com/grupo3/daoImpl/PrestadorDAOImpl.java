package com.grupo3.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grupo3.dao.PrestadorDAO;
import com.grupo3.entity.Prestador;

public class PrestadorDAOImpl implements PrestadorDAO {
	private static Logger logger = Logger.getLogger(PrestadorDAOImpl.class);
	SessionFactory sessionFactory;

	@SuppressWarnings("finally")
	public List<Prestador> getPrestador(String prestador) {
		Session s = sessionFactory.openSession();
		try {
			Query query = s.createSQLQuery(
					"CALL traerPrestadores(:prestador)")
					.addEntity(Prestador.class)
					.setParameter("prestador", prestador);
			List result = query.list();
			return result;
		} catch (HibernateException e) {
			logger.error("Sucedio una excepción:", e);
		}
		finally{
			if(s.isOpen()){
				s.close();
			}
			return null;
		}	
	}


}
