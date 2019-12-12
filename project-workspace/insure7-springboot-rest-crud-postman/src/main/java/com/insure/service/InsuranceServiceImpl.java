package com.insure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insure.entity.Insurance;
import com.insure.repository.InsuranceJPARepository;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private InsuranceJPARepository insuranceJPARepository;

	@Override
	public List<Insurance> getInsurances() {
		return insuranceJPARepository.findAll();

	}

	@Override
	public Insurance addInsurance(Insurance insurance) {
		return insuranceJPARepository.save(insurance);
	}

	@Override
	public Insurance updateInsurance(Insurance insurance) {
		return insuranceJPARepository.save(insurance);
	}

	@Override
	public void deleteInsurance(Integer insuranceId) {
		insuranceJPARepository.deleteById(insuranceId);
	}

	@Override
	public List<Insurance> addInsurances(List<Insurance> insuranceList) {
		return insuranceJPARepository.saveAll(insuranceList);
	}

}
