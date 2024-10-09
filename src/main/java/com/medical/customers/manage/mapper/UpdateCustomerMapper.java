package com.medical.customers.manage.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.medical.customers.manage.dto.UpdateCustomerDto;
import com.medical.customers.manage.dto.UpdateInvoicesDto;
import com.medical.customers.manage.dto.UpdateItemsDto;
import com.medical.customers.manage.entity.Customer;
import com.medical.customers.manage.entity.Invoices;
import com.medical.customers.manage.entity.Items;

@Component
public class UpdateCustomerMapper {

	public Customer updateCustomer(UpdateCustomerDto updateCustomerDto) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(updateCustomerDto, customer);
		customer.setActiveFlag(true);
		customer.setInvoices(updateInvoiceList(updateCustomerDto.getUpdateInvoicesDto(), customer));
		return customer;
	}

	public Invoices updateInvoices(UpdateInvoicesDto updateInviocesDto, Customer customer) {
		Invoices invoices = new Invoices();
		BeanUtils.copyProperties(updateInviocesDto, invoices);
		invoices.setActiveFlag(true);
		invoices.setCustomer(customer);
		invoices.setItems(updateItemList(updateInviocesDto.getUpdateItemsDtos(), invoices));
		return invoices;
	}

	public List<Invoices> updateInvoiceList(List<UpdateInvoicesDto> updateInvoicesDto, Customer customer) {
		return updateInvoicesDto.stream().map(updateInvoicesList -> updateInvoices(updateInvoicesList, customer))
				.collect(Collectors.toList());
	}

	public Items updateItems(UpdateItemsDto updateItemsDto, Invoices invoices) {
		Items items = new Items();
		BeanUtils.copyProperties(updateItemsDto, items);
		items.setActiveFlag(true);
		items.setInvoices(invoices);
		return items;
	}

	public List<Items> updateItemList(List<UpdateItemsDto> updateItemsDto, Invoices invoices) {
		return updateItemsDto.stream().map(updateItems -> updateItems(updateItems, invoices))
				.collect(Collectors.toList());
	}

}
