package com.insure.repository;

import java.sql.SQLException;
import java.util.List;

import com.insure.model.Customer;

public interface CustomerRepository {

	public List<Customer> getCustomers() throws SQLException, ClassNotFoundException;
}
