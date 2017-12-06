/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.exception;

import java.util.UUID;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import com.gpn.data.vo.exception.ExceptionResponse;
import com.gpn.util.GpnConstant;

/**
 * <code>GpnExceptionMapper </code> The {@link ExceptionMapper} implementation to handle {@link GpnException} in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Provider
@Component
public class GpnExceptionMapper implements ExceptionMapper<GpnException> {

	private static final Logger LOG = LoggerFactory.getLogger(GpnExceptionMapper.class);

	@Override
	public Response toResponse(GpnException exception) {
		Response.ResponseBuilder rb = null;
		ExceptionResponse errorResponse = new ExceptionResponse();
		if (exception != null) {
			if (MDC.get(GpnConstant.DIAGNOSTIC_ID) == null) {
				MDC.put(GpnConstant.DIAGNOSTIC_ID, UUID.randomUUID().toString());
			}
			errorResponse.setId(MDC.get(GpnConstant.DIAGNOSTIC_ID));
			errorResponse.setCode(exception.getCode());
			errorResponse.setMessage(exception.getMessage());
		}
		LOG.error("ExceptionResponse : " + errorResponse);
		if (exception instanceof GpnResourceException || exception instanceof GpnBusinessException || exception instanceof GpnDatabaseException) {
			rb = Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorResponse);
		} else if (exception instanceof GpnNoDataFoundException) {
			rb = Response.status(Status.NO_CONTENT).entity(errorResponse);
		} else if (exception instanceof GpnResourceNotFoundException) {
			rb = Response.status(Status.NOT_FOUND).entity(errorResponse);
		} else if (exception instanceof GpnAuthenticationException) {
			rb = Response.status(Status.UNAUTHORIZED).entity(errorResponse);
		} else if (exception instanceof GpnDuplicateException) {
			rb = Response.status(Status.CONFLICT).entity(errorResponse);
		} else {
			rb = Response.status(Status.BAD_REQUEST).entity(errorResponse);
		}
		return rb.build();
	}

}