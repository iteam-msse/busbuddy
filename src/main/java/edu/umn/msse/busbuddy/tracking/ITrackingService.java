package edu.umn.msse.busbuddy.tracking;

import java.net.URL;
/**
 * Interface for the Tracking Service Controller. 
 * The tracking service purpose is to allow vehicles to register on routes and to 
 * establish a connection with the GPS device installed in the vehicle to provide regular vehicle location updates.
 * The tracking service uses the current GPS coordinates to determine when to send alerts to registered users.
 *
 */
public interface ITrackingService {
	
	/**
	 * Interface for registering vehicles on a route from the user interface
	 * @param url - Transit company URL
	 * @param gpsDeviceID - unique hardware GPS device ID
	 */
	public void registerVehicleOnRoute(URL url, int gpsDeviceID);
	/**
	 * Interface for removing a registered vehicle from a route when the vehicle goes out of service.
	 * @param url - URL uniquely identifying a transit company.
	 * @param gpsDeviceID - unique hardware GPS id being unregistered on user interface
	 */
	public void unregisterVehicleFromRoute(String url, int gpsDeviceID);
	/**
	 * Add a user tracking alert from the user interface
	 * @param utao - {@link UserTrackingAlertObject} information from user interface necessary to create alert.
	 */
	public void addUserTrackingAlert(UserTrackingAlertObject utao);
	/**
	 * Logic necessary when the tracking controller is cold started.  
	 * Retrieves the saved user alerts from the {@link IAlertService} 
	 */
	public void startTrackingController();
	/**
	 * Allows users and modules outside of the tracking package to query for the current location of a registered vehicle.
	 * @param gpsDeviceID - unique hardware GPS device
	 * @return - Location current latitude and longitude of vehicle
	 */
	public GPSLocationObject getTransitVehicleLocation(int gpsDeviceID);

}
