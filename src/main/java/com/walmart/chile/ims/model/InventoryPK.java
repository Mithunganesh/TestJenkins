package com.walmart.chile.ims.model;

import java.io.Serializable;

public class InventoryPK  implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String itemId;

	protected String storeId;
	
	protected String inventoryType;
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
		result = prime * result + ((inventoryType == null) ? 0 : inventoryType.hashCode());
		return result;
	}

	public InventoryPK(String itemId, String storeId, String inventoryType) {
		super();
		this.itemId = itemId;
		this.storeId = storeId;
		this.inventoryType = inventoryType;
	}

	public InventoryPK() {
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
		InventoryPK other = (InventoryPK) obj;
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
