package com.grupo3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Practica")
public class Practica {
	@Id
	@Column(name = "Codigo")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	
	@Column(name = "Practica")
	private String practica;

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
