package com.grupo3.dao;

import com.grupo3.entity.Plan;

public interface PlanDAO {

	
	public void savePlan(Plan plan);

	public void updatePlan(Plan plan);

	public void deletePlan(Plan plan);

}
