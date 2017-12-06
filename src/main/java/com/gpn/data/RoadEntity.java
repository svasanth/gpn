/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * <code>RoadEntity</code> The POJO entity class which holds the Road entity data in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Entity
@Table(name = "gpn_road")
@XmlRootElement(name = "Road")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "id", "name", "apartments" })
@JsonInclude(Include.NON_NULL)
public class RoadEntity implements Gpn, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@XmlElement(name = "id")
	@Column(name = "road_id")
	private long id = 0L;

	@XmlElement(name = "name")
	@Column(name = "road_name")
	private String name = null;

	@OneToMany(mappedBy = "road", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@XmlElement(name = "Apartment")
	@OrderBy("id ASC")
	@JsonManagedReference
	private Set<ApartmentEntity> apartments;

	@ManyToOne
	@JoinColumn(name = "side_id")
	@JsonBackReference
	private SideEntity side;

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
	 * @return the apartments
	 */

	public Set<ApartmentEntity> getApartments() {
		return apartments;
	}

	/**
	 * @param apartments
	 *             the apartments to set
	 */
	public void setApartments(Set<ApartmentEntity> apartments) {
		this.apartments = apartments;
	}

	/**
	 * @return the side
	 */
	public SideEntity getSide() {
		return side;
	}

	/**
	 * @param side
	 *             the side to set
	 */
	public void setSide(SideEntity side) {
		this.side = side;
	}

	public RoadEntity() {
		super();
	}

	public RoadEntity(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public RoadEntity(long id, String name, List<ApartmentEntity> apraments) {
		super();
		this.id = id;
		this.name = name;
		// this.apartments = apraments;
	}

}