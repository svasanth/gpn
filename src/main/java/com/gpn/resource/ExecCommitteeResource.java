/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.resource;

import com.gpn.bo.ExecCommitteeBO;
import com.gpn.exception.GpnBusinessException;
import com.gpn.exception.GpnException;
import com.gpn.exception.GpnResourceException;
import com.gpn.util.GpnConstant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * The <code>GpnResource</code> class accepts all requests in both XML and JSON formats for REST API of Gopan Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Component
@Path("/exec-committee")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class ExecCommitteeResource {

	private static final Logger LOG = LoggerFactory.getLogger(ExecCommitteeResource.class);

	@Autowired
	private ExecCommitteeBO execCommitteeBO;

	@GET
	@PermitAll
	public Response getExecCommittee(@Context HttpHeaders headers) throws GpnException {
		try {
			LOG.info(GpnConstant.METHOD_STARTED);
			Response.ResponseBuilder rb = Response.status(Status.OK).entity(execCommitteeBO.getExecCommittee());
			LOG.info(GpnConstant.METHOD_ENDED);
			return rb.build();
		} catch (GpnBusinessException e) {
			throw e;

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			throw new GpnResourceException(GpnConstant.GpnErrorCode.MASTER + GpnConstant.HIPHEN + GpnConstant.GpnErrorCode.RESOURCE_LAYER, e.getMessage(), e);
		}
	}

}
