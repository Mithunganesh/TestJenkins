package com.walmart.chile.ims.model;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@IdClass(OrderInventoryPK.class)
@Table(name = "IMS_ORDER_INVENTORY_DTLS")
public class OrderInventory {
	@Id
	@Column(name = "ORDER_ID")
	private String orderId;
	
	@Id
	@Column(name = "STORE_ID")
	private String storeId;
	
	@Id
	@Column(name = "ITEM_ID")
	private String itemId;
	
	@Id
	@Column(name = "INVENTORY_TYPE")
	private String inventoryType;
	
	@Id
	@Column(name = "STATUS_ID")
	private Integer statusId;
	
	@Id
	@Column(name = "SHIP_GRP_ID")
	private String shipGroupId;
	
	@Column(name = "QUANTITY")	
	private Float quantity;
	
	@Column(name = "ORDER_CHANNEL")
	private String orderChannel;
	
	@Column(name = "BACK_ORDER_ITEM_REF")
	private String backOrderItemRef;
	
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	
	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;
	
	@Column(name = "LAST_MODIFIED_BY")
	private String lastModifiedBy;
	
	
	@Transient
	private List<Inventory> itemList;
	
	@Transient
	private String productId;
	
	@Transient
	private String orderStatus;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	/*public Integer getAvailableToSellQuantity() {
		return availableToSellQuantity;
	}
	public void setAvailableToSellQuantity(Integer availableToSellQuantity) {
		this.availableToSellQuantity = availableToSellQuantity;
	}
	public Integer getReservedQuantity() {
		return reservedQuantity;
	}
	public void setReservedQuantity(Integer reservedQuantity) {
		this.reservedQuantity = reservedQuantity;
	}
	public Integer getOrderedQuantity() {
		return orderedQuantity;
	}
	public void setOrderedQuantity(Integer orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}
	public Date getReserveTime() {
		return reserveTime;
	}
	public void setReserveTime(Date reserveTime) {
		this.reserveTime = reserveTime;
	}*/


	public List<Inventory> getItemList() {
		return itemList;
	}

	public void setItemList(List<Inventory> itemList) {
		this.itemList = itemList;
	}
	
	/*public List<SubstituteItemRequest> getSubstituteItems() {
		return substituteItems;
	}

	public void setSubstituteItems(List<SubstituteItemRequest> substituteItems) {
		this.substituteItems = substituteItems;
	}*/
	
	public String getOrderChannel() {
		return orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0.00f;
        }
	}
	public String getShipGroupId() {
		return shipGroupId;
	}
	public void setShipGroupId(String shipGroupId) {
		this.shipGroupId = shipGroupId;
	}
	public String getBackOrderItemRef() {
		return backOrderItemRef;
	}
	public void setBackOrderItemRef(String backOrderItemRef) {
		this.backOrderItemRef = backOrderItemRef;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
}
