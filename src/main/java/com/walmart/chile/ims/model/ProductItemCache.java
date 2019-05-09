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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "IMS_PRODUCTS_CACHE")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.TRANSACTIONAL,region="IMSCache")
public class ProductItemCache implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ItemIdList == null) ? 0 : ItemIdList.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
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
		ProductItemCache other = (ProductItemCache) obj;
		if (ItemIdList == null) {
			if (other.ItemIdList != null)
				return false;
		} else if (!ItemIdList.equals(other.ItemIdList))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		return true;
	}

	@Id
	@Column(name = "PRODUCT_ID") 
	private String productId;
	
	@ElementCollection
	@JoinTable(name="IMS_PRODUCT_ITEM_CACHE",
            joinColumns=@JoinColumn(name="PRODUCT_ID"))
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL,region="IMSCache")
	@Cascade({CascadeType.SAVE_UPDATE}) 
    private Collection<ItemCache> ItemIdList = new ArrayList<ItemCache>();

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Collection<ItemCache> getItemIdList() {
		return ItemIdList;
	}

	public void setItemIdList(Collection<ItemCache> itemIdList) {
		ItemIdList = itemIdList;
	}

	@Override
	public String toString() {
		return "ProductItemMapperWithCollection [productId=" + productId + ", ItemIdList=" + ItemIdList + "]";
	}
	
	
}
