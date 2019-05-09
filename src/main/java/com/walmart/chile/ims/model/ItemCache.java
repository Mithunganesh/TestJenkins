package com.walmart.chile.ims.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemCache {

	
	@Column(name = "ITEM_ID") 
	private String itemId;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
}
