package com.walmart.chile.ims.model;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderByProductResponse {
	private String orderId;
	private String orderStatus;
	private String storeId;
	
	private List<ShipGrpPdtListResponse> shipGrpList;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public List<ShipGrpPdtListResponse> getShipGrpList() {
		return shipGrpList;
	}
	public void setShipGrpList(List<ShipGrpPdtListResponse> shipGrpList) {
		this.shipGrpList = shipGrpList;
	}
}
