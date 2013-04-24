package edu.umn.msse.busbuddy.alert.enums;

/**
 * Notification type of alert,
 */
public enum AlertNotificationType {

	/**
	 * A planned alert that is to be run in the future. Usually this is provided
	 * by Transit Module when the bus route is going to be changed in near
	 * future.
	 */
	PlannedDisruption,

	/**
	 * A sudden change in route or plan can trigger this alert. Usually this
	 * type of alert is executed right away. This type of alert is provided by
	 * either Transit or Tracking module.
	 */
	UnplannedDisruption,

	/**
	 * A general type of alert where a user is to be notified of their schedule
	 * in a timely fashion. Generally, user module creates this type of alert.
	 */
	ScheduleInformation
}
