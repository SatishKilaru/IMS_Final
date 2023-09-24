package com.health.insuranceview.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.insuranceview.contracts.IRepository;
import com.health.insuranceview.models.InsurancePolicy;

@RestController
public class CustomerController {
	@Autowired(required=true)
	IRepository irrp;
	
  
    // Get all publishers
    @GetMapping(value = "/getAllInsurancePolicies")
    public List<InsurancePolicy> getAllInsurancePolicies() {
        System.out.println("varshu");
        List<InsurancePolicy> li = irrp.getAllInsurancePolicies();
        return li;
    }


}
