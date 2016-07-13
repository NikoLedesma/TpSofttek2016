package com.grupo3.serviceImpl;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.grupo3.dao.AfiliadoDAO;
import com.grupo3.dao.PlanDAO;
import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.service.AfiliadoService;

@Service
public class AfiliadoServiceImpl implements AfiliadoService {

	private AfiliadoDAO afiliadoDAO;
	private PlanDAO planDAO;
	
	public PlanDAO getPlanDAO() {
		return planDAO;
	}

	public void setPlanDAO(PlanDAO planDAO) {
		this.planDAO = planDAO;
	}

	@Transactional
	public void saveAfiliado(AfiliadoDTO afiliadoDTO) {
		Afiliado afiliado = new Afiliado(afiliadoDTO);
		afiliado.setPlan(planDAO.getPlan(afiliadoDTO));
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
		Afiliado afiliado = afiliadoDAO.getAfiliadoById(afiliadoDTO.getId());
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
		Afiliado afiliado = new Afiliado (afiliadoDTO);
		return this.AfiliadoADTO(this.afiliadoDAO.getAfiliado(afiliado));
	}

	public ArrayList<AfiliadoDTO> AfiliadoADTO(List<Afiliado> afiliados) {
		
		ArrayList<AfiliadoDTO> afiliadosDTOS = new ArrayList<AfiliadoDTO>();
		for(Afiliado a: afiliados){
			afiliadosDTOS.add(new AfiliadoDTO(a));
		}
		return afiliadosDTOS;
	}
}
