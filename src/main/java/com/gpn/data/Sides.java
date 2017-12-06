/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.data;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <code>Sides</code> The POJO class which holds the Road Side list data in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@XmlRootElement(name = "Sides")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sides implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@XmlElement(name = "Side")
	private Set<SideEntity> sides;

	/**
	 * @return the sides
	 */
	public Set<SideEntity> getSides() {
		return sides;
	}

	/**
	 * @param sides
	 *             the sides to set
	 */
	public void setSides(Set<SideEntity> sides) {
		this.sides = sides;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sides [sides=");
		builder.append(sides);
		builder.append("]");
		return builder.toString();
	}

}