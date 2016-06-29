package com.grupo3.serviceImpl;

import java.util.List;

import com.grupo3.dao.AfiliadoDAO;
import com.grupo3.entity.Afiliado;
import com.grupo3.service.AfiliadoService;

public class AfiliadoServiceImpl implements AfiliadoService {
      
			private AfiliadoDAO afiliadoDAO; 
	
	
	public void saveAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		afiliadoDAO.saveAfiliado(afiliado);
	}

	public void updateAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		
	}
	public List<Afiliado> getAfiliadoByFirstName(String nombreApellido) {
		// TODO Auto-generated method stub
		return null;
	}


	public AfiliadoDAO getAfiliadoDAO() {
		return afiliadoDAO;
	}

	public void setAfiliadoDAO(AfiliadoDAO afiliadoDAO) {
		this.afiliadoDAO = afiliadoDAO;
	}
}
