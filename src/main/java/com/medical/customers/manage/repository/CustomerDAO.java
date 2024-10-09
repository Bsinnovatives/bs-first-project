package com.medical.customers.manage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medical.customers.manage.entity.Customer;
import java.util.UUID;



@Repository
public interface CustomerDAO extends JpaRepository<Customer, UUID> {
	
	
	public List<Customer> findByActiveFlag(Boolean activeFlag);
	
	@Query("SELECT COUNT(c) FROM Customer c")
	public int noOfCustomers();
}
