package com.insure.service;

import java.util.List;

import com.insure.model.Insurance;
import com.insure.repository.InsuranceRepository;
import com.insure.repository.MySQLRepository;

public class InsuranceServiceImpl implements InsuranceService {

	private InsuranceRepository insuranceRepository= null;

	// setterinjection
//	public void setInsuranceRepository(InsuranceRepository insuranceRepository) {
//		this.insuranceRepository = insuranceRepository;
//	}

	// constructor-injection
	public InsuranceServiceImpl(InsuranceRepository insuranceRepository) {
		this.insuranceRepository = insuranceRepository;
	}
	
	@Override
	public List<Insurance> getInsurances() {
		return insuranceRepository.getInsurances();
	}

	
}
