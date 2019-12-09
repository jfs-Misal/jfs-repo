package com.insure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insure.model.Customer;
import com.insure.model.Insurance;
import com.insure.repository.CustomerRepository;
import com.insure.repository.MySQLRepository;
import com.insure.repository.OracleRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository = null;

	// setter-injection
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	// constructor-injection
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.getCustomers();
	}

	

	

}
