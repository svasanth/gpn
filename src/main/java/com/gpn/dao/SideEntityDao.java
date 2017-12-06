/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.gpn.data.SideEntity;

/**
 * The <code>SideEntityDao</code> is an interface to maintain all supported methods on database layer for Side Entity in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
public interface SideEntityDao extends CrudRepository<SideEntity, Long> {

	Set<SideEntity> findAll();

}
