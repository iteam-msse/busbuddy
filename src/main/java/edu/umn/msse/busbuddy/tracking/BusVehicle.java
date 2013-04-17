package edu.umn.msse.busbuddy.tracking;

public class BusVehicle extends TransitVehicle {

	public BusVehicle() {
		GPSLocationTracking gpsLocationServer = new CommercialTracking(); /* Singleton */
		GPSVehicleTracker gpsTracker = new GPSVehicleTracker(gpsLocationServer);
		gpsLocationServer.registerGPSDevice(gpsTracker);
	}

}
