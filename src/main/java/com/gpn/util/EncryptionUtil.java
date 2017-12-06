/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <code>EncryptionUtil</code> class is a common utility class for encryption related functions in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
public class EncryptionUtil {

	/**
	 * This static method encrypt the given {@link String}
	 * 
	 * @param data
	 *             {@link String}
	 * @return encrypted {link String}
	 * @throws NoSuchAlgorithmException
	 */
	public static String encrypt(String data) throws NoSuchAlgorithmException {
		if (data == null) {
			return null;
		}
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(data.getBytes());
		byte byteData[] = md.digest();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString().toUpperCase();
	}

	public static void main(String args[]) throws NoSuchAlgorithmException {
		System.out.println(EncryptionUtil.encrypt("P@ssw0rd"));
	}

}