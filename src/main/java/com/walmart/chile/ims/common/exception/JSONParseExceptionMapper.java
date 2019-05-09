package com.walmart.chile.ims.common.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.JsonParseException;

@Provider
public class JSONParseExceptionMapper implements
		ExceptionMapper<JsonParseException> {
	
	
	@Override
	public Response toResponse(final JsonParseException jpe) {
		// Create and return an appropriate response here
		
		return Response.status(Status.BAD_REQUEST)
				.entity("Invalid data supplied for request").type(MediaType.APPLICATION_JSON).build();
	}
	
}