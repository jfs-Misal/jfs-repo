package com.insure.service;

import java.util.List;

import com.insure.model.Customer;
import com.insure.model.Insurance;
import com.insure.repository.CustomerRepository;
import com.insure.repository.MySQLRepository;
import com.insure.repository.OracleRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = null;

	// setter-injection
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}

	// constructor-injection
//	public CustomerServiceImpl(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}
	
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.getCustomers();
	}

	

	

}
