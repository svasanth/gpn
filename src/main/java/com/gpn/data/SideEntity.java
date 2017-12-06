/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.data;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * <code>SideEntity</code> The POJO entity class which holds the Road Side data in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Side")
@XmlType(propOrder = { "id", "name", "roads" })
@JsonInclude(Include.NON_NULL)
@Entity
@Table(name = "gpn_side")
public class SideEntity implements Gpn, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@XmlElement(name = "id")
	@Column(name = "side_id")
	private long id = 0L;

	@XmlElement(name = "name")
	@Column(name = "side_name")
	private String name = null;

	@OneToMany(mappedBy = "side", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@XmlElement(name = "Road")
	@OrderBy("id ASC")
	private Set<RoadEntity> roads;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *             the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return getStr(name);
	}

	/**
	 * @param name
	 *             the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the roads
	 */
	public Set<RoadEntity> getRoads() {
		return roads;
	}

	/**
	 * @param roads
	 *             the roads to set
	 */
	public void setRoads(Set<RoadEntity> roads) {
		this.roads = roads;
	}

	public SideEntity() {
		super();
	}

	public SideEntity(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public SideEntity(long id, String name, Set<RoadEntity> roads) {
		super();
		this.id = id;
		this.name = name;
		this.roads = roads;
	}

}