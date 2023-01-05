package in.ashokit.service;

import java.util.Map;
import java.util.List;
import in.ashokit.entity.Plan;

public interface PlanService {
	public Map<Integer,String> getPlanCategory();
	
	public boolean savePlan(Plan plan);
	
	public List<Plan> getAllPlans();
	
	public Plan getPlanById(Integer planId);
	
	public boolean updatePlan(Plan plan);
	
	public boolean deletePlanById(Integer planId);
	
	public boolean planStatusChange(Integer planId,String status) ;
		
	
	

}
