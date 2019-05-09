package com.walmart.chile.ims.model;

import java.io.Serializable;

public class OrderInventoryPK  implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String orderId;
	
	protected String itemId;

	protected String storeId;
	
	protected String inventoryType;
	
	protected Integer statusId;
	
	protected String shipGroupId;
	
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
		result = prime * result + ((inventoryType == null) ? 0 : inventoryType.hashCode());
		result = prime * result + ((statusId == null) ? 0 : statusId.hashCode());
		result = prime * result + ((shipGroupId == null) ? 0 : shipGroupId.hashCode());
		return result;
	}

	public OrderInventoryPK(String orderId, String itemId, String storeId, String inventoryType, Integer statusId, String shipGroupId) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
		this.storeId = storeId;
		this.inventoryType = inventoryType;
		this.statusId = statusId;
		this.shipGroupId = shipGroupId;
	}

	public OrderInventoryPK() {
		// constructor
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;}
		if (obj == null){
			return false;}
		if (getClass() != obj.getClass()){
			return false;}
		OrderInventoryPK other = (OrderInventoryPK) obj;
		if (orderId == null) {
			if (other.orderId != null){
				return false;}
		} else if (!orderId.equals(other.orderId)){
			return false;}
		if (itemId == null) {
			if (other.itemId != null){
				return false;}
		} else if (!itemId.equals(other.itemId)){
			return false;}
		if (storeId == null) {
			if (other.storeId != null){
				return false;}
		} else if (!storeId.equals(other.storeId)){
			return false;}
		if (inventoryType == null) {
			if (other.inventoryType != null){
				return false;}
		} else if (!inventoryType.equals(other.inventoryType)){
			return false;}
		return true;
	}

	

}
