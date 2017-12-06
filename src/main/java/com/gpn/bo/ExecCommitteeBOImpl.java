/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.bo;

import com.gpn.dao.ExecCommitteeDao;
import com.gpn.data.ExecCommitteeEntity;
import com.gpn.data.Sides;
import com.gpn.exception.GpnBusinessException;
import com.gpn.util.GpnConstant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * The <code>ExecCommitteeBOImpl</code> is an implementation of {@link SideBo} interface and has the business logic for the data related to the Side Entity for REST API of Gopal Nagar.
 * 
 * @author Sydubabu Vasantha
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Component
public class ExecCommitteeBOImpl implements ExecCommitteeBO {

	private static final Logger LOG = LoggerFactory.getLogger(ExecCommitteeBOImpl.class);

	@Autowired
	private ExecCommitteeDao execCommitteeDao;

	@Override
	public Set<ExecCommitteeEntity> getExecCommittee() throws GpnBusinessException {
		LOG.info(GpnConstant.METHOD_STARTED);
		Set<ExecCommitteeEntity> execCommitteeEntities = execCommitteeDao.findAll();
		LOG.info(GpnConstant.METHOD_ENDED);
		return execCommitteeEntities;
	}

}
