package com.insure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insure.model.Insurance;
import com.insure.repository.InsuranceRepository;
import com.insure.repository.MySQLRepository;

@Service("insuranceService")
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private InsuranceRepository insuranceRepository= null;

	// setter-injection
	@Autowired
	public void setInsuranceRepository(InsuranceRepository insuranceRepository) {
		this.insuranceRepository = insuranceRepository;
	}

	// constructor-injection
	@Autowired
	public InsuranceServiceImpl(InsuranceRepository insuranceRepository) {
		this.insuranceRepository = insuranceRepository;
	}
	
	@Override
	public List<Insurance> getInsurances() {
		return insuranceRepository.getInsurances();
	}
}
