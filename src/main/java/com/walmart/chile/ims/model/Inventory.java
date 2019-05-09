package com.walmart.chile.ims.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@XmlRootElement
@Entity
@IdClass(InventoryPK.class)
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.TRANSACTIONAL,region="IMSCache")
@Table(name = "IMS_INVENTORY_MASTER")
public class Inventory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ITEM_ID") 
	private String itemId;
	
	@Id
	@Column(name = "STORE_ID") 
	private String storeId;
	
	@Id
	@Column(name = "INVENTORY_TYPE")
	private String inventoryType;
	
	@Column(name = "PRODUCT_ID") 
	private String productId;
	
	@Column(name = "UPC") 
	private String upc;
	
	@Column(name = "ON_HAND_QTY") 
	private Float onHandQuantity;
	
	@Column(name = "ATS_QTY") 
	//private Integer availableToSellQuantity;
	private Float availableToSellQuantity;
	
	@Column(name = "RESERVED_QTY") 
	//private Integer reservedQuantity;
	private Float reservedQuantity;
	
	@Column(name = "ORDERED_QTY")
	//private Integer orderedQuantity;
	private Float orderedQuantity;
	
	@Column(name = "SECURITY_STOCK") 
	//private Integer securityStock;
	private Float securityStock;
	
	@Column(name = "IS_ALWAYS_AVAILABLE") 
	private Integer alwaysAvailableFlag;
	
	@Transient
	private List<String> itemIds;
	
	@Transient
	private List<String> productIds;
	
	@Transient
	private List<String> upcs;
	
	@Transient
	private List<String> storeIds;
	
	@Transient
	private Float quantity;
	
	@Transient
	private String channel;
	
	@Transient
	private String shipGroupId;
	
	@Transient
	private String shortShipGroupId;
	
	@Transient
	private Float reserveCalculation ;
	
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	
	public List<String> getStoreIds() {
		return storeIds;
	}

	public void setStoreIds(List<String> storeIds) {
		this.storeIds = storeIds;
	}

	@Override
	public String toString() {
		return "Inventory [itemId=" + itemId + ", storeId=" + storeId
				+ ", productId=" + productId + ", upc=" + upc + ", itemIds="
				+ itemIds + ", productIds=" + productIds + ", upcs=" + upcs
				+ "]";
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((alwaysAvailableFlag == null) ? 0 : alwaysAvailableFlag
						.hashCode());
		result = prime
				* result
				+ ((availableToSellQuantity == null) ? 0
						: availableToSellQuantity.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((itemIds == null) ? 0 : itemIds.hashCode());
		result = prime * result
				+ ((onHandQuantity == null) ? 0 : onHandQuantity.hashCode());
		result = prime * result
				+ ((orderedQuantity == null) ? 0 : orderedQuantity.hashCode());
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result
				+ ((productIds == null) ? 0 : productIds.hashCode());
		result = prime
				* result
				+ ((reservedQuantity == null) ? 0 : reservedQuantity.hashCode());
		result = prime * result
				+ ((securityStock == null) ? 0 : securityStock.hashCode());
		result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
		result = prime * result + ((upc == null) ? 0 : upc.hashCode());
		result = prime * result + ((upcs == null) ? 0 : upcs.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;}
		if (obj == null){
			return false;}
		if (getClass() != obj.getClass()){
			return false;}
		Inventory other = (Inventory) obj;
		if (availableToSellQuantity == null) {
			if (other.availableToSellQuantity != null){
				return false;}
		} else if (!availableToSellQuantity
				.equals(other.availableToSellQuantity)){
			return false;}
		if (itemId == null) {
			if (other.itemId != null){
				return false;}
		} else if (!itemId.equals(other.itemId)){
			return false;}
		if (onHandQuantity == null) {
			if (other.onHandQuantity != null){
				return false;}
		}
		if (productId == null) {
			if (other.productId != null){
				return false;}
		}  else if (!productIds.equals(other.productIds)){
			return false;}
		if (reservedQuantity == null) {
			if (other.reservedQuantity != null){
				return false;}
		} else if (!reservedQuantity.equals(other.reservedQuantity)){
			return false;}
		if (securityStock == null) {
			if (other.securityStock != null){
				return false;}
		} else if (!securityStock.equals(other.securityStock)){
			return false;}
		if (storeId == null) {
			if (other.storeId != null){
				return false;}
		} else if (!storeId.equals(other.storeId)){
			return false;}
		if (upc == null) {
			if (other.upc != null){
				return false;}
		} else if (!upc.equals(other.upc)){
			return false;}
		
		return true;
	}
	
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
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public Float getOnHandQuantity() {
		return onHandQuantity;
	}
	public void setOnHandQuantity(Float onHandQuantity) {
		this.onHandQuantity = onHandQuantity;
	}
	public Float getAvailableToSellQuantity() {
		return availableToSellQuantity;
	}
	public void setAvailableToSellQuantity(Float availableToSellQuantity) {
		this.availableToSellQuantity = availableToSellQuantity;
	}
	public Float getReservedQuantity() {
		return reservedQuantity;
	}
	public void setReservedQuantity(Float reservedQuantity) {
		if (reservedQuantity > 0) {
            this.reservedQuantity = reservedQuantity;
        } else {
            this.reservedQuantity =0.00f;
        }
	}
	public Float getOrderedQuantity() {
		return orderedQuantity;
	}
	public void setOrderedQuantity(Float orderedQuantity) {
		if (orderedQuantity > 0) {
            this.orderedQuantity = orderedQuantity;
        } else {
            this.orderedQuantity = 0.00f;
        }
	}
	public Float getSecurityStock() {
		return securityStock;
	}
	public void setSecurityStock(Float securityStock) {
		this.securityStock = securityStock;
	}
	public Integer getAlwaysAvailableFlag() {
		return alwaysAvailableFlag;
	}
	public void setAlwaysAvailableFlag(Integer alwaysAvailableFlag) {
		this.alwaysAvailableFlag = alwaysAvailableFlag;
	}

	public List<String> getItemIds() {
		return itemIds;
	}

	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}
	
	public List<String> getProductIds() {
		return productIds;
	}
	public void setProductIds(List<String> productIds) {
		this.productIds = productIds;
	}

	public List<String> getUpcs() {
		return upcs;
	}

	public void setUpcs(List<String> upcs) {
		this.upcs = upcs;
	}

	public String getShipGroupId() {
		return shipGroupId;
	}

	public void setShipGroupId(String shipGroupId) {
		this.shipGroupId = shipGroupId;
	}

	public String getShortShipGroupId() {
		return shortShipGroupId;
	}

	public void setShortShipGroupId(String shortShipGroupId) {
		this.shortShipGroupId = shortShipGroupId;
	}

	public Float getReserveCalculation() {
		return reserveCalculation;
	}

	public void setReserveCalculation(Float reserveCalculation) {
		this.reserveCalculation = reserveCalculation;
	}
	
	
}
