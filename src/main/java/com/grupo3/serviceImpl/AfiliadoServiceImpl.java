package com.grupo3.serviceImpl;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.grupo3.dao.AfiliadoDAO;
import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.service.AfiliadoService;

@Service
public class AfiliadoServiceImpl implements AfiliadoService {

	private AfiliadoDAO afiliadoDAO;

	@Transactional
	public void saveAfiliado(AfiliadoDTO afiliadoDTO) {
		Afiliado afiliado = new Afiliado(afiliadoDTO);
		afiliadoDAO.saveAfiliado(afiliado);
	}

	@Transactional
	public void updateAfiliado(AfiliadoDTO afiliadoDTO) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteAfiliado(AfiliadoDTO afiliadoDTO) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public AfiliadoDAO getAfiliadoDAO() {
		return afiliadoDAO;
	}

	@Transactional
	public void setAfiliadoDAO(AfiliadoDAO afiliadoDAO) {
		this.afiliadoDAO = afiliadoDAO;
	}
	@Transactional
	public ArrayList<AfiliadoDTO> getAfiliados(AfiliadoDTO afiliadoDTO) {
		// TODO Auto-generated method stub
		Afiliado afiliado = new Afiliado (afiliadoDTO);
		this.afiliadoDAO.getAfiliado(afiliado);
		return null;
	}

	public List<AfiliadoDTO> AfiliadoADTO(List<Afiliado> afiliados) {
		
		List<AfiliadoDTO> afiliadosDTOS = new LinkedList<AfiliadoDTO>();
		for(Afiliado a: afiliados){
			afiliadosDTOS.add(new AfiliadoDTO(a));
		}
		
		
		return afiliadosDTOS;
	}
}
