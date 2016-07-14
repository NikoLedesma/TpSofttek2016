package com.grupo3.action;

import com.grupo3.dtos.AfiliadoDTO;
import com.opensymphony.xwork2.Action;

public class ReporteAction {

	AfiliadoDTO afiliadoDTO;
	


	public String retrievePdf(){
		
		return Action.NONE;
	}


	public AfiliadoDTO getAfiliadoDTO() {
		return afiliadoDTO;
	}

	public void setAfiliadoDTO(AfiliadoDTO afiliadoDTO) {
		this.afiliadoDTO = afiliadoDTO;
	}
}
