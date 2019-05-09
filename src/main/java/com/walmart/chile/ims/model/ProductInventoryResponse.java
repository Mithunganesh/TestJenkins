package com.walmart.chile.ims.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductInventoryResponse {

	private String productId;
	private Boolean isExist;
	
	private List<InventoryQtyResponse> inventoryList;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public Boolean getIsExist() {
		return isExist;
	}
	public void setIsExist(Boolean isExist) {
		this.isExist = isExist;
	}
	public List<InventoryQtyResponse> getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(List<InventoryQtyResponse> InventoryList) {
		this.inventoryList = InventoryList;
	}
	
}
