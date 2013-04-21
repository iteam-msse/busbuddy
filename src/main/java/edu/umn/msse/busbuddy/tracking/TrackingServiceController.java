package edu.umn.msse.busbuddy.tracking;

import java.net.URL;
import java.util.ArrayList;

import edu.umn.msse.busbuddy.transit.Location;
import edu.umn.msse.busbuddy.utility.UserTrackingAlertObject;

public class TrackingServiceController implements ITrackingService {
	 
	TransitVehicleFactory transitFactory = new TransitVehicleFactory();
	AlertFactory alertFactory = new AlertFactory();                    
	
	/**
	 * Create a vehicle when a user registers a vehicle on a route through the user interface.
	 */
	public void registerVehicleOnRoute(URL url, int gpsDeviceID) { 
		TransitVehicle tv = transitFactory.createTransitVehicle(url, gpsDeviceID); 
		} 
	/**
	 * Remove a vehicle from the vehicle repository when the vehicle is no longer in service.
	 * @param url - URL transit company and route information for this vehicle
	 * @param gpsDeviceID - integer GPS device ID installed in vehicle, must match the ID the vehicle registered with.
	 */
	public void unregisterVehicleFromRoute(String url, int gpsDeviceID) { }
	
	/**
	 * Add a new user alert.  Necessary inputs are entered by the user on the User Interface and 
	 * made available to the Tracking Controller through {@link UserTrackingAlertObject}
	 */
	public void addUserTrackingAlert(UserTrackingAlertObject utao) {
		/**
		 * 1. Verify that there is a vehicle registered on the routed requested by the user.
		 * 2. Get a list of vehicles on the route from the vehicle repository 
		 * 3. Create a new Tracking Alert Observer
		 * 4. Add an alert specification containing the business rules to determine if bus is in alert zone.
		 * 5. Register the user alert observer to the vehicles
		 */
		
		/**
		 * Find the vehicles registered on this route
		 */
		ArrayList<TransitVehicle> vehicleList = VehicleRepository.findVehiclesByRoute(utao.getTransitCoInfo(), utao.getRouteID());
		
		/**
		 * Create an alert for this user request and register this alert with the vehicle(s) the user is watching.
		 */
		for (TransitVehicle vehicle : vehicleList) {
			TrackingAlertObserver alert = alertFactory.createAlertObserver(vehicle);
			vehicle.registerTrackingAlert(alert);
		}
	}
	
	/**
	 * Gets a list of saved alerts from the {@link AlertService} and restores then on tracking module startup.
	 */
	public void startTrackingController() {}

	/**
	 * Find locations of the specified GPS device ID.
	 */
	public Location getTransitVehicleLocation(int gpsDeviceID) {
		return null;
	}

}
