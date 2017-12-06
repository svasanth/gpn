/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.bo;

import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gpn.dao.SideEntityDao;
import com.gpn.data.SideEntity;
import com.gpn.data.Sides;
import com.gpn.exception.GpnBusinessException;
import com.gpn.util.GpnConstant;

/**
 * The <code>SideBoImpl</code> is an implementation of {@link SideBo} interface and has the business logic for the data related to the Side Entity for REST API of Gopal Nagar Society.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Component
public class SideBoImpl implements SideBo {

	private static final Logger LOG = LoggerFactory.getLogger(SideBoImpl.class);

	@Autowired
	private SideEntityDao sideEntityDao;

	@Override
	public Sides getSides() throws GpnBusinessException {
		LOG.info(GpnConstant.METHOD_STARTED);
		Sides sides = new Sides();
		Set<SideEntity> sideEntity = sideEntityDao.findAll();
		if (CollectionUtils.isNotEmpty(sideEntity)) {
			sides.setSides(sideEntity);
		}
		LOG.info(GpnConstant.METHOD_ENDED);
		return sides;
	}

}
