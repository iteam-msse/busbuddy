package edu.umn.msse.busbuddy.tracking;

/**
 * Alert Range Logic implements the business logic to determine if a vehicle is within a range where an alert needs to be sent to a user who has registered for tracking alerts.
 * This logic is designed to guarantee that an alert will be sent to the user before the vehicle has passes the desired stop.
 * GPS coordinates are regularly updated, but not necessarily in real-time.  BusBuddy needs to notify the user before the bus reaches the stop.  
 * An alert range is a distance range before the stop when the user should be notified.
 *
 */
class AlertRangeLogic implements AlertSpecification {

	/**
	 * Provides the logic necessary to determine from the GPS coordinates if the registered user should be alerted.
	 */
	public boolean inAlertRange(GPSLocationObject vehicleLocation) {		
		
		return false;
	}

}
