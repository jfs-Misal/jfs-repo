package com.insure.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.insure.model.Customer;

@Repository("customerRepository")
public class OracleRepository implements CustomerRepository{

	@Override
	public List<Customer> getCustomers() throws SQLException,ClassNotFoundException {
		List<Customer> customers = new ArrayList<Customer>();
//		Customer customer = new Customer();
//		customer.setCustomerId("C01");
//		customer.setCustomerName("VK");
//		customer.setCustomerLocation("Delhi");
//		customers.add(customer);
//		customer=new Customer();
//		customer.setCustomerId("C02");
//		customer.setCustomerName("RS");
//		customer.setCustomerLocation("Mumbai");
//		customers.add(customer);
//		return customers;
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. Get the connection
		Connection connection = DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		// 3. Create the query
		Statement statement = connection.createStatement();
		// 4. Execute the query
		ResultSet resultset = statement.executeQuery("select * from customer");
		// 5. Display the results
		while (resultset.next()) {
			
//			String firstName = resultset.getString("first_name");
//			String lastName = resultset.getString("last_name");
//			employeeList.add(new Employee(firstName, lastName));
			 System.out.println(resultset.getString("customer_Name"));
//			 System.out.println(resultset.getString("last_name"));
//				System.out.println(resultset.getString(1));
//				System.out.println(resultset.getString(2));

		}
		resultset.close();
		statement.close();
		connection.close();
		return customers;
	}

}
