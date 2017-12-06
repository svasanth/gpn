/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn;

import com.gpn.exception.GpnExceptionMapper;
import com.gpn.filter.CorsFilter;
import com.gpn.resource.ExecCommitteeResource;
import com.gpn.resource.GpnResource;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

/**
 * The <code>GpnJerseyConfig</code> is an extension to {@link ResourceConfig} to configure GpnApplication's REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Component
public class GpnJerseyConfig extends ResourceConfig {

	public GpnJerseyConfig() {
		register(CorsFilter.class);
		register(GpnResource.class);
		register(ExecCommitteeResource.class);
		register(GpnExceptionMapper.class);
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

	}

}