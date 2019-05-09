package com.walmart.chile.ims.model;

import java.util.List;

public class ShipGrpPdtListResponse {

	private String shipGrpId;
	private List<OrderProductListResponse> productList;

	public String getShipGrpId() {
		return shipGrpId;
	}
	public void setShipGrpId(String shipGrpId) {
		this.shipGrpId = shipGrpId;
	}
	public List<OrderProductListResponse> getProductList() {
		return productList;
	}
	public void setProductList(List<OrderProductListResponse> productList) {
		this.productList = productList;
	}
}
