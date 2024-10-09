package com.medical.customers.manage.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class UpdateInvoicesDto {

	private UUID invoiceId;
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

	private List<UpdateItemsDto> updateItemsDtos;

	public UpdateInvoicesDto() {
		super();
	}

	public UpdateInvoicesDto(UUID invoiceId, String invoiceNo, Date invoiceDate, Double invoiceTotal,
			String paymentTerms, String paymentMethod, Date invoiceDueDate, Double tax, String narration,
			String vehicleNo, String route, Date dispatchedDate, String dispatchedDocument, Double paidAmount,
			Double balanceToBePaid, List<UpdateItemsDto> updateItemsDtos) {
		super();
		this.invoiceId = invoiceId;
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
		this.updateItemsDtos = updateItemsDtos;
	}

	public UUID getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(UUID invoiceId) {
		this.invoiceId = invoiceId;
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

	public List<UpdateItemsDto> getUpdateItemsDtos() {
		return updateItemsDtos;
	}

	public void setUpdateItemsDtos(List<UpdateItemsDto> updateItemsDtos) {
		this.updateItemsDtos = updateItemsDtos;
	}

	@Override
	public String toString() {
		return "UpdateInvoicesDto [invoiceId=" + invoiceId + ", invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate
				+ ", invoiceTotal=" + invoiceTotal + ", paymentTerms=" + paymentTerms + ", paymentMethod="
				+ paymentMethod + ", invoiceDueDate=" + invoiceDueDate + ", tax=" + tax + ", narration=" + narration
				+ ", vehicleNo=" + vehicleNo + ", route=" + route + ", dispatchedDate=" + dispatchedDate
				+ ", dispatchedDocument=" + dispatchedDocument + ", paidAmount=" + paidAmount + ", balanceToBePaid="
				+ balanceToBePaid + ", updateItemsDtos=" + updateItemsDtos + "]";
	}

}
