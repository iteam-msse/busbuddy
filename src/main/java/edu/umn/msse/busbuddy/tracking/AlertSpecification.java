package edu.umn.msse.busbuddy.tracking;

/**
 * Interface for Alert Specifications which contain the business logic used to determine if an alert should be triggered for a vehicle.  
 * Alert specifications are referenced in the vehicle tracking observer and used by the subject to determine when to send an alert.  
 * This is to reduce the number of false positive alerts.
 *
 */
public interface AlertSpecification {
	/**
	 * Compare GPS location and time with alert information to determine if vehicle is within range of a stop and user(s) need to be notified.
	 * @param lastUpdateTime - Time GPS information was last updated
	 * @param vehicleLocation - Latest GPS coordinates obtained from a vehicle
	 * @return true if vehicle is in alert range, false if vehicle is not in alert range
	 */
	public boolean inAlertRange(GPSLocationObject vehicleLocation);

}
