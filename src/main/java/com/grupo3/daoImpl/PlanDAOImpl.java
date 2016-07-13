package com.grupo3.daoImpl;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.grupo3.dao.PlanDAO;
import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Plan;

public class PlanDAOImpl implements PlanDAO {

	private static Logger logger = Logger.getLogger(PlanDAOImpl.class);
	SessionFactory sessionFactory;
	

	
	@SuppressWarnings("unchecked")
	public Plan getPlan(AfiliadoDTO afiliadoDTO) {
		Session s = null;
		try {
			s = sessionFactory.openSession();
			Plan plan = (Plan)s.get(Plan.class, (int) afiliadoDTO.getPlan() );
			return plan;
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

}
