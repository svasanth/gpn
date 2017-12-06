/**
 * Copyright 2017 Ravi Kumar Annepu. An unpublished and CONFIDENTIAL work. Reproduction, adaptation, or translation without prior written permission is prohibited except as
 * allowed under the copyright laws.
 */

package com.gpn.util;

/**
 * The <code>GpnConstant</code> class is to maintain all the constants used in REST API of Gopal Nagar Colony.
 * 
 * @author Ravi Kumar Annepu
 * @version 1.0
 * @since V1.0
 * @created November, 2017.
 */
public class GpnConstant {

	public static final String DIAGNOSTIC_ID = "diagnosticId";

	public static final String EMPTY = "";

	public static final String METHOD_STARTED = "Method Started.";

	public static final String METHOD_ENDED = "Method Ended.";

	public static final String HIPHEN = "-";

	public static final String UNDER_SCORE = "_";

	public static final String NO_DATA_FOUND = "No Data Fount.";

	public static final long NOTIFICATION_ACTIVATION = 1L;

	public static final long NOTIFICATION_PASSWORD = 2L;

	public static final String UTF_8 = "UTF-8";

	public static final String AUTHENTICATION_ERROR = "Unauthorized Access.";

	public static final String VALIDATION_ERROR = "Validation Error : ";

	public static final String VALIDATION_MISSING_ERROR = "Your request cannot be processed because of the following missing field(s) : ";

	public static final String NOTHING_TO_UPDATE = "Nothing to update.";

	public static final String PERFORMED_UNAUTHORIZED_OPERATION = "'{}' performed unauthorized operation.";

	public static final String ACTIVATION_EMAIL_FROM = "noreply@supporthand.in";

	public static final String SUCCESS = "Success";

	public static final String RESOURCE_NOT_FOUND = "Resource Not Found.";

	public static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0abcdefghijklmnopqrstuvwxyz123456789";

	public static final String MAIL_HEADER = "gpn-email";

	public static final String TOKEN_HEADER = "gpn-token";

	public static final String GENDER_MALE = "M";

	public static final String GENDER_FEMALE = "F";

	public static final String DATE_FORMAT = "yyyy-MM-dd";

	public static final String SPACE = " ";

	public static final String REPORT_PDF = ".pdf";

	public static final String SELF = "Self";

	public static final String DISK_FILE = "Disk";

	public static final String DOWNLOAD_FILE = "Download";

	public static final String REPORTS_FOLDER = "report";

	public static final String FILE_SEPERATOR = "/";

	public static final String TESTID = "testid";

	public static final String ID = "id";

	public static final String STATUS = "status";

	public static final String PID = "pid";

	public static final String DOT = ".";

	public static final String NA = "NA";

	public static final String NAME = "name";

	public static final String DESCRIPTION = "description";

	public static final String NORM_VALUE = "normValues";

	public static final String EMAIL = "email";

	public static final String MOBILE = "mobile";

	public static final String GENDER = "gender";

	public static final String LAB = "lab";

	public static final String DEFAULT_0 = "0";

	public static final String NO_ALL_COMPONENTS = "Not all Test Components are provided to update with results.";

	public static final String INVALID_EMAIL = "Invalid Email.";

	public static final String INVALID_MOBILE_LENGTH = "Mobile number must be exactly 10 digits.";

	public static final String INVALID_MOBILE = "Invalid Mobile Number. Only numbers [0-9] are allowed.";

	public static final String INVALID_GENDER = "Invalid gender. Must be M (Male) or F (Female).";

	public static final String INVALID_STATUS = "Invalid status code. Must be 1001 (Active) or 1002 (Inactive).";

	public static final String INVALID_NAME = "Invalid %s. Only [a-z-A-Z], dot (.), underscore(_) and spaces are allowed.";

	public static final String NAME_PATTERN = "[a-z-A-Z ._]*";

	public static final String MOBILE_PATTERN = "[0-9]*";

	public static final String GENDER_PATTERN = "M|F";

	public static final String LEAVE_BLANK = " Leave blank if the component is for both Male and Female";

	public static final String INVALID_NAME_LENGTH = "%s length must be between 1 and 64.";

	public static final String ALREADY_EXISTS = "%s already exists with '%s'.";

	public static final String USER = "User";

	public static final String TEST_COMPONENT_NAME = "Test Component Name";

	public static final String INVALID_COMPONENT = "Invalid Test Component";

	public static final String INVALID_AGE = "Invalid age. Must be between 1 to 99.";

	public static final String FIRSTNAME = "firstName";

	public static final String LASTNAME = "lastName";

	public static final String WEB_SITE = "http://gpn.com";

	public static final String INVALID_LENGTH = "%s has exceeded its max limit of %d.";

	// Holds all Error Codes
	public static final class GpnErrorCode {

		public static final int RESOURCE_LAYER = 100;

		public static final int BUSINESS_LAYER = 200;

		public static final int AUTH_LAYER = 400;

		public static final int MASTER = 1;

	}

	// Holds all Roles
	public static final class GpnRole {

		public static final long SUPER_ADMIN = 1001L;

		public static final long ADMIN = 1002L;

		public static final long STAFF = 1003L;

		public static final long PATIENT = 1004L;

		public static final long USER = 1005L;
	}

	// Holds all Medical Lab Reporting System Statuses
	public static final class GpnStatus {

		public static final long ACTIVE_CODE = 1001L;

		public static final String ACTIVE = "Active";

		public static final long INACTIVE_CODE = 1002L;

		public static final String INACTIVE = "Inactive";

		public static final long IN_PROGRESS_CODE = 1003L;

		public static final String IN_PROGRESS = "In Progress";

		public static final long COMPLETED_CODE = 1004L;

		public static final String COMPLETED = "Completed";

	}

	public static final int MAX_LENGTH_512 = 512;

	public static final int MAX_LENGTH_256 = 256;

	public static final int MAX_LENGTH_128 = 128;

	public static final int MAX_LENGTH_64 = 64;

	public static final int MAX_LENGTH_16 = 16;

	public static final int MAX_LENGTH_10 = 10;

	public static final String GST_ERROR = "Either IGST or (CGST and SGST) must be provided.";

	public static final String FOUND_DUPLICATES = "Found duplicate test components.";

	public static final String RESULT = "result";

	public static final String LABNAME = "lab name";

	public static final String ADDRESS = "address";

	public static final String TELEPHONE = "telephone";

	public static final String PASSWORD = "password";

	public static final String ROLE = "role";

	public static final String[] COMMON_PATHS = { "signin", "activate", "forgotpassword" };

	public static final String[] STAFF_RESTRICTED_PATHS = { "staff", "statistics" };

}
