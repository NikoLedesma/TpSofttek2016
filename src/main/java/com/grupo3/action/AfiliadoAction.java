package com.grupo3.action;

import com.grupo3.dtos.AfiliadoDTO;
import com.grupo3.entity.Afiliado;
import com.grupo3.service.AfiliadoService;
import com.opensymphony.xwork2.ActionSupport;

public class AfiliadoAction extends ActionSupport {

	private static final long serialVersionUID = 2085914562745618076L;
	
	AfiliadoService afiliadoService;
	AfiliadoDTO afiliadoDTO;
	
	public AfiliadoDTO getAfiliadoDTO() {
		return afiliadoDTO;
	}

	public void setAfiliadoDTO(AfiliadoDTO afiliadoDTO) {
		this.afiliadoDTO = afiliadoDTO;
	}

	public AfiliadoService getAfiliadoService() {
		return afiliadoService;
	}

	public void setAfiliadoService(AfiliadoService afiliadoService) {
		this.afiliadoService = afiliadoService;
	}
	
	public String guardarAfiliado(){
		Afiliado afiliado=new Afiliado();
		afiliado.setNombreApellido(afiliadoDTO.getNombreApellido());
		afiliado.setTipoDoc(afiliadoDTO.getTipoDoc());
		this.afiliadoService.saveAfiliado(afiliado);
		return "saveAfiliado";
	}
}
