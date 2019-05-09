package com.walmart.chile.ims.model;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name = "IMS_STORES_CACHE")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.TRANSACTIONAL,region="IMSCache")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class StoresCache implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "STORE_ID") 
	private String storeId;

	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	@Override
	public String toString() {
		return "Stores [Store ID=" + storeId + "]";
	}
}
