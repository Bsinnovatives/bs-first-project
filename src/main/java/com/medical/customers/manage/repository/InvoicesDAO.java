package com.medical.customers.manage.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medical.customers.manage.entity.Invoices;

@Repository
public interface InvoicesDAO extends JpaRepository<Invoices, UUID> {
	
	@Query("SELECT COUNT(I) FROM Invoices I")
	public int noOfInvoices();

}
