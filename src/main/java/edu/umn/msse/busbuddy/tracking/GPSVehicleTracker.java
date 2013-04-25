package edu.umn.msse.busbuddy.tracking;

/**
 * Implementation of the Observer, update transit vehicle GPS location and time
 * GPS Vehicle Tracker gets the state as new GPS coordinates and time from GPS Location Tracking and updates the transit vehicle.
 * @post Transit Vehicle GPS location updated.  
 */
public class GPSVehicleTracker extends GPSLocationObserver {

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
	public void gpsUpdate(int gpsID, GPSLocationObject newLocation) {
		this.setGPSLocation(newLocation);
	}

}
