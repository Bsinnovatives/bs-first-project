package com.medical.customers.manage.dto;

import java.util.UUID;

public class UpdateItemsDto {

	private UUID itemId;
	private String itemName;
	private String itemDescription;
	private String itemType;
	private String itemState;
	private Double quantityInvoiced;
	private Double unitPrice;
	private Double totalAmount;

	public UpdateItemsDto() {
		super();
	}

	public UpdateItemsDto(UUID itemId, String itemName, String itemDescription, String itemType, String itemState,
			Double quantityInvoiced, Double unitPrice, Double totalAmount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemType = itemType;
		this.itemState = itemState;
		this.quantityInvoiced = quantityInvoiced;
		this.unitPrice = unitPrice;
		this.totalAmount = totalAmount;
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

	@Override
	public String toString() {
		return "UpdateItemsDto [itemId=" + itemId + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", itemType=" + itemType + ", itemState=" + itemState + ", quantityInvoiced=" + quantityInvoiced
				+ ", unitPrice=" + unitPrice + ", totalAmount=" + totalAmount + "]";
	}

}
