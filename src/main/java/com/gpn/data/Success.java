/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * <code>Success</code> The POJO class which holds the success details in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Success")
@XmlType(propOrder = { "status", "id" })
@JsonInclude(Include.NON_NULL)
public class Success implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "status")
	private String status;

	public Success() {

	}

	public Success(String status) {
		this.status = status;
	}

	public Success(String id, String status) {
		this.id = id;
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *             the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *             the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
