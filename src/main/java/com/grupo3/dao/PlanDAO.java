package com.grupo3.dao;

import com.grupo3.entity.Plan;

public interface PlanDAO {

	
	public void saveTurno(Plan plan);

	public void updatePatient(Plan plan);

	public void deletePatient(Plan plan);

}
