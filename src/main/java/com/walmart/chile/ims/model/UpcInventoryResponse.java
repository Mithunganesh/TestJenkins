package com.walmart.chile.ims.model;

import java.util.List;

public class UpcInventoryResponse {

	private String upc;
	private Boolean isExist;
	private List<InventoryQtyResponse> inventoryList;
	
	
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public List<InventoryQtyResponse> getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(List<InventoryQtyResponse> inventoryList) {
		this.inventoryList = inventoryList;
	}
	public Boolean getIsExist() {
		return isExist;
	}
	public void setIsExist(Boolean isExist) {
		this.isExist = isExist;
	}
}
