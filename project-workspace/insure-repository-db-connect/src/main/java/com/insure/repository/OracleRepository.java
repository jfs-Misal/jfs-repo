package com.insure.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.insure.model.Customer;
import com.insure.model.Insurance;

@Repository
@Qualifier("oraclerep")
public class OracleRepository implements InsureRepository{

	@Override
	public List<Customer> getCustomers() throws ClassNotFoundException, SQLException  {
		List<Customer> customers = new ArrayList<Customer>();
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
			
			 System.out.println(resultset.getString("customer_Name"));
//				System.out.println(resultset.getString(1));
//				System.out.println(resultset.getString(2));

		}
		resultset.close();
		statement.close();
		connection.close();
		return customers;
	}

	@Override
	public List<Insurance> getInsurances() throws ClassNotFoundException, SQLException {
		List<Insurance> insurances = new ArrayList<Insurance>();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. Get the connection
		Connection connection = DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		// 3. Create the query
		Statement statement = connection.createStatement();
		// 4. Execute the query
		ResultSet resultset = statement.executeQuery("select * from insurance");
		// 5. Display the results
		while (resultset.next()) {
			
			 System.out.println(resultset.getString("insurance_Name"));
//				System.out.println(resultset.getString(1));
//				System.out.println(resultset.getString(2));

		}
		resultset.close();
		statement.close();
		connection.close();
		return insurances;
	}
	
}
