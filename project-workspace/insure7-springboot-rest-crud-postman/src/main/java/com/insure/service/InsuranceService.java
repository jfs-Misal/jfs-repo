package com.insure.service;

import java.util.List;

import com.insure.entity.Insurance;

public interface InsuranceService {

	List<Insurance> getInsurances();

	Insurance addInsurance(Insurance insurance);

	Insurance updateInsurance(Insurance insurance);

	void deleteInsurance(Integer InsuranceId);
	
	List<Insurance> addInsurances(List<Insurance> insuranceList);
}
