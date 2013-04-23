package edu.umn.msse.busbuddy.tracking;

import java.util.Date;

import edu.umn.msse.busbuddy.transit.Location;

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
	public boolean inAlertRange(Date lastUpdateTime, Location vehicleLocation) {
		return false;
	}

}
