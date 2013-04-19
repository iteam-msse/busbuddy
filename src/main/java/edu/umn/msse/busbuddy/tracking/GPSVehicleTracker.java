package edu.umn.msse.busbuddy.tracking;
/**
 * Implementation of the Observer, update the transit vehicle GPS location.
 *
 */
public class GPSVehicleTracker implements GPSLocationObserver {
	
	private GPSLocationTracking gpsDevice;
	private int gpsID;
	private double latitude;
	private double longitude;
	
	/**
	 * Register the Transit Vehicle GPS device with GPS location tracking
	 * @param gpsDevice - GPSLocationTracking Subject being observed
	 */
	public GPSVehicleTracker(GPSLocationTracking gpsDevice) {
		this.gpsDevice = gpsDevice;	
		gpsDevice.registerGPSDevice(this);
		
	}

	/**
	 * Notify method to get the new GPS coordinates from GPS location tracking
	 */
	public void gpsUpdate(int gpsID, double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

}
