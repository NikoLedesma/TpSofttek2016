package com.grupo3.serviceImpl;


import java.util.ArrayList;
import java.util.Date;
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
		Afiliado afiliado = afiliadoDAO.getAfiliadoById(afiliadoDTO.getId());
		afiliado.setCambios(afiliadoDTO);
		afiliadoDAO.updateAfiliado(afiliado);

	}

	@Transactional
	public void deleteAfiliado(AfiliadoDTO afiliadoDTO) {
		Afiliado afiliado = new Afiliado(afiliadoDTO);
		afiliado.setFechaBaja(new Date());
		afiliadoDAO.updateAfiliado(afiliado);

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
		List<AfiliadoDTO> afiliadosDTOS = new ArrayList<AfiliadoDTO>();
		Afiliado afiliado = new Afiliado (afiliadoDTO);
		List<Afiliado> afiliados = this.afiliadoDAO.getAfiliado(afiliado);
		for(Afiliado a: afiliados){
			afiliadosDTOS.add(new AfiliadoDTO(a));
		}
		return (ArrayList<AfiliadoDTO>) afiliadosDTOS;
	}

	public List<AfiliadoDTO> AfiliadoADTO(List<Afiliado> afiliados) {
		
		List<AfiliadoDTO> afiliadosDTOS = new LinkedList<AfiliadoDTO>();
		for(Afiliado a: afiliados){
			afiliadosDTOS.add(new AfiliadoDTO(a));
		}
		return afiliadosDTOS;
	}
}
