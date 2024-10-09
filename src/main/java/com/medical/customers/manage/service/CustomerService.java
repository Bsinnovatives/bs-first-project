package com.medical.customers.manage.service;

import java.util.List;
import java.util.UUID;

import com.medical.customers.manage.dto.CreateCustomerDto;
import com.medical.customers.manage.dto.FetchCustomerDto;
import com.medical.customers.manage.dto.FetchInvoicesDto;
import com.medical.customers.manage.dto.UpdateCustomerDto;

public interface CustomerService {

	public void createCustomer(CreateCustomerDto createCustomerDto);

	public void updateCustomer(UpdateCustomerDto updateCustomerDto);
	
	//public FetchCustomerDto fetchAndUpdateCustomer(UUID customerID, CreateCustomerDto createCustomerDto);
	
	public List< FetchCustomerDto> fetchAllCustomers();
	
	public List<FetchCustomerDto> fetchAllActiveCustomers();

	public FetchCustomerDto findCustomerById(UUID customerID);

	public void SoftDeleteCustomerById(UUID customerID);
	
	public void SoftDeletInvoicesForCustomer(UUID CustomerID, List<UUID> invoicesToBeDeleted);

	public List<FetchInvoicesDto> fetchAllActiveInvoicesForCustomer(UUID customerID);
	
	public int noOfCustomers();
	
	public int noOfInvoices();

}
