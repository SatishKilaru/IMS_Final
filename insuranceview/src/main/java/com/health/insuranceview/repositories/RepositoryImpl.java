package com.health.insuranceview.repositories;

import java.util.List;

import com.health.insuranceview.contracts.IRepository;
import com.health.insuranceview.models.InsurancePolicy;

@Repository
public class RepositoryImpl implements IRepository {
	
	@Autowired
	IDAO idao;

	@Override
	public List<InsurancePolicy> getAllInsurancePolicies() {
		// TODO Auto-generated method stub
		return idao.getAllInsurancePolicies();
	}

}
