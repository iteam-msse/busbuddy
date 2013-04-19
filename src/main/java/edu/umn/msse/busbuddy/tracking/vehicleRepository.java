package edu.umn.msse.busbuddy.tracking;

import java.net.URL;
import java.util.ArrayList;

/**
 * Repository for information on vehicles registered on a route.
 *
 */
public class vehicleRepository {

	public void addVehicle(VehicleObject vehicle) {}
	
	public void removeVehicle(int gpsDeviceID) {} 
	
	public VehicleObject findVehicle(int gpsDeviceID) { return new VehicleObject(); } 
	
	public ArrayList<VehicleObject> findVehiclesByRoute(URL transitCoURL, int routeID) {return new ArrayList<VehicleObject>(); } 
}
