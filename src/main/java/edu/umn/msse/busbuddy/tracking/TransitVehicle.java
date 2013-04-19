package edu.umn.msse.busbuddy.tracking;

import java.net.URL;
/**
 * Abstract transit vehicle class contains the common data for all types of vehicles and 
 * the Subject GPS Tracking and the GPS observer to receive GPS location updates.
 * 
 */
public abstract class TransitVehicle {
	
	private URL url;
	private int vehicleID;
	private int routeID;
    private double vehicleLatitude;
    private double vehicleLongitude;
    private int gpsDeviceID;
    private GPSLocationObserver gpsObserver;        /*  */
    private GPSLocationTracking gpsTracker;        /* Subject in the Observer Pattern Singleton? */
    
    /**
     * Transit Vehicle is also the subject for tracking user subscribed alerts
     */
    public abstract void registerTrackingAlert(TrackingAlertObserver ao);
    public abstract void unregisterTrackingAlert(TrackingAlertObserver ao);
    public abstract void triggerAlert();
    
    /**
     * Provide a generic method to output Transit Vehicle information
     */
	public String toString() {
		return url + " " + vehicleID + " " + routeID + " " + vehicleLatitude + " " + vehicleLongitude;
	} 
	
}
