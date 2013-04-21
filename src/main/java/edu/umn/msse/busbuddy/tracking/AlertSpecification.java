package edu.umn.msse.busbuddy.tracking;

import java.util.Date;

import edu.umn.msse.busbuddy.transit.Location;

/**
 * Interface for Alert Specifications which contain the business logic used to determine if an alert should be triggered for a vehicle.  
 * Alert specifications are referenced in the vehicle tracking observer and used by the subject to determine when to send an alert.  
 * This is to reduce the number of false positive alerts.
 *
 */
public interface AlertSpecification {
	
	public boolean inAlertZone(Date lastUpdateTime, Location vehicleLocation);

}
