package com.walmart.chile.ims.model;

public class OrderInventoryListResponse {

	
	private String shortShipGrpId;
	private String upc;
	private String itemId;
	private String productId;
	private String inventoryType;
	private Float quantity;
	/*private List<OrderUpcList> inventoryList;
	public List<OrderUpcList> getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(List<OrderUpcList> inventoryList) {
		this.inventoryList = inventoryList;
	}*/
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getShortShipGrpId() {
		return shortShipGrpId;
	}
	public void setShortShipGrpId(String shortShipGrpId) {
		this.shortShipGrpId = shortShipGrpId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
}
