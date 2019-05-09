package com.walmart.chile.ims.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StoreItemResponse {

	private String storeId;
	
	private List<ItemInventoryResponse> itemInventoryList;
	
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public List<ItemInventoryResponse> getItemInventoryList() {
		return itemInventoryList;
	}
	public void setItemInventoryList(List<ItemInventoryResponse> itemInventoryList) {
		this.itemInventoryList = itemInventoryList;
	}
}
