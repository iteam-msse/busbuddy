package edu.umn.msse.busbuddy.tracking;

import java.net.URL;

public abstract class ATransitVehicleFactory {
	
	public abstract TransitVehicle createTransitVehicle(URL url, int vehicle);

}
