package com.walmart.chile.ims.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StoreUpcResponse {

	private String storeId;
	
	private List<UpcInventoryResponse> upcInventoryList;
	
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public List<UpcInventoryResponse> getUpcInventoryList() {
		return upcInventoryList;
	}
	public void setUpcInventoryList(List<UpcInventoryResponse> upcInventoryList) {
		this.upcInventoryList = upcInventoryList;
	}
}
