package com.insure;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.insure.model.Insurance;

import com.insure.repository.MySQLRepository;
import com.insure.repository.OracleRepository;
import com.insure.service.CustomerService;
import com.insure.service.CustomerServiceImpl;
import com.insure.service.InsuranceService;
import com.insure.service.InsuranceServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.insure")
public class AppConfig {

//	@Bean(name = "insuranceRepository")
//	public InsuranceRepository getInsuranceRepository() {
//		return new MySQLRepository();
//	}
//
//	@Bean(name = "insuranceService")
//	public InsuranceService getInsuranceService() {
//		InsuranceService insuranceService = new InsuranceServiceImpl(getInsuranceRepository());
//		return insuranceService;
//	}
//
//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new OracleRepository();
//	}
//
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerService customerService = new CustomerServiceImpl(getCustomerRepository());
//		return customerService;
//	}
	
	
}
