package edu.umn.msse.busbuddy.alert.enums;

/**
 * Represents the status of an alert depending upon its state in its life cycle.
 * 
 * 
 */
public enum AlertStatus {

	/**
	 * Represents an alert that is active and is ready to be run when time
	 * comes.
	 */
	Active,

	/**
	 * Represents an alert that is in dormant state and wont run even if its
	 * time parameter is valid. Usually alert canbe in this status if it is
	 * paused.
	 */
	Deactive,

	/**
	 * Represents an alert that is in running state.
	 */
	Running,

	/**
	 * Represents an alert that is expired. This type of alert are deleted
	 * periodically.
	 */
	Expired,

	/**
	 * Represents an alert that is in error state due to technical difficulties.
	 * This alert will be run 3 times before it is permanently paused until
	 * further action from user or admin.
	 */
	Error
}
