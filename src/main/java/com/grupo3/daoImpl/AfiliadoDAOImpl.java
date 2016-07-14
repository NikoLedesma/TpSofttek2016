package com.grupo3.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		Session s = sessionFactory.openSession();
		try {	
		 
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
//		List<Afiliado> afiliados = null;
		try {
			Criteria c = s.createCriteria(Afiliado.class);
			c.add(Restrictions.isNull("fechaBaja"));
			if(!afiliado.getNombreApellido().equals("")){
				c.add(Restrictions.ilike("nombreApellido","%"+afiliado.getNombreApellido()+"%"));
			}
			if(!afiliado.getNumeroDoc().equals("")){
				c.add(Restrictions.ilike("numeroDoc",afiliado.getNumeroDoc()+"%"));
			}
			if(afiliado.getId() != 0){
				c.add(Restrictions.eq("id",afiliado.getId()));
			}
			
//			if(!afiliado.getPlan().equals(null)){
//				c.add(Restrictions.like("plan",afiliado.getPlan()));
//			}
			
			List<Afiliado> afiliados =  c.list();
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
		s.beginTransaction();
		s.update(afiliado);
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

	public void deleteAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		
	}

	public Afiliado getAfiliadoById(int id) {
		Session s = sessionFactory.openSession();
		Afiliado afiliado=null;
		try {
        afiliado=(Afiliado)s.get(Afiliado.class, id);
    	return afiliado;
		} catch (HibernateException e) {
			//logger.debug("Sucedio una excepción:", e);
			System.out.println("Sucedio una excepción:"+e);
		
		}
		finally{
			if(s.isOpen()){
				s.close();
			}
		}
		return afiliado;
	}

}
