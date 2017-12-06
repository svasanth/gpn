package com.gpn.dao;

import com.gpn.data.ExecCommitteeEntity;
import com.gpn.data.SideEntity;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * The <code>ExecCommitteeDao</code> is an interface to maintain all supported methods on database layer for Side Entity in REST API of Gopal Nagar.
 * 
 * @author Sydubabu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
public interface ExecCommitteeDao extends CrudRepository<ExecCommitteeEntity, Long> {

	Set<ExecCommitteeEntity> findAll();

}
