/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.exception;

/**
 * <code>GpnValidationException</code> is the Validation Exception class for REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
public class GpnValidationException extends GpnException {

	private static final long serialVersionUID = 1L;

	public GpnValidationException(String code, String message) {
		super(code, message);
	}

	public GpnValidationException(String message, Exception cause) {
		super(message, cause);
	}

	public GpnValidationException(String code, String message, Exception cause) {
		super(code, message, cause);
	}

}