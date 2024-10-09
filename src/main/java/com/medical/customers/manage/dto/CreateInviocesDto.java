package com.medical.customers.manage.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.Valid;

public class CreateInviocesDto {

	private String invoiceNo;
	private Date invoiceDate;
	private Double invoiceTotal;
	private String paymentTerms;
	private String paymentMethod;
	private Date invoiceDueDate;
	private Double tax;
	private String narration;
	private String vehicleNo;
	private String route;
	private Date dispatchedDate;
	private String dispatchedDocument;
	private Double paidAmount;
	private Double balanceToBePaid;
	
	@Valid
	private List<CreateItemsDto> createItemsDto;

	public CreateInviocesDto() {
		super();
	}

	public CreateInviocesDto(String invoiceNo, Date invoiceDate, Double invoiceTotal, String paymentTerms,
			String paymentMethod, Date invoiceDueDate, Double tax, String narration, String vehicleNo, String route,
			Date dispatchedDate, String dispatchedDocument, Double paidAmount, Double balanceToBePaid,
			List<CreateItemsDto> createItemsDto) {
		super();
		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.invoiceTotal = invoiceTotal;
		this.paymentTerms = paymentTerms;
		this.paymentMethod = paymentMethod;
		this.invoiceDueDate = invoiceDueDate;
		this.tax = tax;
		this.narration = narration;
		this.vehicleNo = vehicleNo;
		this.route = route;
		this.dispatchedDate = dispatchedDate;
		this.dispatchedDocument = dispatchedDocument;
		this.paidAmount = paidAmount;
		this.balanceToBePaid = balanceToBePaid;
		this.createItemsDto = createItemsDto;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Double getInvoiceTotal() {
		return invoiceTotal;
	}

	public void setInvoiceTotal(Double invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Date getInvoiceDueDate() {
		return invoiceDueDate;
	}

	public void setInvoiceDueDate(Date invoiceDueDate) {
		this.invoiceDueDate = invoiceDueDate;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Date getDispatchedDate() {
		return dispatchedDate;
	}

	public void setDispatchedDate(Date dispatchedDate) {
		this.dispatchedDate = dispatchedDate;
	}

	public String getDispatchedDocument() {
		return dispatchedDocument;
	}

	public void setDispatchedDocument(String dispatchedDocument) {
		this.dispatchedDocument = dispatchedDocument;
	}

	public Double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Double getBalanceToBePaid() {
		return balanceToBePaid;
	}

	public void setBalanceToBePaid(Double balanceToBePaid) {
		this.balanceToBePaid = balanceToBePaid;
	}

	public List<CreateItemsDto> getCreateItemsDto() {
		return createItemsDto;
	}

	public void setCreateItemsDto(List<CreateItemsDto> createItemsDto) {
		this.createItemsDto = createItemsDto;
	}

	@Override
	public String toString() {
		return "CreateInviocesDto [invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate + ", invoiceTotal="
				+ invoiceTotal + ", paymentTerms=" + paymentTerms + ", paymentMethod=" + paymentMethod
				+ ", invoiceDueDate=" + invoiceDueDate + ", tax=" + tax + ", narration=" + narration + ", vehicleNo="
				+ vehicleNo + ", route=" + route + ", dispatchedDate=" + dispatchedDate + ", dispatchedDocument="
				+ dispatchedDocument + ", paidAmount=" + paidAmount + ", balanceToBePaid=" + balanceToBePaid
				+ ", createItemsDto=" + createItemsDto + "]";
	}

}
