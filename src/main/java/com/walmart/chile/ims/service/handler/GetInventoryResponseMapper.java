package com.walmart.chile.ims.service.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.walmart.chile.ims.common.utility.CommonContants;
//import com.walmart.chile.ims.model.B2BInventoryQtyResponse;
//import com.walmart.chile.ims.model.B2BInventoryResponse;
//import com.walmart.chile.ims.model.B2BStoreItemResponse;
import com.walmart.chile.ims.model.Inventory;
import com.walmart.chile.ims.model.InventoryQtyResponse;
import com.walmart.chile.ims.model.ItemInventoryResponse;
import com.walmart.chile.ims.model.StoreItemResponse;
import com.walmart.chile.ims.service.dao.InventoryDAO;
import com.walmart.chile.ims.service.dao.InventoryDAOImpl;

@Component
public class GetInventoryResponseMapper {
	
	private static Logger log= Logger.getLogger(InventoryDAOImpl.class.getName());
	
	/**
	 * 
	 * @param inventoryRequest
	 * @param inventoryList
	 * @return
	 */
	public List<StoreItemResponse> generateGetStockByItemIdsResponse(Inventory inventoryRequest, List<Inventory> inventoryList){
		
		log.info("Entered GetInventoryResponseMapper :: generateGetStockByItemIdsResponse...");	
		List<StoreItemResponse> storeItemResponseList = new ArrayList<StoreItemResponse>();
		
		List<String> storeList =  null;
		if(inventoryRequest.getStoreIds() != null){
			inventoryRequest.getStoreIds().removeAll(Arrays.asList("", null));
		}
		if(inventoryRequest.getStoreIds() != null && !inventoryRequest.getStoreIds().isEmpty()){
			storeList = inventoryRequest.getStoreIds() ;
		}else{
			InventoryDAO inventoryDAO = new InventoryDAOImpl();
			storeList = inventoryDAO.getAllStores();
		}
		for(String store : storeList){
			StoreItemResponse storeItemResponse = new StoreItemResponse();
			storeItemResponse.setStoreId(store);
			List<ItemInventoryResponse> responseList = new ArrayList<ItemInventoryResponse>();
			
			for(String itemId : inventoryRequest.getItemIds()){
				ItemInventoryResponse response = null;
				for(Inventory inventory : inventoryList){
					if(inventory.getStoreId().equals(store)){
						InventoryQtyResponse invTypeQtyResponse = null;
						if(itemId.equals(inventory.getItemId()) ){
							if(response == null){
								response = new ItemInventoryResponse();
								response.setItemId(itemId);
								response.setIsExist(true);
								response.setInventoryList(new ArrayList<InventoryQtyResponse>());
							}
							invTypeQtyResponse = new InventoryQtyResponse();
							invTypeQtyResponse.setAvailableToSellQuantity(inventory.getAvailableToSellQuantity());
							invTypeQtyResponse.setInventoryType(inventory.getInventoryType());
							if(inventory.getAlwaysAvailableFlag() == null ||  inventory.getAlwaysAvailableFlag() == CommonContants.FALSE){
								invTypeQtyResponse.setIsAlwaysAvailableFlag(false);
							}else{
								invTypeQtyResponse.setIsAlwaysAvailableFlag(true);
							}
							response.getInventoryList().add(invTypeQtyResponse);
						}
					}
				}
				if(response == null){
					response = new ItemInventoryResponse();
					response.setItemId(itemId);
					response.setIsExist(false);
				}
				responseList.add(response);
			}
			storeItemResponse.setItemInventoryList(responseList);
			storeItemResponseList.add(storeItemResponse);
		}
		log.info("Exit GetInventoryResponseMapper :: generateGetStockByItemIdsResponse...");	
		return storeItemResponseList;
		
	}
	
	
}
