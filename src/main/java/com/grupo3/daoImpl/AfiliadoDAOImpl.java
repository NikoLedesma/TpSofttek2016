package com.grupo3.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.taglibs.bsf.scriptlet;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.grupo3.dao.AfiliadoDAO;
import com.grupo3.entity.Afiliado;

public class AfiliadoDAOImpl implements AfiliadoDAO{

	private static Logger logger = Logger.getLogger(AfiliadoDAOImpl.class);
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveAfiliado(Afiliado afiliado) {
		Session s=null;
		try {	
		 s = sessionFactory.openSession();
		s.save(afiliado);
		}
		catch(HibernateException e){
			logger.error("Sucedio una excepción:", e);
		}finally{
			if(s.isOpen()){
				s.close();
			}
		}
	}
	

	@SuppressWarnings("unchecked")
	public List<Afiliado> getAfiliado(Afiliado afiliado) {
		Session s = sessionFactory.openSession();
		List<Afiliado> afiliados = null;
		try {
			Criteria c = s.createCriteria(Afiliado.class);
			c.add(Restrictions.isNull("fechaBaja"));
			if(afiliado.getNombreApellido() != null){
				c.add(Restrictions.ilike("nombreApellido","%"+afiliado.getNombreApellido()+"%"));
			}
			if(afiliado.getNumeroDoc() != null){
				c.add(Restrictions.ilike("numeroDoc",afiliado.getNumeroDoc()+"%"));
			}
			if(afiliado.getId() != 0){
				c.add(Restrictions.eq("id",afiliado.getId()));
			}
			
//			if(afiliado.getNombreApellido() != null){
//				c.add(Restrictions.like("plan",afiliado.getPlan()));
//			}
			
			 afiliados = c.list();
			 return afiliados;
		} catch (HibernateException e) {
			logger.error("Sucedio una excepción:", e);
			return null;
		}finally{
			if(s.isOpen()){
				s.close();
			}

		}
		
	}

	public void updateAfiliado(Afiliado afiliado) {
		Session s = sessionFactory.openSession();
		try {
		sessionFactory.getCurrentSession().update(afiliado);
		} catch (HibernateException e) {
			logger.error("Sucedio una excepción:", e);
		}
		finally{
			if(s.isOpen()){
				s.close();
			}
		}
	}

	public void deleteAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		
	}

}
