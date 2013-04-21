package edu.umn.msse.busbuddy.tracking;

import edu.umn.msse.busbuddy.transit.Location;

/**
 * Implementation of the Observer, update the transit vehicle GPS location.
 *
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
	public void gpsUpdate(int gpsID, Location newLocation) {
		this.setGPSLocation(newLocation);
	}

}
