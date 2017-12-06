/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.bo;

import org.springframework.stereotype.Component;

import com.gpn.data.Sides;
import com.gpn.exception.GpnBusinessException;

/**
 * The <code>SideBo</code> is an interface to maintain all supported methods on business layer for Side Entity in REST API of Gopal Nagar Society.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Component
public interface SideBo {

	Sides getSides() throws GpnBusinessException;

}
