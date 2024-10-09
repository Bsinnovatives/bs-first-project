package com.medical.customers.manage.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoices", schema = "bs_medical_customers")
public class Invoices {

	@Id
	@Column(name = "invoice_id")
	private UUID invoiceId;

	@Column(name = "invoice_no")
	private String invoiceNo;

	@Column(name = "invoice_date")
	private Date invoiceDate;

	@Column(name = "invoice_total")
	private Double invoiceTotal;

	@Column(name = "payment_terms")
	private String paymentTerms;

	@Column(name = "payment_method")
	private String paymentMethod;

	@Column(name = "invoice_due_date")
	private Date invoiceDueDate;

	@Column(name = "tax")
	private Double tax;

	@Column(name = "narration")
	private String narration;

	@Column(name = "vehicle_no")
	private String vehicleNo;

	@Column(name = "route")
	private String route;

	@Column(name = "dispatched_date")
	private Date dispatchedDate;

	@Column(name = "dispatched_document")
	private String dispatchedDocument;

	@Column(name = "paid_amount")
	private Double paidAmount;

	@Column(name = "balance_to_be_paid")
	private Double balanceToBePaid;

	@Column(name = "active_flag")
	private Boolean activeFlag;

	@JsonManagedReference("invoice-items")
	@OneToMany(mappedBy = "invoices", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Items> items;

	@JsonBackReference("customer-invoices")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public Invoices() {

	}

	public Invoices(UUID invoiceId, String invoiceNo, Date invoiceDate, Double invoiceTotal, String paymentTerms,
			String paymentMethod, Date invoiceDueDate, Double tax, String narration, String vehicleNo, String route,
			Date dispatchedDate, String dispatchedDocument, Double paidAmount, Double balanceToBePaid,
			Boolean activeFlag, List<Items> items, Customer customer) {
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
		this.activeFlag = activeFlag;
		this.items = items;
		this.customer = customer;
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

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
