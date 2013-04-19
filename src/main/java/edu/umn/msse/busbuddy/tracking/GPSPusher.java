package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;

/**
 * Implements Subject {@link GPS Location Tracking} for retrieving GPS location updates 
 * from outside commercial tracking services.
 *
 */
public class GPSPusher implements GPSLocationTracking {
	
	private ArrayList<GPSLocationObserver> gpsObserver; /**< Array list of GPS devices registered for updates*/
	
	/**
	 * Only need one GPS Pusher Service running to track by polling all registered GPS devices.
	 * Constructor, creates ArrayList<{@link GPSLocationObserver}> to hold registered observers.
	 */
	private GPSPusher () {
		gpsObserver = new ArrayList<GPSLocationObserver>();
	}
	
    /**
	 * GPS Pusher Holder is loaded on the first execution of GPSPusher.getInstance() 
	 * or the first access to GPSPusher.INSTANCE, not before (lazy instantiation).
	 */
	private static class GPSPusherHolder { 
	    public static final GPSPusher INSTANCE = new GPSPusher();
	}

	public static GPSPusher getInstance() {
		return GPSPusherHolder.INSTANCE;
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
