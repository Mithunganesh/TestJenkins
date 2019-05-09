package com.walmart.chile.ims.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StoreProductResponse {

	private String storeId;
	
	private List<ProductInventoryResponse> productInventoryList;
	
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public List<ProductInventoryResponse> getProductInventoryList() {
		return productInventoryList;
	}
	public void setProductInventoryList(List<ProductInventoryResponse> productInventoryList) {
		this.productInventoryList = productInventoryList;
	}
}
