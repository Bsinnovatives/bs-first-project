package com.medical.customers.manage.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.medical.customers.manage.dto.FetchCustomerDto;
import com.medical.customers.manage.dto.FetchInvoicesDto;
import com.medical.customers.manage.dto.FetchItemsDto;
import com.medical.customers.manage.entity.Customer;
import com.medical.customers.manage.entity.Invoices;
import com.medical.customers.manage.entity.Items;

@Component
public class FetchCustomerMapper {

	public List<FetchCustomerDto> fetchAllCustomers(List<Customer> customers) {
		return customers.stream().map(allCustomers -> fetchCustomer(allCustomers)).collect(Collectors.toList());
	}

	public FetchCustomerDto fetchCustomer(Customer customer) {
		FetchCustomerDto fetchCustomerDto = new FetchCustomerDto();
		BeanUtils.copyProperties(customer, fetchCustomerDto);
		fetchCustomerDto.setFetchInvoiceDto(fetchAllInvoices(customer.getInvoices()));
		return fetchCustomerDto;
	}

	public FetchInvoicesDto fetchInvoices(Invoices invoices) {
		FetchInvoicesDto fetchInvoicesDto = new FetchInvoicesDto();
		BeanUtils.copyProperties(invoices, fetchInvoicesDto);
		fetchInvoicesDto.setFetchItemsDtos(listOfItems(invoices.getItems()));
		return fetchInvoicesDto;
	}

	public List<FetchInvoicesDto> fetchAllInvoices(List<Invoices> invoices) {
		return invoices.stream().map(listOfInvoice -> fetchInvoices(listOfInvoice)).collect(Collectors.toList());
	}

	public FetchItemsDto fetchItems(Items items) {
		FetchItemsDto fetchItemsDto = new FetchItemsDto();
		BeanUtils.copyProperties(items, fetchItemsDto);
		return fetchItemsDto;
	}

	public List<FetchItemsDto> listOfItems(List<Items> items) {
		return items.stream().map(listofitems -> fetchItems(listofitems)).collect(Collectors.toList());
	}

}
