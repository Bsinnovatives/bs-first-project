package com.medical.customers.manage.dto;

import java.util.List;

import jakarta.validation.Valid;

public class CreateCustomerDto {

	private String customerName;
	private String aadharNo;
	private String mobileNo;
	private String gstNo;
	private String panNo;
	private String city;
	private String state;
	
	@Valid
	private List<CreateInviocesDto> createInvoicesDto;

	public CreateCustomerDto() {
		super();
	}

	public CreateCustomerDto(String customerName, String aadharNo, String mobileNo, String gstNo, String panNo,
			String city, String state, List<CreateInviocesDto> createInvoicesDto) {
		super();
		this.customerName = customerName;
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
		this.gstNo = gstNo;
		this.panNo = panNo;
		this.city = city;
		this.state = state;
		this.createInvoicesDto = createInvoicesDto;
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

	public List<CreateInviocesDto> getCreateInvoicesDto() {
		return createInvoicesDto;
	}

	public void setCreateInvoicesDto(List<CreateInviocesDto> createInvoicesDto) {
		this.createInvoicesDto = createInvoicesDto;
	}

	@Override
	public String toString() {
		return "CreateCustomerDto [customerName=" + customerName + ", aadharNo=" + aadharNo + ", mobileNo=" + mobileNo
				+ ", gstNo=" + gstNo + ", panNo=" + panNo + ", city=" + city + ", state=" + state
				+ ", createInvoicesDto=" + createInvoicesDto + "]";
	}

}
