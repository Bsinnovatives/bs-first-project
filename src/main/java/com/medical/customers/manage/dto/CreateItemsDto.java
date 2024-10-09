package com.medical.customers.manage.dto;

public class CreateItemsDto {

	private String itemName;
	private String itemDescription;
	private String itemType;
	private String itemState;
	private Double quantityInvoiced;
	private Double unitPrice;
	private Double totalAmount;

	public CreateItemsDto() {

	}

	public CreateItemsDto(String itemName, String itemDescription, String itemType, String itemState,
			Double quantityInvoiced, Double unitPrice, Double totalAmount) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemType = itemType;
		this.itemState = itemState;
		this.quantityInvoiced = quantityInvoiced;
		this.unitPrice = unitPrice;
		this.totalAmount = totalAmount;
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
		return "CreateItemsDto [itemName=" + itemName + ", itemDescription=" + itemDescription + ", itemType="
				+ itemType + ", itemState=" + itemState + ", quantityInvoiced=" + quantityInvoiced + ", unitPrice="
				+ unitPrice + ", totalAmount=" + totalAmount + "]";
	}

}
