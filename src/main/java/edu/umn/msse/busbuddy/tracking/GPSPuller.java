package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;
/**
 * GPS Puller is a concrete implementation of {@link GPSLocationTracking} for obtaining coordinates directly from a GPS device installed in a registered vehicle.
 * GPS Puller is implemented as a singleton to limit the number of system resources consumed. 
 * GPS Puller uses the system infrastructure to establish a wireless network connection to the physical GPS device and retrieve update coordinates.
 * The necessary information to contact the device is provided through the user interface when a vehicle is registered to a route.
 * @post New GPS Puller created if one did not previously exist.
 */
public class GPSPuller extends GPSLocationTracking {
	
	private ArrayList<GPSLocationObserver> gpsObserver; /**< Array list of GPS devices registered for updates*/
	
	/**
	 * Only need one GPS Puller Service running to track by polling all registered GPS devices.
	 * Constructor, creates ArrayList<{@link GPSLocationObserver}> to hold registered observers.
	 */
	private GPSPuller () {
		gpsObserver = new ArrayList<GPSLocationObserver>();
	}
	
    /**
	 * GPS Puller Holder is loaded on the first execution of GPSPuller.getInstance() 
	 * or the first access to GPSPuller.INSTANCE, not before (lazy instantiation).
	 */
	private static class GPSPullerHolder { 
	    public static final GPSPuller INSTANCE = new GPSPuller();
	}

	public static GPSPuller getInstance() {
		return GPSPullerHolder.INSTANCE;
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
