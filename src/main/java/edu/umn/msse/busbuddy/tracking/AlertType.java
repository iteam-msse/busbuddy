package edu.umn.msse.busbuddy.tracking;
/**
 * Enumeration of the alert types recognized by bus buddy.
 * Bus Buddy can then use a configuration file to tie the alert type to the {@link AlertSpecification} 
 * to determine the logic necessary to determine if users registered to a vehicle should be sent alerts.
 *
 */
public enum AlertType {

	LOCATION, DELAY

}
