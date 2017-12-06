/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.data.vo.exception;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <code>ExceptionResponse</code> The POJO class which holds Exception Response data in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GpnException")
@XmlType(propOrder = { "id", "code", "message" })
public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "code")
	private String code;

	@XmlElement(name = "message")
	private String message;

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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *             the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *             the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("GpnException: [");
		sb.append("id=").append(id).append(", ");
		sb.append("code=").append(code).append(", ");
		sb.append("message=").append(message);
		sb.append("]");
		return sb.toString();
	}

}