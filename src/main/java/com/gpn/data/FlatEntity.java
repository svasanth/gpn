/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * <code>FlatEntity</code> The POJO entity class which holds the Flat entity data in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Entity
@Table(name = "gpn_flat")
@XmlRootElement(name = "Flat")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "id", "name" })
@JsonInclude(Include.NON_NULL)
public class FlatEntity implements Gpn, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@XmlElement(name = "id")
	@Column(name = "flat_id")
	private long id = 0L;

	@XmlElement(name = "name")
	@Column(name = "flat_name")
	private String name = null;

	@ManyToOne
	@JoinColumn(name = "apartment_id")
	@JsonBackReference
	private ApartmentEntity apartment;

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
	 * @return the apartment
	 */
	public ApartmentEntity getApartment() {
		return apartment;
	}

	/**
	 * @param apartment
	 *             the apartment to set
	 */
	public void setApartment(ApartmentEntity apartment) {
		this.apartment = apartment;
	}

	public FlatEntity() {
		super();
	}

	public FlatEntity(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}