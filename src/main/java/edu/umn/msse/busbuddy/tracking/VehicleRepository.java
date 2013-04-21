package edu.umn.msse.busbuddy.tracking;

import java.net.URL;
import java.util.ArrayList;

/**
 * Repository for information on vehicles registered on a route.
 *
 */
public class VehicleRepository {
	
	private ArrayList <TransitVehicle> vehicleList = null; /**< List of vehicles currently registered and available in this repository*/

	/**
	 * Create the initial repository for saving vehicles registered with the tracking service.
	 */
	public VehicleRepository() {
		VehicleRepository vehicleRepository = new VehicleRepository();
	}
	
	/**
	 * Add a vehicle to the repository.
	 */
	public void addVehicle(TransitVehicle vehicle) {}
	/**
	 * Remove a vehicle from the repository. 
	 * @param gpsDeviceID - integer the GPS id if the vehicle to remove.
	 */
	public void removeVehicle(int gpsDeviceID) {} 
	/**
	 * A vehicle may switch routes, update an existing vehicle in the repository.
	 * @param vehicle - {@link VehicleObject} new vehicle information from driver through UI
	 */
	public void updateVehicle(TransitVehicle vehicle) {}
	/**
	 * Find a vehicle currently stored in the repository based on the unique GPS device ID.
	 * @param gpsDeviceID - integer GPS device ID 
	 * @return {@link VehicleObject} matching vehicle or null if no matching vehicle found.
	 */ 
	public TransitVehicle findVehicle(int gpsDeviceID) { return new BusVehicle(); } 
	/**
	 * Find all vehicles from a transit company registered on a route.
	 * @param transitCoURL  URL or the transit company
	 * @param routeID - integer route that vehicle is currently registered on.
	 * @return ArrayList<TransitVehicle> of all vehicles for transit company registered on the route or null if no matching vehicles found.
	 */
	public static ArrayList<TransitVehicle> findVehiclesByRoute(URL transitCoURL, int routeID) {return new ArrayList<TransitVehicle>(); } 
}
