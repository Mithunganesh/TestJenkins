package com.walmart.chile.ims.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InventoryQtyResponse {

	private String inventoryType;
	private Float availableToSellQuantity;
	private Boolean isAlwaysAvailableFlag;
	
	
	public Boolean getIsAlwaysAvailableFlag() {
		return isAlwaysAvailableFlag;
	}
	public void setIsAlwaysAvailableFlag(Boolean isAlwaysAvailableFlag) {
		this.isAlwaysAvailableFlag = isAlwaysAvailableFlag;
	}
	public Float getAvailableToSellQuantity() {
		return availableToSellQuantity;
	}
	public void setAvailableToSellQuantity(Float availableToSellQuantity) {
		this.availableToSellQuantity = availableToSellQuantity;
	}
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
}
