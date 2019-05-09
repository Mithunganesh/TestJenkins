package com.walmart.chile.ims.model;

import java.util.List;

public class OrderRequest {

	
	private String orderId;
	
	private String storeId;
	
	private String channel;
	
	private List<ShipGrpListRequest> shipGrpList;

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<ShipGrpListRequest> getShipGrpList() {
		return shipGrpList;
	}

	public void setShipGrpList(List<ShipGrpListRequest> shipGrpList) {
		this.shipGrpList = shipGrpList;
	}

	@Override
    public String toString() {
        return "OrderRequest [orderId=" + this.orderId + ", storeId=" + this.storeId + ", channel="
                + this.channel + ", shipGrpList=" + this.shipGrpList + "]";
    }
	
}
