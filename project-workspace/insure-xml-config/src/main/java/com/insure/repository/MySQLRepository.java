package com.insure.repository;

import java.util.ArrayList;
import java.util.List;

import com.insure.model.Insurance;

public class MySQLRepository implements InsuranceRepository{

	@Override
	public List<Insurance> getInsurances() {

		List<Insurance> insurances = new ArrayList<>();
		Insurance insurance=new Insurance();
		insurance.setInsuranceId("I01");
		insurance.setInsuranceName("LI");
		insurance.setInsuranceAmount(1000000);
		insurances.add(insurance);
		insurance=new Insurance();
		insurance.setInsuranceId("I02");
		insurance.setInsuranceName("VI");
		insurance.setInsuranceAmount(2000000);
		insurances.add(insurance);
		
		return insurances;
	}

}
