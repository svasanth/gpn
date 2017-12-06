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
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * <code>ApartmentEntity</code> The POJO entity class which holds the Apartment entity data in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@Entity
@Table(name = "gpn_apartment")
@XmlRootElement(name = "Apartment")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "id", "name", "flats" })
@JsonInclude(Include.NON_NULL)
public class ApartmentEntity implements Gpn, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@XmlElement(name = "id")
	@Column(name = "apartment_id")
	private long id = 0L;

	@XmlElement(name = "name")
	@Column(name = "apartment_name")
	private String name = null;

	@XmlElement(name = "imageUrl")
	@Column(name = "image_url")
	private String imageUrl = null;

	@OneToMany(mappedBy = "apartment", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@XmlElement(name = "Flat")
	@OrderBy("id ASC")
	@JsonManagedReference
	private Set<FlatEntity> flats;

	@ManyToOne
	@JoinColumn(name = "road_id")
	@JsonBackReference
	private RoadEntity road;

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
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl
	 *             the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the flats
	 */
	public Set<FlatEntity> getFlats() {
		return flats;
	}

	/**
	 * @param flats
	 *             the flats to set
	 */
	public void setFlats(Set<FlatEntity> flats) {
		this.flats = flats;
	}

	/**
	 * @return the road
	 */
	public RoadEntity getRoad() {
		return road;
	}

	/**
	 * @param road
	 *             the road to set
	 */
	public void setRoad(RoadEntity road) {
		this.road = road;
	}

	public ApartmentEntity() {
		super();
	}

	public ApartmentEntity(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ApartmentEntity(long id, String name, Set<FlatEntity> flats) {
		super();
		this.id = id;
		this.name = name;
		this.flats = flats;
	}

}