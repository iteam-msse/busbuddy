package edu.umn.msse.busbuddy.tracking;

import java.net.URL;
/**
 * Transit Vehicle Factory encapsulates the complexity of creating a new vehicle.
 * Inputs are obtained from the user interface when a vehicle is registered by a user.
 *
 */
public class TransitVehicleFactory  {
	
	public TransitVehicle createTransitVehicle(URL url, int gpsDeviceID) {
		
		/**
		 * Determine what type of vehicle is needed.
		 */
		TransitVehicle vehicle = new BusVehicle();
		
		/**
		 * Determine what type of GPS tracking is available on this vehicle and register with the appropriate {@link GPSLocationTracking} service.
		 */
		GPSLocationTracking gpsLocationSubject = null;
		int gpsType = getGPSTypeFromURL(url);
		switch (gpsType) {
		case 1:
			gpsLocationSubject = CommercialTracking.getInstance();
			break;
		case 2:
			gpsLocationSubject = GPSPusher.getInstance();
			break;
		case 3:
			gpsLocationSubject = GPSPuller.getInstance();
			break;
		}
		
		GPSVehicleTracker gpsTracker = new GPSVehicleTracker(gpsLocationSubject);
		gpsLocationSubject.registerGPSDevice(gpsTracker);

	    return vehicle;

	}
	
	/**
	 * Parse the input URL for information about connecting to GPS device in this vehicle.
	 * @param url - URL from User Interface, contains GPS connection information.
	 * @return integer type of GPS Device Commercial Service, GPS Pusher, or GPS Puller.
	 */
	private int getGPSTypeFromURL(URL url) {
		return 1;
	}
	
	/**
	 * Retrieve the GPS Device ID from repository of vehicles registered for route identified by type and URL.
	 * @param url - URL identifying the transit company
	 * @return integer GPS Device ID
	 */
	protected int getVehicleGPSDeviceID(URL url) { return 2; } 
}
