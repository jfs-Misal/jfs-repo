package com.insure.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.insure.model.Customer;
import com.insure.model.Insurance;

//@Repository("insuranceRepository")
public class MySQLRepository implements InsureRepository{

	@Override
	public List<Insurance> getInsurances() {

		return null;
	}

	@Override
	public List<Customer> getCustomers() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
