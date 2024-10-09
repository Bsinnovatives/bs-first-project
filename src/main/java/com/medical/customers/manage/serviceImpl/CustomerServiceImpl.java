package com.medical.customers.manage.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.customers.manage.dto.CreateCustomerDto;
import com.medical.customers.manage.dto.FetchCustomerDto;
import com.medical.customers.manage.dto.FetchInvoicesDto;
import com.medical.customers.manage.dto.UpdateCustomerDto;
import com.medical.customers.manage.entity.Customer;
import com.medical.customers.manage.entity.Invoices;
import com.medical.customers.manage.mapper.CreateCustomerMapper;
import com.medical.customers.manage.mapper.FetchCustomerMapper;
import com.medical.customers.manage.mapper.UpdateCustomerMapper;
import com.medical.customers.manage.repository.CustomerDAO;
import com.medical.customers.manage.repository.InvoicesDAO;
import com.medical.customers.manage.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	@Autowired
	private InvoicesDAO invoicesDAO;

	@Autowired
	private CreateCustomerMapper createCustomerMapper;
	
	@Autowired
	private UpdateCustomerMapper updateCustomerMapper;

	@Autowired
	private FetchCustomerMapper fetchCustomerMapper;

	@Override
	public void createCustomer(CreateCustomerDto createCustomerDto) {
		customerDAO.save(createCustomerMapper.createCustomer(createCustomerDto));
	}

	@Override
	public void updateCustomer(UpdateCustomerDto updateCustomerDto) {
		customerDAO.save(updateCustomerMapper.updateCustomer(updateCustomerDto));

	}

	@Override
	public FetchCustomerDto findCustomerById(UUID customerID) {
		// FetchCustomerDto fetchCustomerDto = new FetchCustomerDto();
		// fetchCustomerDto = customerDAO.findOne(customerID);
		return null;
	}

	@Override
	public List<FetchCustomerDto> fetchAllCustomers() {
		List<FetchCustomerDto> allCustomers = fetchCustomerMapper.fetchAllCustomers(customerDAO.findAll());
		return allCustomers;
	}

	@Override
	public void SoftDeleteCustomerById(UUID customerID) {
		Optional<Customer> customersOpt = customerDAO.findById(customerID);

		if (customersOpt.isPresent()) {
			Customer customer = customersOpt.get();
			customer.setActiveFlag(false);
			customer.getInvoices().forEach(invoices -> {
				invoices.setActiveFlag(false);
				invoices.getItems().forEach(items -> {
					items.setActiveFlag(false);
				});
			});
			customerDAO.save(customer);
		} else {
			throw new RuntimeException("Customer not found with ID" + customerID);
		}

	}

	@Override
	public List<FetchCustomerDto> fetchAllActiveCustomers() {
		List<FetchCustomerDto> fetchCustomerDto = fetchCustomerMapper
				.fetchAllCustomers(customerDAO.findByActiveFlag(true));
		return fetchCustomerDto;
	}

	@Override
	public void SoftDeletInvoicesForCustomer(UUID CustomerID, List<UUID> invoicesToBeDeleted) {
		Optional<Customer> customerOpt = customerDAO.findById(CustomerID);

		if (customerOpt.isPresent()) {
			Customer customer = customerOpt.get();
			customer.getInvoices().forEach(invoice -> {
				if (invoicesToBeDeleted.contains(invoice.getInvoiceId())) {
					invoice.setActiveFlag(false);
					invoice.getItems().forEach(item -> {
						item.setActiveFlag(false);
					});
					invoicesDAO.save(invoice);
				}
			});
		}
	}

	@Override
	public List<FetchInvoicesDto> fetchAllActiveInvoicesForCustomer(UUID customerID) {
		Customer customer = customerDAO.findById(customerID)
				.orElseThrow(() -> new RuntimeException("Customer not found " + customerID));
		return customer.getInvoices().stream().filter(Invoices::getActiveFlag).map(fetchCustomerMapper::fetchInvoices)
				.collect(Collectors.toList());
	}

	@Override
	public int noOfCustomers() {
		return customerDAO.noOfCustomers();
	}

	@Override
	public int noOfInvoices() {
		return invoicesDAO.noOfInvoices();
	}

	/*
	 * @Override public FetchCustomerDto fetchAndUpdateCustomer(UUID customerID,
	 * CreateCustomerDto createCustomerDto){ return
	 * customerDAO.findById(customerID).map(existingCustomer -> {
	 * 
	 * BeanUtils.copyProperties(createCustomerDto, customerDAO, "customerID",
	 * "invoices");
	 * 
	 * Customer updatedCustomer = customerDAO.save(existingCustomer);
	 * 
	 * return fetchCustomerMapper.fetchCustomer(updatedCustomer);
	 * 
	 * }).orElseThrow(() -> new RuntimeException("Customer not found with Id" +
	 * customerID)); }
	 */

}
