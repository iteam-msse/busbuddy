package edu.umn.msse.busbuddy.tracking;

import java.net.URL;

public class TransitVehicleFactory extends ATransitVehicleFactory {
	
	public TransitVehicle createTransitVehicle(URL url, int vehicle) {
		
		getVehicleGPSDeviceID(url);

	    return new BusVehicle();

	}
	/**
	 * Retrieve the GPS Device ID from repository of vehicles registered for route identified by type and URL.
	 * @param url - URL identifying the transit company
	 * @return integer GPS Device ID
	 */
	protected int getVehicleGPSDeviceID(URL url) { return 2; } 
}
