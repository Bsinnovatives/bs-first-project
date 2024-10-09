package com.medical.customers.manage.entity;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer", schema = "bs_medical_customers")
public class Customer {

	@Id
	@Column(name = "customer_id")
	private UUID customerID;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "aadhar_no")
	private String aadharNo;

	@Column(name = "mobile_no")
	private String mobileNo;

	@Column(name = "gst_no")
	private String gstNo;

	@Column(name = "pan_no")
	private String panNo;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "active_flag")
	private Boolean activeFlag;

	@JsonManagedReference("customer-invoices")
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Invoices> invoices;

	public Customer() {

	}

	public Customer(UUID customerID, String customerName, String aadharNo, String mobileNo, String gstNo, String panNo,
			String city, String state, Boolean activeFlag, List<Invoices> invoices) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
		this.gstNo = gstNo;
		this.panNo = panNo;
		this.city = city;
		this.state = state;
		this.activeFlag = activeFlag;
		this.invoices = invoices;
	}

	public UUID getCustomerID() {
		return customerID;
	}

	public void setCustomerID(UUID customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public List<Invoices> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoices> invoices) {
		this.invoices = invoices;
	}

}
