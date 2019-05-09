package com.walmart.chile.ims.model;

import java.util.List;

public class ShipGrpInvListResponse {

	private String shipGrpId;
	private List<OrderInventoryListResponse> inventoryList;
	

	public String getShipGrpId() {
		return shipGrpId;
	}
	public void setShipGrpId(String shipGrpId) {
		this.shipGrpId = shipGrpId;
	}
	public List<OrderInventoryListResponse> getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(List<OrderInventoryListResponse> inventoryList) {
		this.inventoryList = inventoryList;
	}
}
