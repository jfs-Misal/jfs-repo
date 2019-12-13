package com.insure.service;

import java.sql.SQLException;
import java.util.List;

import com.insure.model.Customer;

public interface CustomerService {
List<Customer> getCustomers() throws ClassNotFoundException, SQLException;
}
