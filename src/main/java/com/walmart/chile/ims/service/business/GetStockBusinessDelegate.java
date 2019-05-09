package com.walmart.chile.ims.service.business;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.walmart.chile.ims.common.exception.IMSException;
import com.walmart.chile.ims.model.Inventory;
import com.walmart.chile.ims.service.dao.InventoryDAO;
import com.walmart.chile.ims.service.dao.InventoryDAOImpl;

@Service
@Transactional
public class GetStockBusinessDelegate {

	//private InventoryDAO inventoryDAO = new InventoryDAOImpl();
	@Autowired
	private InventoryDAO inventoryDAO;

	private static Logger log= Logger.getLogger(GetStockBusinessDelegate.class.getName());

	/**
	 * 
	 * @param inventoryRequest
	 * @return
	 * @throws IMSException 
	 */
	public List<Inventory> getStockByItemIds(Inventory inventoryRequest) throws IMSException{
		log.info("Entered GetStockBusinessDelegate :: getStockByItemIds...");	
		List<Inventory> inventoryList = new ArrayList<Inventory>();
		
		for(String itemId : inventoryRequest.getItemIds()){
			Inventory inventory = new Inventory();
			inventory.setItemId(itemId);
			inventoryList.add(inventory);
		}
		 List<String> kk = inventoryRequest.getStoreIds();
		 inventoryList = inventoryDAO.getStockByItemIds(inventoryList, inventoryRequest.getStoreIds());
		 log.info("Exit GetStockBusinessDelegate :: getStockByItemIds...");	
	     return inventoryList;
	}

}
