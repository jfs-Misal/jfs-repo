package com.insure.repository;

import java.sql.SQLException;
import java.util.List;

import com.insure.model.Customer;
import com.insure.model.Insurance;

public interface InsureRepository {
	public List<Customer> getCustomers() throws SQLException, ClassNotFoundException;
	public List<Insurance> getInsurances() throws ClassNotFoundException, SQLException;
}
