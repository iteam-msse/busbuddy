package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;

/**
 * Implements Subject {@link GPSLocationTracking} for retrieving GPS location updates 
 * from outside commercial tracking services.
 * @post New GPS commercial tracker created or existing one returned.
 *
 */
public class CommercialTracking extends GPSLocationTracking {
	
	private ArrayList<GPSLocationObserver> gpsObserver; /**< Array list of GPS devices registered for updates*/
	
	/**
	 * Only need one Commercial Tracking Service running to track by polling all registered GPS devices.
	 * Constructor, creates ArrayList<{@link GPSLocationObserver}> to hold registered observers.
	 */
	private CommercialTracking () {
		gpsObserver = new ArrayList<GPSLocationObserver>();
	}
	
    /**
	 * Commercial Tracking Holder is loaded on the first execution of CommercialTracking.getInstance() 
	 * or the first access to CommercialTracking.INSTANCE, not before (lazy instantiation).
	 */
	private static class CommercialTrackingHolder { 
	    public static final CommercialTracking INSTANCE = new CommercialTracking();
	}

	/**
	 * Instantiates a single Commercial Tracking service to the caller.
	 * @return - CommercialTracking instance
	 */
	public static CommercialTracking getInstance() {
		return CommercialTrackingHolder.INSTANCE;
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
	 * Continuously poll the registered GPS devices for location updates.
	 */
	public void pollGPSDevice() {

	}
}
