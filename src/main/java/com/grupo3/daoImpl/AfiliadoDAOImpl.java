package com.grupo3.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;

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

	public void updateAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		
	}

	public List<Afiliado> getAfiliadoByNombreYApellido(String nombreApellido) {
		// TODO Auto-generated method stub
		return null;
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
