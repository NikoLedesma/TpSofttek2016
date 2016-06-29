package com.grupo3.dao;

import com.grupo3.entity.Prestador;

public interface PrestadorDAO {
	
	public void saveTurno(Prestador prestador);

	public void updatePatient(Prestador prestador);

	public void deletePatient(Prestador prestador);

}
