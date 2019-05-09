package com.walmart.chile.ims.service.dao;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.support.LocalConnectionFactoryBean;
import org.springframework.stereotype.Repository;
import org.apache.log4j.Logger;
import com.walmart.chile.ims.common.exception.IMSException;
import com.walmart.chile.ims.common.utility.CommonContants;
import com.walmart.chile.ims.model.Inventory;
import com.walmart.chile.ims.model.InventoryPK;
import com.walmart.chile.ims.model.InventoryTypes;
import com.walmart.chile.ims.model.ItemCache;
import com.walmart.chile.ims.model.ProductItemCache;
import com.walmart.chile.ims.model.StoresCache;
import com.walmart.chile.ims.model.UpcItemCache;
//import com.walmart.chile.ims.service.HibernateUtil;
@Repository
public class InventoryDAOImpl implements InventoryDAO {

	
	@Autowired
	private SessionFactory factory;
	

	private Session session = null;
	private static Logger log= Logger.getLogger(InventoryDAOImpl.class.getName());
	DecimalFormat df = new DecimalFormat("###.###");
	
	@Override
	public List<Inventory> getStockByItemIds(List<Inventory> inventoryList, List<String> storeIds) throws IMSException{
		log.info("Entered InventoryDAOImpl :: getStockByItemIds...");
		try{
			session = factory.openSession();
			List<Inventory> resultInventoryList = null;
			
			if(storeIds != null){
				storeIds.removeAll(Arrays.asList("", null));
			}
			if(storeIds == null || storeIds.isEmpty()){
				storeIds = getStores();
			}else{
				boolean isStoreExist = false;
				for(String store : storeIds){
					if(getStores().contains(store)){
						isStoreExist = true;
						break;
					}
				}
				if(!isStoreExist){
					throw new IMSException(267, CommonContants.ERR_STORE_ID_NOT_EXIST, storeIds.toString());
				}
			}
			for(String store:storeIds){
				for (Inventory inv : inventoryList) {
					List<String> invTypeList = getInventoryTypes();
					for(String invType : invTypeList){
						InventoryPK id1 = new InventoryPK(inv.getItemId(),store, invType);
						Inventory inv1 = (Inventory) session.get(Inventory.class, id1);
						if(inv1!=null){
							if(resultInventoryList == null){
								resultInventoryList = new ArrayList<Inventory>();
							}
							resultInventoryList.add(inv1);		
						}
					}
				}			
			}
			log.info("Exit InventoryDAOImpl :: getStockByItemIds...");
			return resultInventoryList;
		}finally{
			session.close();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	 private List<String> getStores(){
		 log.debug("Entered InventoryDAOImpl :: getStores...");
			
		List<String> storesList = new ArrayList<String>();
		 Query qry=session.createQuery("from StoresCache");
	    List<StoresCache> stores=qry.list();
	    for(StoresCache store : stores){
	    	storesList.add(store.getStoreId());
	    }
	    log.debug("Exit InventoryDAOImpl :: getStores...");
	    return storesList;
	 }
	 
	
	 /**
	  * 
	  */
	 public List<String> getAllStores(){
		 log.debug("Entered InventoryDAOImpl :: getAllStores...");
		 try{
			 session = factory.openSession();
			 session.beginTransaction();
				
			 List<String> storesList = new ArrayList<String>();
			 Query qry=session.createQuery("from StoresCache");
		     List<StoresCache> stores=qry.list();
		     for(StoresCache store : stores){
		     	storesList.add(store.getStoreId());
		     }
		     log.debug("Exit InventoryDAOImpl :: getAllStores...");
		     return storesList;
		 }finally{
			 session.close();
		 }
		
	 }
	 
	 /**
	  * 
	  * @return
	  */
	 private List<String> getInventoryTypes(){
		 log.debug("Entered InventoryDAOImpl :: getInventoryTypes...");
		List<String> invTypesList = new ArrayList<String>();
		 Query qry=session.createQuery("from InventoryTypes");
	    List<InventoryTypes> types=qry.list();
	    for(InventoryTypes invType : types){
	    	invTypesList.add(invType.getInventoryType().toLowerCase());
	    }
	    log.debug("Exit InventoryDAOImpl :: getInventoryTypes...");
	    return invTypesList;
	 }
	 
	 
}
