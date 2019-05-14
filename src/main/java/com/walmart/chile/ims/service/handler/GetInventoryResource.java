package com.walmart.chile.ims.service.handler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.chile.ims.common.exception.IMSException;
import com.walmart.chile.ims.common.exception.IMSResponse;
import com.walmart.chile.ims.common.utility.CommonContants;
import com.walmart.chile.ims.model.Inventory;
import com.walmart.chile.ims.model.StoreItemResponse;
import com.walmart.chile.ims.service.business.GetStockBusinessDelegate;
import com.walmart.chile.ims.service.dao.InventoryDAOImpl;

@RestController

@RequestMapping(value = { "/GetInventory" })
public class GetInventoryResource {
	
	
	@Autowired
	private GetStockBusinessDelegate getStockDelegate;
	@Autowired
	private GetInventoryResponseMapper responseMapper;

	private static Logger log = Logger.getLogger(InventoryDAOImpl.class.getName());

	@GetMapping(value = { "/ping" })
	public String getServerTime() {
		return "received ping on " + new Date().toString();
	}

	/**
	 * This service returns the inventory details in all stores for a given list of
	 * itemIds
	 * 
	 * @param inventoryRequest
	 * @return
	 */

	@PostMapping(value = "/StockByItemIds", headers = "Accept=application/json")
	public ResponseEntity<List<StoreItemResponse>> getStockByItemIds(@RequestBody Inventory inventoryRequest) throws IMSException {
		log.info("Entered GetInventoryResource :: getStockByItemIds :: Request :: " + inventoryRequest);
		List<Inventory> inventoryList = null;
		List<StoreItemResponse> responseList = null;
		if (null == inventoryRequest) {
			throw new IMSException(253, CommonContants.ERR_JSON_INPUT_MISSING);
		}
		if (inventoryRequest.getItemIds() == null || inventoryRequest.getItemIds().isEmpty()
				|| inventoryRequest.getItemIds().contains("")) {
			throw new IMSException(252, CommonContants.ERR_ITEMIDS_MISSING);
		}

		//// removing duplicates if any in the request list
		List<String> itemList = new ArrayList<String>();
		for (String itemId : inventoryRequest.getItemIds()) {
			if (!itemList.contains(itemId)) {
				itemList.add(itemId);
			}
		}
		inventoryRequest.setItemIds(itemList);

		if (inventoryRequest.getStoreIds() != null) {
			List<String> storesList = new ArrayList<String>();
			for (String storeId : inventoryRequest.getStoreIds()) {
				if (!storesList.contains(storeId)) {
					storesList.add(storeId);
				}
			}
			inventoryRequest.setStoreIds(storesList);
		}

		inventoryList = getStockDelegate.getStockByItemIds(inventoryRequest);
		if (inventoryList == null || inventoryList.isEmpty()) {
			throw new IMSException(256, CommonContants.ERR_ITEMIDS_NOT_EXIST);
		}

		responseList = responseMapper.generateGetStockByItemIdsResponse(inventoryRequest, inventoryList);
		log.info("Exit GetInventoryResource :: getStockByItemIds :: Response :: " + responseList);
		return ResponseEntity.ok().headers(new HttpHeaders()).body(responseList);
	}
	
}
