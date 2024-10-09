package com.medical.customers.manage.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "items", schema = "bs_medical_customers")
public class Items {

	@Id
	@Column(name = "item_id")
	private UUID itemId;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "item_description")
	private String itemDescription;

	@Column(name = "item_type")
	private String itemType;

	@Column(name = "item_state")
	private String itemState;

	@Column(name = "quantity_invoiced")
	private Double quantityInvoiced;

	@Column(name = "unit_price")
	private Double unitPrice;

	@Column(name = "total_amount")
	private Double totalAmount;

	@Column(name = "active_flag")
	private Boolean activeFlag;

	@JsonBackReference("invoice-items")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "invoice_id")
	private Invoices invoices;

	public Items(UUID itemId, String itemName, String itemDescription, String itemType, String itemState,
			Double quantityInvoiced, Double unitPrice, Double totalAmount, Boolean activeFlag, Invoices invoices) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemType = itemType;
		this.itemState = itemState;
		this.quantityInvoiced = quantityInvoiced;
		this.unitPrice = unitPrice;
		this.totalAmount = totalAmount;
		this.activeFlag = activeFlag;
		this.invoices = invoices;
	}

	public Items() {

	}

	public UUID getItemId() {
		return itemId;
	}

	public void setItemId(UUID itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemState() {
		return itemState;
	}

	public void setItemState(String itemState) {
		this.itemState = itemState;
	}

	public Double getQuantityInvoiced() {
		return quantityInvoiced;
	}

	public void setQuantityInvoiced(Double quantityInvoiced) {
		this.quantityInvoiced = quantityInvoiced;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Invoices getInvoices() {
		return invoices;
	}

	public void setInvoices(Invoices invoices) {
		this.invoices = invoices;
	}

}
