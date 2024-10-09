package com.medical.customers.manage.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.customers.manage.dto.CreateCustomerDto;
import com.medical.customers.manage.dto.FetchCustomerDto;
import com.medical.customers.manage.dto.FetchInvoicesDto;
import com.medical.customers.manage.dto.UpdateCustomerDto;
import com.medical.customers.manage.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/create")
	public void createCustomer(@Valid @RequestBody CreateCustomerDto createCustomerDto) {
		customerService.createCustomer(createCustomerDto);
	}

	@PutMapping("/update")
	public void updateCustomer(@Valid @RequestBody UpdateCustomerDto updateCustomerDto) {
		customerService.updateCustomer(updateCustomerDto);

	}

	/*
	 * @GetMapping("/AllCustomers") public List< FetchCustomerDto>
	 * fetchAlCustomers(){ return customerService.fetchAllCustomers(); }
	 */

	@GetMapping("/AllActiveCustomers")
	public List<FetchCustomerDto> fetchAllActiveCustomers() {
		return customerService.fetchAllActiveCustomers();
	}

	@DeleteMapping("/Delete/{customerID}")
	public void SoftDeleteCustomerById(@PathVariable UUID customerID) {
		customerService.SoftDeleteCustomerById(customerID);
	}

	@GetMapping("/AllActiveInvoicesForCustomer/{customerID}")
	public List<FetchInvoicesDto> fetchAllActiveInvoicesForCustomer(@PathVariable UUID customerID) {
		return customerService.fetchAllActiveInvoicesForCustomer(customerID);
	}

	@GetMapping("/NoOfCustomers")
	public int noOfCustomers() {
		return customerService.noOfCustomers();
	}

	@GetMapping("/NoOfInvoices")
	public int noOfInvoices() {
		return customerService.noOfInvoices();
	}

	/*
	 * @PutMapping("/UpdateCustomer/{customerID}") public FetchCustomerDto
	 * fetchAndUpdateCustomer(@PathVariable UUID customerID, @RequestBody
	 * CreateCustomerDto createCustomerDto) { return
	 * customerService.fetchAndUpdateCustomer(customerID, createCustomerDto); }
	 */
}
