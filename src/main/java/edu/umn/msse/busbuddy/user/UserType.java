package edu.umn.msse.busbuddy.user;

/**
 * This is an enumeration of the different statuses that a user can be assigned.
 */
public enum UserType {
	/**
	 * This is a standard user.
	 */
	NORMAL_USER,
	
	/**
	 * This is a system administrator, who can read and write to other users' data.
	 */
	SYSTEM_ADMINISTRATOR,
	
	/**
	 * A user account marked as suspended cannot create or use sessions.
	 */
	SUSPENDED_USER,
	
	/**
	 * A deleted user account cannot create or use sessions.
	 */
	DELETED_USER;
}
