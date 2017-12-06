/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.bo;

import com.gpn.data.ExecCommitteeEntity;
import com.gpn.exception.GpnBusinessException;

import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * The <code>ExecCommitteeBO</code> is an interface to maintain all supported methods on business layer for Side Entity in REST API of Gopal Nagar.
 * 
 * @author Sydubabu Vasantha
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Component
public interface ExecCommitteeBO {

	Set<ExecCommitteeEntity> getExecCommittee() throws GpnBusinessException;

}
