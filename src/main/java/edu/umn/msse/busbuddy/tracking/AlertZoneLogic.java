package edu.umn.msse.busbuddy.tracking;

import java.util.Date;

import edu.umn.msse.busbuddy.transit.Location;
/**
 * Alert Zone Logic implements the business logic to determine is a vehicle is within a zone where an alert needs to be sent to a user who has registered for tracking alerts.
 * This logic is designed to guarantee that an alert will be sent to the user before the vehicle has passes the desired stop.
 *
 */
public class AlertZoneLogic implements AlertSpecification {

	public boolean inAlertZone(Date lastUpdateTime, Location vehicleLocation) {		
		
		return false;
	}

}
