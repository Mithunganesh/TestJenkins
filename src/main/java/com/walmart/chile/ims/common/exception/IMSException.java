package com.walmart.chile.ims.common.exception;

import java.io.Serializable;


public class IMSException extends Exception implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int errorCode;
	private final String errorMessage;
	private String param;
	
	public String getParam() {
		return param;
	}
	
	/*public void setParam(String param) {
		this.param = param;
	}*/
	
	public IMSException(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public IMSException(int errorCode, String errorMessage, String optionalParam) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.param=optionalParam;
	}
	
	public IMSException(IMSException e) {
		this.errorCode = e.errorCode;
		this.errorMessage = e.errorMessage;
		this.param = e.param;
	}

	public int getErrorCode() {
		return errorCode;
	}
	/*public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}*/
	public String getErrorMessage() {
		return errorMessage;
	}
	/*public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	} */
	
}
