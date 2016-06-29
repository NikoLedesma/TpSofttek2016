package com.grupo3.dao;

import com.grupo3.entity.Prestador;

public interface PrestadorDAO {
	
	public void savePrestador(Prestador prestador);

	public void updatePrestador(Prestador prestador);

	public void deletePrestador(Prestador prestador);

}
