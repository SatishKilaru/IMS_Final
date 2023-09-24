package com.health.insuranceview.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.health.insuranceview.contracts.IDAO;
import com.health.insuranceview.models.InsurancePolicy;
import com.health.insuranceview.rowmappers.InsurancePolicyRowMapper;
@Component
public class DaoImpl implements IDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private String SQL_GET_INSURANCEPOLICIES = "select * from  insurance_policy";

	
	

	@Override
	public List<InsurancePolicy> getAllInsurancePolicies() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_INSURANCEPOLICIES, new InsurancePolicyRowMapper());
	}

}
