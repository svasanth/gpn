/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.exception;

/**
 * <code>GpnNotificationException</code> is the Notification Exception class for REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
public class GpnNotificationException extends GpnException {

	private static final long serialVersionUID = 1L;

	public GpnNotificationException(String code, String message) {
		super(code, message);
	}

	public GpnNotificationException(String message, Exception cause) {
		super(message, cause);
	}

	public GpnNotificationException(String code, String message, Exception cause) {
		super(code, message, cause);
	}

}