package edu.umn.msse.busbuddy.tracking;
/** 
 * Tracking Alert Observer implements the abstract tracking alert observer and 
 * provides the method to actually send an alert to a registered user that their bus is approaching their stop.
 */
public class TrackingDelayAlert extends TrackingAlertObserver {

	/**
	 * Receives the notification indicating that a vehicle is in the alert range.
	 * Use the AlertService to contact the registered user.
	 */
	public void updateAlert() {

	}

}
