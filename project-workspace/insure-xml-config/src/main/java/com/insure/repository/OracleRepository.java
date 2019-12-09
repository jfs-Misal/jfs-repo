package com.insure.repository;

import java.util.ArrayList;
import java.util.List;

import com.insure.model.Customer;

public class OracleRepository implements CustomerRepository{

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setCustomerId("C01");
		customer.setCustomerName("VK");
		customer.setCustomerLocation("Delhi");
		customers.add(customer);
		customer=new Customer();
		customer.setCustomerId("C02");
		customer.setCustomerName("RS");
		customer.setCustomerLocation("Mumbai");
		customers.add(customer);
		return customers;
		
	}

}
