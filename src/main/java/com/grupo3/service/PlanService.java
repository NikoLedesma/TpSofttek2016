package com.grupo3.service;

import com.grupo3.entity.Plan;

public interface PlanService {
	
	public void savePlan(Plan plan);

	public void updatePlan(Plan plan);

	public void deletePlan(Plan plan);
}
