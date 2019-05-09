package com.walmart.chile.ims.model;

import java.util.List;

public class OrderProductListResponse {

	private String productId;
	private List<OrderInventoryList> inventoryList;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public List<OrderInventoryList> getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(List<OrderInventoryList> inventoryList) {
		this.inventoryList = inventoryList;
	}
	
}
