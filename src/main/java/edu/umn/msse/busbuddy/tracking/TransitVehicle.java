package edu.umn.msse.busbuddy.tracking;

import java.net.URL;

public abstract class TransitVehicle {
	
	private URL url;
	private int vehicleID;
	private int routeID;
    private double latitude;
    private double longitude;
    private int gpsDeviceID;
    private GPSLocationObserver gpsObserver;        /*  */
    private GPSLocationTracking gpsTracker;        /* Subject in the Observer Pattern Singleton? */
    
	public String toString() {
		return url + " " + vehicleID + " " + routeID + " " + latitude + " " + longitude;
	} 
	
}
