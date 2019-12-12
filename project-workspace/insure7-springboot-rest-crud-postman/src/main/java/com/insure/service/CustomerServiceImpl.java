package com.insure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insure.entity.Customer;
import com.insure.repository.CustomerJPARepository;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerJPARepository customerJPARepository;

	@Override
	public List<Customer> getCustomers() {
		return customerJPARepository.findAll();
		
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerJPARepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerJPARepository.save(customer);
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		customerJPARepository.deleteById(customerId);
	}

	@Override
	public List<Customer> addCustomers(List<Customer> customerList) {
		return customerJPARepository.saveAll(customerList);
	}
	
	
	}

	

	


