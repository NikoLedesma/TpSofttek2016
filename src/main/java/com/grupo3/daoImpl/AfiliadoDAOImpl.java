package com.grupo3.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.grupo3.dao.AfiliadoDAO;
import com.grupo3.entity.Afiliado;

public class AfiliadoDAOImpl implements AfiliadoDAO{

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveAfiliado(Afiliado afiliado) {
		sessionFactory.getCurrentSession().save(afiliado);
		
	}
	

	public List<Afiliado> getAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();
		try {
			Criteria c = s.createCriteria(Afiliado.class);
			if(afiliado.getNombreApellido() != null){
				c.add(Restrictions.eq("nombreApellido",afiliado.getNombreApellido()));
			}
			if(afiliado.getNumeroDoc() != null){
				c.add(Restrictions.eq("numeroDoc",afiliado.getNumeroDoc()));
			}
			if(afiliado.getId() != 0){
				c.add(Restrictions.eq("id",afiliado.getId()));
			}
//			if(afiliado.getNombreApellido() != null){
//				c.add(Restrictions.eq("plan",afiliado.getPlan()));
//			}
			c.list();
	//TODO: Cambiar a HibernateExeption
		} catch (Exception e) {
			
		}finally{
			s.close();
		}
		return null;
	}

	public void updateAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		
	}

	public List<Afiliado> getAfiliadoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Afiliado> getAfiliadoByPlan(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Afiliado> getAfiliadoByDocumento(String tipo, String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Afiliado> getAfiliadoByFirstName(String nombreApellido) {
		// TODO Auto-generated method stub
		return null;
	}


}
