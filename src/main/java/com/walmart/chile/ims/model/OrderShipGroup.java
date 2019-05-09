package com.walmart.chile.ims.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@IdClass(OrderShipGroupPK.class)
@Table(name = "IMS_ORDER_SHIP_GRP_DTLS")
public class OrderShipGroup {
	@Id
	@Column(name = "ORDER_ID")
	private String orderId;
	
	@Id
	@Column(name = "SHIP_GRP_ID")
	private String shipGroupId;
	
	@Column(name = "SHIP_GRP_TYPE")
	private Integer shipGroupType;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getShipGroupId() {
		return shipGroupId;
	}
	public void setShipGroupId(String shipGroupId) {
		this.shipGroupId = shipGroupId;
	}
	public Integer getShipGroupType() {
		return shipGroupType;
	}
	public void setShipGroupType(Integer shipGroupType) {
		this.shipGroupType = shipGroupType;
	}
}
