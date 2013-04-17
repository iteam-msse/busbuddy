package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;

/**
 * Implements Subject {@link GPS Location Tracking} for retrieving GPS location updates 
 * from outside commercial tracking services.
 *
 */
public class CommercialTracking implements GPSLocationTracking {
	
	private ArrayList<GPSLocationObserver> gpsObserver; /**< Array list of GPS devices registered for updates*/
	double gpsLatitude; /**< Latitude last received from GPS device */
	double gpsLongitude; /**< Longitude last received from GPS device */
	
	/**
	 * Constructor, creates ArrayList<{@link GPSLocationObserver}> to hold registered observers.
	 */
	public CommercialTracking () {
		gpsObserver = new ArrayList<GPSLocationObserver>();
	}
	
	/**
	 * Register a GPS Device to the list to poll for updates.
	 */
	public void registerGPSDevice(GPSLocationObserver gpsObs) {	
		
	}

	/**
	 * Remove a GPS device from the list currently being polled for updates.
	 */
	public void unregisterGPSDevice(GPSLocationObserver gpsObs) {
		
	}
	/**
	 * Set Latitude retrieved from the GPS device polled.
	 * @param devLatitude
	 */
	public void setGPSLatitude(double devLatitude) {
		
	}
	
	/**
	 * Receives longitude update from the GPS device, and notifies the observing transit vehicle.
	 * @param devLongitude 
	 */
	public void setGPSLongitude(double devLongitude) {
		
	}
	/**
	 * Continuously poll the registered GPS devices for location updates.
	 */
	public void pollGPSDevice() {

	}
}
