package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;

/**
 * Implements Subject {@link GPSLocationTracking} for retrieving GPS location updates from registered vehicles.
 * GPSPusher uses system infrastructure resources to set up a network listener to receive updates directly from the GPS device.
 * GPS Pusher is implemented as a singleton to limit the number of system resources consumed.
 * GPS Pusher receives the necessary configuration information (e.g. port) from the user interface when the GPS device is registered.
 * @post New GPS Listener created if none existed previously.
 */
public class GPSPusher extends GPSLocationTracking {
	
	private ArrayList<GPSLocationObserver> gpsObserver; /**< Array list of GPS devices registered for updates*/
	
	/**
	 * Only need one GPS Pusher Service running to track by polling all registered GPS devices.
	 * Constructor, creates ArrayList<{@link GPSLocationObserver}> to hold registered observers.
	 */
	private GPSPusher () {
		gpsObserver = new ArrayList<GPSLocationObserver>(); /**< List of GPS devices currently registered and waiting for updates */
	}
	
    /**
	 * GPS Pusher Holder is loaded on the first execution of GPSPusher.getInstance() 
	 * or the first access to GPSPusher.INSTANCE, not before (lazy instantiation).
	 */
	private static class GPSPusherHolder { 
	    public static final GPSPusher INSTANCE = new GPSPusher();
	}

	/**
	 * Create a single instance of the GPS Listener for receiving GPS updates from devices that periodically push updated directly from the device.
	 * @return GPSPusher reference to the listener for incoming GPS updates from registered devices.
	 */
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
