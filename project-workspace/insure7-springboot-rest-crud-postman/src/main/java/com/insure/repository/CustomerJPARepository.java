package com.insure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insure.entity.Customer;

@Repository
public interface CustomerJPARepository extends JpaRepository<Customer, Integer> {

	

}
