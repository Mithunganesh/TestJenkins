package com.walmart.chile.ims.model;

import java.util.List;

public class ItemInventoryResponse {

	private String itemId;
	private Boolean isExist;
	private List<InventoryQtyResponse> inventoryList;
	
	public List<InventoryQtyResponse> getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(List<InventoryQtyResponse> InventoryList) {
		this.inventoryList = InventoryList;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public Boolean getIsExist() {
		return isExist;
	}
	public void setIsExist(Boolean isExist) {
		this.isExist = isExist;
	}
}
