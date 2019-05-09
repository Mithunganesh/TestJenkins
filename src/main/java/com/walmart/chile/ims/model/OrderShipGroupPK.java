package com.walmart.chile.ims.model;

import java.io.Serializable;

public class OrderShipGroupPK  implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String orderId;
	
	protected String shipGroupId;

	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((shipGroupId == null) ? 0 : shipGroupId.hashCode());
		return result;
	}

	public OrderShipGroupPK(String orderId, String shipGroupId) {
		super();
		this.orderId = orderId;
		this.shipGroupId = shipGroupId;

	}

	public OrderShipGroupPK() {
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
		OrderShipGroupPK other = (OrderShipGroupPK) obj;
		if (orderId == null) {
			if (other.orderId != null){
				return false;}
		} else if (!orderId.equals(other.orderId)){
			return false;}
		return true;
	}

	

}
