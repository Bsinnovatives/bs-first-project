package com.medical.customers.manage.dto;

import java.util.List;
import java.util.UUID;

public class FetchCustomerDto {

	private UUID customerID;
	private String customerName;
	private String aadharNo;
	private String mobileNo;
	private String gstNo;
	private String panNo;
	private String city;
	private String state;
	private Boolean activeFlag;
	private List<FetchInvoicesDto> fetchInvoiceDto;

	public FetchCustomerDto() {

	}

	public FetchCustomerDto(UUID customerID, String customerName, String aadharNo, String mobileNo, String gstNo,
			String panNo, String city, String state, Boolean activeFlag, List<FetchInvoicesDto> fetchInvoiceDto) {
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
		this.fetchInvoiceDto = fetchInvoiceDto;
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

	public List<FetchInvoicesDto> getFetchInvoiceDto() {
		return fetchInvoiceDto;
	}

	public void setFetchInvoiceDto(List<FetchInvoicesDto> fetchInvoiceDto) {
		this.fetchInvoiceDto = fetchInvoiceDto;
	}

	@Override
	public String toString() {
		return "FetchCustomerDto [customerID=" + customerID + ", customerName=" + customerName + ", aadharNo="
				+ aadharNo + ", mobileNo=" + mobileNo + ", gstNo=" + gstNo + ", panNo=" + panNo + ", city=" + city
				+ ", state=" + state + ", activeFlag=" + activeFlag + ", fetchInvoiceDto=" + fetchInvoiceDto + "]";
	}

}
