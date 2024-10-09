package com.medical.customers.manage.mapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.medical.customers.manage.dto.CreateCustomerDto;
import com.medical.customers.manage.dto.CreateInviocesDto;
import com.medical.customers.manage.dto.CreateItemsDto;
import com.medical.customers.manage.entity.Customer;
import com.medical.customers.manage.entity.Invoices;
import com.medical.customers.manage.entity.Items;

@Component	
public class CreateCustomerMapper {

	public Customer createCustomer(CreateCustomerDto createCustomerDto) {
		Customer customer = new Customer();
		customer.setCustomerID(getID(customer.getCustomerID()));
		BeanUtils.copyProperties(createCustomerDto, customer);
		customer.setActiveFlag(true);
		customer.setInvoices(createInvoiceList(createCustomerDto.getCreateInvoicesDto(), customer));
		return customer;
	}

	public Invoices createInvoices(CreateInviocesDto createInviocesDto, Customer customer) {
		Invoices invoices = new Invoices();
		invoices.setInvoiceId(getID(invoices.getInvoiceId()));
		BeanUtils.copyProperties(createInviocesDto, invoices);
		invoices.setActiveFlag(true);
		invoices.setCustomer(customer);
		invoices.setItems(createItemList(createInviocesDto.getCreateItemsDto(), invoices));
		return invoices;
	}

	public List<Invoices> createInvoiceList(List<CreateInviocesDto> createInvoicesDto, Customer customer) {
		return createInvoicesDto.stream().map(createInvoices -> createInvoices(createInvoices, customer))
				.collect(Collectors.toList());
	}

	public Items createItems(CreateItemsDto createItemsDto, Invoices invoices) {
		Items items = new Items();
		items.setItemId(getID(items.getItemId()));
		BeanUtils.copyProperties(createItemsDto, items);
		items.setActiveFlag(true);
		items.setInvoices(invoices);
		return items;
	}

	public List<Items> createItemList(List<CreateItemsDto> createItemsDto, Invoices invoices) {
		return createItemsDto.stream().map(createItems -> createItems(createItems, invoices))
				.collect(Collectors.toList());
	}

	public UUID getID(UUID id) {
		if (id == null) {
			id = UUID.randomUUID();
		}
		return id;
	}

}
