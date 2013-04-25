package edu.umn.msse.busbuddy.tracking;

/**
 * The Alert Factory handles the creation of a user alert.  
 * The necessary values for an alert will be entered by a registered user from the BusBuddy User Interface.  See {@link UserTrackingAlertObject} for input parameter details.
 * Post Condition: New user alert registered with a transit vehicle in the array list.
 *
 */
public class TrackingAlertFactory {

	/***
	 * Create an alert for a registered user.  The factory determines what type of an alert to create based on user inputs.
	 * @param vehicle - TransitVehicle a registered vehicle to add this alert.
	 * @return TrackingAlertObserver new alert or null if no matching vehicle is currently registered on the requested route.
	 */
	public TrackingAlertObserver createAlertObserver(TransitVehicle vehicle) {
		
		/**
		 * 1. Determine what type of tracking alert observer to create
		 */		
		TrackingAlertObserver alert =  new TrackingLocationAlert(vehicle);
		
		/**
		 * 2. Determine what rules are needed and add an Alert Specification to this alert.  
		 *    Configuration for alert logic will be obtained based on a configuration file.
		 */
		alert.setSpec(new AlertRangeLogic());
		
		return alert;
		
	}
}
