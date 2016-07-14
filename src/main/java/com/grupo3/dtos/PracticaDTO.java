package com.grupo3.dtos;

import com.grupo3.entity.Practica;


public class PracticaDTO {
	private int codigo;

	private String practica;
	
	public PracticaDTO(){};
	
	public PracticaDTO(Practica practica){
		this.codigo = practica.getCodigo();
		this.practica = practica.getPractica();
	};

	/*Accessors*/
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPractica() {
		return practica;
	}

	public void setPractica(String practica) {
		this.practica = practica;
	}
	
}
