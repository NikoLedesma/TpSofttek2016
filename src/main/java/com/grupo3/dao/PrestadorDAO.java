package com.grupo3.dao;

import java.util.List;

import com.grupo3.dtos.PrestadorDTO;
import com.grupo3.entity.Prestador;

public interface PrestadorDAO {
	
	public List<Prestador> getPrestador(String prestador);
	public Prestador getPrestadorByID(int id);
	public List<Prestador> getPrestadores();
}
