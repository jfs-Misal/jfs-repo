package com.insure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insure.entity.Insurance;
import com.insure.service.InsuranceService;

@RestController
public class InsuranceController {

	@Autowired
	private InsuranceService insuranceService;
	
	@RequestMapping(value="/insurances", method = RequestMethod.GET)
	public List<Insurance> getInsurances(){
		return insuranceService.getInsurances();
	}
	
	@RequestMapping(value="/insurance", method = RequestMethod.POST)
	Insurance addInsurance(@RequestBody Insurance insurance) {
		return insuranceService.addInsurance(insurance);
	}
	
	@RequestMapping(value="/insurance",method =RequestMethod.PUT)
	Insurance updateInsurance(@RequestBody Insurance insurance) {
		return insuranceService.updateInsurance(insurance);
	}
	
	@RequestMapping(value="/insurance/{insuranceId}", method=RequestMethod.DELETE)
	void deleteInsurance(@PathVariable Integer insuranceId) {
		insuranceService.deleteInsurance(insuranceId);
	}
	
}
