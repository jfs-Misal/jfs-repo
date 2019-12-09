package com.insure;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insure.model.Customer;
import com.insure.model.Insurance;
import com.insure.service.CustomerService;
import com.insure.service.InsuranceService;

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		InsuranceService insuranceService = applicationContext.getBean("insuranceService",InsuranceService.class);
		List<Insurance> insurances=insuranceService.getInsurances();
		insurances.forEach(System.out::println);
		
		CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);
		List<Customer> customers = customerService.getCustomers();
		customers.forEach(customer -> System.out.println(customer));
		//customers.forEach(System.out::println);
		
//		new AnnotationConfigApplicationContext(AppConfig.class)
//		.getBean("insuranceService",InsuranceService.class)
//		.getInsurances()
//		.forEach(System.out::println);
//		
//		new AnnotationConfigApplicationContext(AppConfig.class)
//		.getBean("customerService",CustomerService.class)
//		.getCustomers()
//		.forEach(System.out::println);
		
	}

}
