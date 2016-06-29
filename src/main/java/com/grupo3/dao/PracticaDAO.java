package com.grupo3.dao;

import com.grupo3.entity.Practica;

public interface PracticaDAO {
	
	
	public void saveTurno(Practica practica);

	public void updatePatient(Practica practica);

	public void deletePatient(Practica practica);


}
