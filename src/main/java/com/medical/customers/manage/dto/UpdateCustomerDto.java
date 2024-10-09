package com.medical.customers.manage.dto;

import java.util.List;
import java.util.UUID;

public class UpdateCustomerDto {

	private UUID customerID;
	private String customerName;
	private String aadharNo;
	private String mobileNo;
	private String gstNo;
	private String panNo;
	private String city;
	private String state;

	private List<UpdateInvoicesDto> updateInvoicesDto;

	public UpdateCustomerDto() {
		super();
	}

	public UpdateCustomerDto(UUID customerID, String customerName, String aadharNo, String mobileNo, String gstNo,
			String panNo, String city, String state, List<UpdateInvoicesDto> updateInvoicesDto) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
		this.gstNo = gstNo;
		this.panNo = panNo;
		this.city = city;
		this.state = state;
		this.updateInvoicesDto = updateInvoicesDto;
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

	public List<UpdateInvoicesDto> getUpdateInvoicesDto() {
		return updateInvoicesDto;
	}

	public void setUpdateInvoicesDto(List<UpdateInvoicesDto> updateInvoicesDto) {
		this.updateInvoicesDto = updateInvoicesDto;
	}

	@Override
	public String toString() {
		return "UpdateCustomerDto [customerID=" + customerID + ", customerName=" + customerName + ", aadharNo="
				+ aadharNo + ", mobileNo=" + mobileNo + ", gstNo=" + gstNo + ", panNo=" + panNo + ", city=" + city
				+ ", state=" + state + ", updateInvoicesDto=" + updateInvoicesDto + "]";
	}

}
