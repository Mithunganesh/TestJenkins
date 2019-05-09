package com.walmart.chile.ims.common.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class IMSExceptionMapper implements
ExceptionMapper<IMSException>  {

	@Override
	public Response toResponse(IMSException exception) {
		IMSResponse res=new IMSResponse();
		res.setErrorCode(String.valueOf(exception.getErrorCode()));
		res.setStatus(String.valueOf(exception.getErrorCode()));
		if(exception.getParam() != null){
			res.setMessage(exception.getErrorMessage().replaceAll("%", exception.getParam()));
		}else{
			res.setMessage(exception.getErrorMessage());
		}
		return Response.status(exception.getErrorCode()).entity(res).type(MediaType.APPLICATION_JSON).build();
		
	}

}
