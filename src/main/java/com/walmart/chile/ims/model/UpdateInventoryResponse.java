package com.walmart.chile.ims.model;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class UpdateInventoryResponse {
	private String itemId;
	private String storeId;
	private String inventoryType;
	private Integer alwaysAvailableFlag;
	private Float securityStock;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public Integer getAlwaysAvailableFlag() {
		return alwaysAvailableFlag;
	}
	public void setAlwaysAvailableFlag(Integer alwaysAvailableFlag) {
		this.alwaysAvailableFlag = alwaysAvailableFlag;
	}
	public Float getSecurityStock() {
		return securityStock;
	}
	public void setSecurityStock(Float securityStock) {
		this.securityStock = securityStock;
	}
}
