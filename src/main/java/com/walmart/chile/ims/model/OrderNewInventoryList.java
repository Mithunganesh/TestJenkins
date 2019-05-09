package com.walmart.chile.ims.model;

public class OrderNewInventoryList {

	private String newItemId;
	private String newInventoryType;
	private Float newQty;
	
	
	public Float getNewQty() {
		return newQty;
	}
	public void setNewQty(Float newQty) {
		this.newQty = newQty;
	}
	public String getNewInventoryType() {
		return newInventoryType;
	}
	public void setNewInventoryType(String newInventoryType) {
		this.newInventoryType = newInventoryType;
	}
	public String getNewItemId() {
		return newItemId;
	}
	public void setNewItemId(String newItemId) {
		this.newItemId = newItemId;
	}
	
	
	
}
