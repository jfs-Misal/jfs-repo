package com.insure.repository;

import java.util.List;

import com.insure.model.Customer;

public interface CustomerRepository {

	public List<Customer> getCustomers();
}
