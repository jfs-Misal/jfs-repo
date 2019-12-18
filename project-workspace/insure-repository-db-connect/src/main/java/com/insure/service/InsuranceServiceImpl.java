package com.insure.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.insure.model.Insurance;

import com.insure.repository.InsureRepository;
import com.insure.repository.MySQLRepository;

@Service("insuranceService")
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	@Qualifier("oraclerep")
	private InsureRepository insureRepository;

	// setter-injection
	@Autowired
	public void setInsuranceRepository(InsureRepository insureRepository) {
		this.insureRepository = insureRepository;
	}

	// constructor-injection
	@Autowired
	public InsuranceServiceImpl(InsureRepository insureRepository) {
		this.insureRepository = insureRepository;
	}
	
	@Override
	public List<Insurance> getInsurances() throws ClassNotFoundException, SQLException {
		return insureRepository.getInsurances();
	}
}
