/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.exception;

import javax.ws.rs.WebApplicationException;

/**
 * <code>GpnException</code> is the Exception class for REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
public abstract class GpnException extends WebApplicationException {

	private static final long serialVersionUID = 1L;

	private String code;

	private String message;

	private Exception cause;

	private String errorDetails;

	public GpnException(String code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}

	public GpnException(String message, Exception cause) {
		super(message, cause);
		this.message = message;
		this.cause = cause;
	}

	public GpnException(String code, String message, Exception cause) {
		super(message, cause);
		this.code = code;
		this.message = message;
		this.cause = cause;
	}

	public Exception getCause() {
		return this.cause;
	}

	public String getCode() {
		return this.code;
	}

	public String getMessage() {
		String message = this.message;
		if ((message == null || message.trim().equals("")) && cause != null) {
			message = cause.getMessage();
		}
		return message;
	}

	public String getErrorDetails() {
		if (this.cause != null) {
			this.errorDetails = this.cause.getLocalizedMessage();
		}
		return errorDetails;
	}

}