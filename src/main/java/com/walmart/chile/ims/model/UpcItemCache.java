package com.walmart.chile.ims.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "IMS_UPC_CACHE")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL, region = "IMSCache")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class UpcItemCache implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "UPC")
	private String upc;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ItemIdList == null) ? 0 : ItemIdList.hashCode());
		result = prime * result + ((upc == null) ? 0 : upc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UpcItemCache other = (UpcItemCache) obj;
		if (ItemIdList == null) {
			if (other.ItemIdList != null)
				return false;
		} else if (!ItemIdList.equals(other.ItemIdList))
			return false;
		if (upc == null) {
			if (other.upc != null)
				return false;
		} else if (!upc.equals(other.upc))
			return false;
		return true;
	}

	@ElementCollection
	@JoinTable(name = "IMS_UPC_ITEM_CACHE", joinColumns = @JoinColumn(name = "UPC"))
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL, region = "IMSCache")
	@Cascade({ CascadeType.SAVE_UPDATE })
	private Collection<ItemCache> ItemIdList = new ArrayList<ItemCache>();

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Collection<ItemCache> getItemIdList() {
		return ItemIdList;
	}

	public void setItemIdList(Collection<ItemCache> itemIdList) {
		ItemIdList = itemIdList;
	}

	@Override
	public String toString() {
		return "ProductItemMapperWithCollection [UPC=" + upc + ", ItemIdList=" + ItemIdList + "]";
	}

}
