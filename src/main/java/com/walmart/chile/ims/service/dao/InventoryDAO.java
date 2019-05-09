package com.walmart.chile.ims.service.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.walmart.chile.ims.common.exception.IMSException;
import com.walmart.chile.ims.model.Inventory;


@Repository
public interface InventoryDAO {

	 List<Inventory> getStockByItemIds(List<Inventory> inventoryList, List<String> storeIds) throws IMSException;
	
	 List<String> getAllStores();

}
