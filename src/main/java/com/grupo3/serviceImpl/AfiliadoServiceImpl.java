package com.grupo3.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.grupo3.dao.AfiliadoDAO;
import com.grupo3.entity.Afiliado;
import com.grupo3.service.AfiliadoService;

@Service
public class AfiliadoServiceImpl implements AfiliadoService {

	private AfiliadoDAO afiliadoDAO;

	@Transactional
	public void saveAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub
		afiliadoDAO.saveAfiliado(afiliado);
	}

	@Transactional
	public void updateAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteAfiliado(Afiliado afiliado) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public List<Afiliado> getAfiliadoByFirstName(String nombreApellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public AfiliadoDAO getAfiliadoDAO() {
		return afiliadoDAO;
	}

	@Transactional
	public void setAfiliadoDAO(AfiliadoDAO afiliadoDAO) {
		this.afiliadoDAO = afiliadoDAO;
	}
}
