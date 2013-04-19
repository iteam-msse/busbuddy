package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;

public class BusVehicle extends TransitVehicle {
	
	private ArrayList<TrackingAlertObserver> alertList;

	public BusVehicle() {
		GPSLocationTracking gpsLocationServer = CommercialTracking.getInstance();
		GPSVehicleTracker gpsTracker = new GPSVehicleTracker(gpsLocationServer);
		gpsLocationServer.registerGPSDevice(gpsTracker);
	}

	public void registerTrackingAlert(TrackingAlertObserver ao) {}
	public void unregisterTrackingAlert(TrackingAlertObserver ao) {}
	public void triggerAlert() {} 
}
