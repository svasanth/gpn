/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.gpn.exception.GpnValidationException;

/**
 * The <code>GpnUtil</code> class is an utility class to maintain all the utility codes used in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
public class GpnUtil {

	public static String getStatus(long code) {
		String status = GpnConstant.GpnStatus.INACTIVE;
		if (code == GpnConstant.GpnStatus.ACTIVE_CODE) {
			status = GpnConstant.GpnStatus.ACTIVE;
		} else if (code == GpnConstant.GpnStatus.IN_PROGRESS_CODE) {
			status = GpnConstant.GpnStatus.IN_PROGRESS;
		} else if (code == GpnConstant.GpnStatus.COMPLETED_CODE) {
			status = GpnConstant.GpnStatus.COMPLETED;
		}
		return status;
	}

	public static long getStatusCode(String status) {
		switch (status) {
		case GpnConstant.GpnStatus.ACTIVE:
			return GpnConstant.GpnStatus.ACTIVE_CODE;
		case GpnConstant.GpnStatus.IN_PROGRESS:
			return GpnConstant.GpnStatus.IN_PROGRESS_CODE;
		case GpnConstant.GpnStatus.COMPLETED:
			return GpnConstant.GpnStatus.COMPLETED_CODE;
		default:
			return GpnConstant.GpnStatus.INACTIVE_CODE;
		}
	}

	public static String getDateAsString(Date date) {
		DateFormat fmt = new SimpleDateFormat(GpnConstant.DATE_FORMAT);
		return fmt.format(date).toUpperCase();
	}

	public static Date getCurrentMonthStartDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static Date getCurrentMonthEndDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}

	public static Date getCurrentWeekStartDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static Date getCurrentWeekLastDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, cal.getActualMaximum(Calendar.DAY_OF_WEEK));
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}

	public static Date getCurrentDayStartTime() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static Date getCurrentDayEndTime() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}

	public static String getLikePattern(String str) {
		return "%" + str.trim().replaceAll(" ", "%") + "%";
	}

	public static void rejectIfExceedsMaxLength(String name, String value, int maxLength, int errorCode) throws GpnValidationException {
		if (StringUtils.isNotEmpty(value) && value.trim().length() > maxLength) {
			throw new GpnValidationException(errorCode + GpnConstant.HIPHEN + GpnConstant.GpnErrorCode.RESOURCE_LAYER, GpnConstant.VALIDATION_ERROR + String.format(GpnConstant.INVALID_LENGTH, name, maxLength));
		}
	}

}