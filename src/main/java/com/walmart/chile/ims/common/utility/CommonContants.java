package com.walmart.chile.ims.common.utility;

public class CommonContants {
	
	private CommonContants() {
	}

	//****IMS GENERAL****//
	
	public static final String SESSIONFACTORY ="sessionFactory";
	
	public static final String IN_STORE_INVENTORY = "in-store";
	
	public static final String GREEN_SALES_INVENTORY = "dsv";
	
	public static final String INVENTORY_TYPE_LIST = "in-store,dsv";
	
	public static final String STORES_LIST = "872,800";
	
	public static final Integer TRUE = 1;
	
	public static final Integer FALSE = 0;
	
	public static final String DEFAULTBACKORDREF = "0";
	
	//****SERVICE NAME****//
	
	public static final String  RESERVEBYPDT ="ReserveOrderByProductID";
	public static final String  RESERVEBYITEM ="ReserveOrderByItemID";
	public static final String  RESERVEBYUPC ="ReserveOrderByUpc";
	
	public static final String  PLACEORDER ="PlaceOrder";
	
	public static final String  CANCELORDER ="CancelOrder";
	
	public static final String  RETURNRESERVE ="ReturnReservedOrder";
	
	public static final String  SHIPPEDBYITEM ="UpdateShippedOrderByItemID";
	public static final String  SHIPPEDBYUPC ="UpdateShippedOrderByUpc";
    public static final String SHIPPEDORDER = "UpdateShippedOrder";

	public static final String  SUBSTITUTEBYITEM ="SubstituteByItem";
	public static final String  SUBSTITUTEBYUPC ="SubstituteByUpc";
	
	public static final String  BACKORDERBYITEM ="UpdateBackOrderByItem";
	public static final String  BACKORDERBYUPC ="UpdateBackOrderByUpc";
	
	public static final String  RETURNORDER ="ReturnOrder";

	//****ERROR MESSAGE****//
	
	public static final String  ERR_STOREID_MISSING ="Store ID is missing in the request";
	
	public static final String  ERR_ITEMIDS_MISSING ="Item ID is missing in the request";
	
	public static final String  ERR_PRODUCTIDS_MISSING ="Product ID is missing in the request";
	
	public static final String  ERR_UPCS_MISSING ="UPC is missing in the request";
	
	public static final String  ERR_JSON_INPUT_MISSING = "JSON input is missing in the request";
	
	public static final String  ERR_CHANNEL_MISSING ="Channel is missing in the request";
	
	public static final String  ERR_ITEMIDS_NOT_EXIST ="Given Item IDs do not exist";
	
	public static final String  ERR_PRODUCTIDS_NOT_EXIST ="Given Product IDs do not exist";
	
	public static final String  ERR_STOREID_NOT_EXIST ="Given Store ID does not exist";
	
	public static final String  ERR_UPCS_NOT_EXIST ="Given UPCs do not exist";
	
	public static final String  ERR_ORDERID_MISSING ="Order ID is missing in the request";
	
	public static final String  ERR_ITEM_DTLS_MISSING ="Inventory details are missing in the request";
	
	public static final String  ERR_PDT_NO_ATS ="Product % do not have requested quantity available for the requested inventory type";
	
	public static final String  ERR_INV_NOT_EXIST ="Requested inventory does not exist";
	
	public static final String  ERR_PRODUCTID_NOT_EXIST ="Product ID % do not exist";
	
	public static final String  ERR_STORE_ID_NOT_EXIST ="Store ID % do not exist";
	
	public static final String  ERR_ORDERID_INVALID ="Order ID is invalid";
	
	public static final String  ERR_ITEM_DTLS_MISSING_PDT ="Inventory details are missing in the request for product ID %";
	
	public static final String  ERR_ORDER_PLACED ="The order is already placed";
	
	public static final String  ERR_ORDER_RETURNED ="The order is already returned";
	
	public static final String  ERR_ORDER_NOT_PLACED ="The order is not confirmed";
	
	public static final String  ERR_ITEM_INVALID_QTY ="Requested inventory quantity is invalid";
	
	public static final String  ERR_CHANNEL_MISMATCH ="The request channel doesnot match with the reserved channel";
	
	public static final String  ERR_CHANNEL_NOT_VALID ="% is not a valid channel";
	
	public static final String  ERR_INV_TYPE_NOT_VALID ="% is not a valid inventory type";
	
	public static final String  ERR_ITEM_DTLS_MISSING_ITEM ="Inventory details are missing in the request for item ID %";
	
	public static final String  ERR_ITEM_DTLS_MISSING_UPC ="Inventory details are missing in the request for UPC %";
	
	public static final String  ERR_ITEMID_NOT_EXIST ="Item ID % do not exist";
	
	public static final String  ERR_UPC_NOT_EXIST ="UPC % do not exist";
	
	public static final String  ERR_ITEM_NO_ATS ="Item ID % do not have requested quantity available for the requested inventory type";
	
	public static final String  ERR_UPC_NO_ATS ="UPC % do not have requested quantity available for the requested inventory type";
	
	public static final String  ERR_ORDER_CANCELLED ="The order for item ID % is already cancelled";
	
	public static final String  ERR_SHIP_GRP_DTLS_MISSING ="Shipping group details are missing in the request";
	
	public static final String  ERR_SHIP_GRP_MISSING ="Shipping group ID is missing in the request";
	
	public static final String  ERR_ORDERID_SHIP_GRP_INVALID ="Order ID or Ship Group ID is invalid";
	
	public static final String  ERR_ITEM_DTLS_MISSING_SHIPGRP ="Inventory details are missing in the request for Ship Group ID %";
	
	public static final String  ERR_NOT_VALID_CANCEL_ORDER ="This order is not valid to cancel";
	
	public static final String  ERR_NEW_INV_NOT_VALID ="Requested new inventory details not valid for Ship Group ID %";
	
	public static final String  ERR_OLD_INV_NOT_VALID ="Requested old inventory details not valid for Ship Group ID %";
	
	public static final String  ERR_INV_NOT_VALID ="Requested inventory details not valid for Ship Group ID %";
	
	public static final String  ERR_INV_NOT_VALID_NEW ="Requested inventory details not valid";
	
	public static final String  ERR_INV_NOT_VALID_RETURN ="Requested item ID % is not valid to be returned";
	
	
	//****RESPONSE MESSAGE****//
	
	public static final String INFO_NO_DATA = "No Data Found";
	
	//****ORDER STATUS****//
	
	public static final String RESERVED = "Reserved";
	
	public static final String RESERVE_RETURNED = "Reserve_Returned";
	
	public static final String ORDERED = "Ordered";
	
	public static final String CANCELLED = "Cancelled";
	
	public static final String SHIPPED = "Shipped";
	
	public static final String SUBSTITUTED = "Substituted";
	
	public static final String RETURNED = "Returned";
	
	public static final Integer RESERVED_ID = 1;
	
	public static final Integer ORDERED_ID = 2;
	
	public static final Integer RESERVE_RETURNED_ID = 3;
	
	public static final Integer BACK_ORDERED_ID = 4;
	
	public static final Integer SUBSTITUTED_ID = 5;
	
	public static final Integer CANCELLED_ID = 6;
	
	public static final Integer SHIPPED_ID = 7;
	
	public static final Integer RETURNED_ID = 8;
	
	//****ORDER TYPE****//
	
	public static final Integer PARENT = 0;
	public static final Integer SHORT = 1;
	
	//****QUERIES****//
	
	public static final String CACHE_WARMER_QRY = "select itemId,storeId,inventoryType from Inventory";
	
	public static final String UPC_ITEM_CACHE_WARMER_QRY ="from UpcItemCache";
	
	public static final String PRODUCT_ITEM_CACHE_WARMER_QRY ="from ProductItemCache";
	

	//****IMS LOADER****//
	
	public static final String  FEEDBATCHJOB ="feedbatchjob";
	
	public static final String  PROCESSED ="processed";
	
	public static final String  COMPLETED ="completed";
	
	public static final String  IN ="in";
	
	public static final String  ERROR ="error";
	
	public static final String  ERRORFILE ="errorfile.csv";
	
	public static final String  FEEDBATCHJOBS ="feedbatchjob";
		
	public static final String  ERR_NEW_ITEM_LIST_MISSING ="New Item List is Missing in the Back Order Request";


	
	
}
