package com.walmart.chile.ims.model;

import java.util.List;

public class OrderInvListRequest {

	private String shortShipGrpId;
	private String itemId;
	private String productId;
	private String upc;
	private String inventoryType;
	private Float quantity;
	
	private String oldItemId;
	private String newItemId;
	private String oldUpc;
	private String newUpc;
	private String oldInventoryType;
	private String newInventoryType;
	private Float oldQty;
	private Float newQty;

	private List<OrderInventoryList> inventoryList;
	private List<OrderNewInventoryList> newItemList;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public List<OrderInventoryList> getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(List<OrderInventoryList> inventoryList) {
		this.inventoryList = inventoryList;
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String productId) {
		this.itemId = productId;
	}
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
	public String getShortShipGrpId() {
		return shortShipGrpId;
	}
	public void setShortShipGrpId(String shortShipGrpId) {
		this.shortShipGrpId = shortShipGrpId;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getOldItemId() {
		return oldItemId;
	}
	public void setOldItemId(String oldItemId) {
		this.oldItemId = oldItemId;
	}
	public String getNewItemId() {
		return newItemId;
	}
	public void setNewItemId(String newItemId) {
		this.newItemId = newItemId;
	}
	public String getOldInventoryType() {
		return oldInventoryType;
	}
	public void setOldInventoryType(String oldInventoryType) {
		this.oldInventoryType = oldInventoryType;
	}
	public String getNewInventoryType() {
		return newInventoryType;
	}
	public void setNewInventoryType(String newInventoryType) {
		this.newInventoryType = newInventoryType;
	}
	public Float getOldQty() {
		return oldQty;
	}
	public void setOldQty(Float oldQty) {
		this.oldQty = oldQty;
	}
	public Float getNewQty() {
		return newQty;
	}
	public void setNewQty(Float newQty) {
		this.newQty = newQty;
	}
	public String getOldUpc() {
		return oldUpc;
	}
	public void setOldUpc(String oldUpc) {
		this.oldUpc = oldUpc;
	}
	public String getNewUpc() {
		return newUpc;
	}
	public void setNewUpc(String newUpc) {
		this.newUpc = newUpc;
	}
	public List<OrderNewInventoryList> getNewItemList() {
		return newItemList;
	}
	public void setNewItemList(List<OrderNewInventoryList> newItemList) {
		this.newItemList = newItemList;
	}
	@Override
    public String toString() {
        return "OrderInvListRequest [itemId=" + itemId + ", productId=" + productId + "]";
    }
}
