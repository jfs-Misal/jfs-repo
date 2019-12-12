package com.insure.service;

import java.util.List;

import com.insure.entity.Customer;

public interface CustomerService {

	List<Customer> getCustomers();

	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	void deleteCustomer(Integer customerId);
	
	List<Customer> addCustomers(List<Customer> customerList);

}
