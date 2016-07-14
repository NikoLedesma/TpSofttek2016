package com.grupo3.dao;

import java.util.List;

import com.grupo3.dtos.PracticaDTO;
import com.grupo3.entity.Practica;

public interface PracticaDAO {
	
	
	public List<Practica> getPracticas();

	public Practica getPrestadorByID(int codigo);



}
