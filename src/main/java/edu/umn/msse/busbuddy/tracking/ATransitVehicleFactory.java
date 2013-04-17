package edu.umn.msse.busbuddy.tracking;

public abstract class ATransitVehicleFactory {
	
	public abstract TransitVehicle createTransitVehicle(char type, String url, int vehicle);

}
