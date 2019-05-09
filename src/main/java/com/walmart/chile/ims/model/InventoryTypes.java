package com.walmart.chile.ims.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@Entity
@Table(name = "IMS_INVENTORY_TYPES")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class InventoryTypes implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "INVENTORY_TYPE") 
	private String inventoryType;


	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	@Override
	public String toString() {
		return "InventoryTypes [INVENTORY_TYPE=" + inventoryType + "]";
	}
}
