package edu.umn.msse.busbuddy.tracking;

/**
 * Implements the business logic to determine if the vehicle is behind schedule or not reporting GPS updates and send a notification to the transit company.
 *
 */
public class DelayAlertLogic implements AlertSpecification {

	/**
	 * Implements Subject {@link GPSLocationTracking} for retrieving GPS location updates 
	 * from outside commercial tracking services.
	 *
	 */
	public boolean inAlertRange(GPSLocationObject vehicleLocation) {
		return false;
	}

}
