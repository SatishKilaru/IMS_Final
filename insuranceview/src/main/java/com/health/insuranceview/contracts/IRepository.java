package com.health.insuranceview.contracts;

import java.util.List;

import com.health.insuranceview.models.InsurancePolicy;

public interface IRepository {

	List<InsurancePolicy> getAllInsurancePolicies();
	
	

}
