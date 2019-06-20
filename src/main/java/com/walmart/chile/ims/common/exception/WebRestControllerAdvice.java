package com.walmart.chile.ims.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebRestControllerAdvice {
  
  @ExceptionHandler(IMSException.class)
  public ResponseEntity<IMSResponse> handleNotFoundException(IMSException ex) {
	  IMSResponse responseMsg = new IMSResponse();
	  responseMsg.setErrorCode(ex.getErrorCode()+"");
	  responseMsg.setMessage(ex.getErrorMessage());
	  responseMsg.setStatus(ex.getErrorCode()+"");
	  return new ResponseEntity<IMSResponse>(responseMsg, HttpStatus.BAD_REQUEST);
  }
}
