package com.insure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insure.entity.Customer;
import com.insure.model.Customers;
import com.insure.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/Customers", method = RequestMethod.GET)
	public List<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@RequestMapping(value="/Customer", method = RequestMethod.POST)
	Customer addCustomer(@RequestBody Customer Customer) {
		return customerService.addCustomer(Customer);
	}
	
	@RequestMapping(value="/Customer",method =RequestMethod.PUT)
	Customer updateCustomer(@RequestBody Customer Customer) {
		return customerService.updateCustomer(Customer);
	}
	
	@RequestMapping(value="/Customer/{CustomerId}", method=RequestMethod.DELETE)
	void deleteCustomer(@PathVariable Integer CustomerId) {
		customerService.deleteCustomer(CustomerId);
	}
	
	// FETCHING MULTIPLE JSON OBJECTS FROM POSTMAN
		@RequestMapping(value = "/customers", method = RequestMethod.POST)
		List<Customer> addCustomers(@RequestBody Customers customers) {
			
//			Products productsTemp = new Products();
//			productsTemp.productList = new ArrayList<Product>();
//			
//			products.productList.forEach((product) -> {
//				productsTemp.productList.add(productService.addProduct(product));
//			});
//			return productsTemp;
			System.err.println("using saveAll() method!");
			return customerService.addCustomers(customers.customerList);
		}
		
		@RequestMapping(value = "/productsR", method = RequestMethod.POST)
		String addCustomersTest(@RequestParam Customer customer,@RequestBody String customers) {	
			System.err.println("CUSTOMER : " + customer);
			System.err.println("CUSTOMERS : " + customers);
			return customers;
		}
}
