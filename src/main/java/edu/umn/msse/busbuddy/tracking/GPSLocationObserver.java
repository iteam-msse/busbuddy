package edu.umn.msse.busbuddy.tracking;

/**
 * Observer Pattern - Observer interface for GPS location tracking
 *
 */
public interface GPSLocationObserver {
	/**
	 * Observer Pattern update method to update transit vehicle GPS location
	 * @param gpsID - integer device ID from the GPS unit being tracked
	 * @param latitude - double new latitude from GPS device
	 * @param longitude - double new longitude from GPS device
	 */
	public void gpsUpdate(int gpsID, double latitude, double longitude);
}
