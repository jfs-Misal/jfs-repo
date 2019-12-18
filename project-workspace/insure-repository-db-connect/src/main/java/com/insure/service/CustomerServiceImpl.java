package com.insure.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.insure.model.Customer;
import com.insure.model.Insurance;

import com.insure.repository.InsureRepository;
import com.insure.repository.MySQLRepository;
import com.insure.repository.OracleRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	@Qualifier("oraclerep")
	private InsureRepository insureRepository;

	// setter-injection
	@Autowired
	public void setCustomerRepository(InsureRepository insureRepository) {
		this.insureRepository = insureRepository;
	}

	// constructor-injection
	@Autowired
	public CustomerServiceImpl(InsureRepository insureRepository) {
		this.insureRepository = insureRepository;
	}
	
	
	@Override
	public List<Customer> getCustomers() throws ClassNotFoundException, SQLException {
		return insureRepository.getCustomers();
	}

	

	

}
