package com.walmart.chile.ims.model;

import java.util.List;

public class ShipGrpListRequest {

	private String shipGrpId;
	private List<OrderInvListRequest> productList;
	private List<OrderInvListRequest> itemList;
	private List<OrderInvListRequest> upcList;

	public List<OrderInvListRequest> getProductList() {
		return productList;
	}
	public void setProductList(List<OrderInvListRequest> productList) {
		this.productList = productList;
	}
	public String getShipGrpId() {
		return shipGrpId;
	}
	public void setShipGrpId(String shipGrpId) {
		this.shipGrpId = shipGrpId;
	}
	public List<OrderInvListRequest> getItemList() {
		return itemList;
	}
	public void setItemList(List<OrderInvListRequest> itemList) {
		this.itemList = itemList;
	}
	public List<OrderInvListRequest> getUpcList() {
		return upcList;
	}
	public void setUpcList(List<OrderInvListRequest> upcList) {
		this.upcList = upcList;
	}
	@Override
    public String toString() {
        return "ShipGrpListRequest [shipGrpId=" + this.shipGrpId + ", productList=" + this.productList
                + ", itemList=" + this.itemList + ", upcList=" + this.upcList + "]";
    }
}
