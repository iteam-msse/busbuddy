package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;
/**
 * Abstract transit vehicle class contains the common data for all types of vehicles and 
 * the Subject GPS Tracking and the GPS observer to receive GPS location updates.
 * 
 */
public abstract class TransitVehicle {
	
	
	private VehicleObject vehicle;                   /**< Value Object holding vehicle details */
    private GPSLocationObserver gpsObserver;         /**< Observer that update the GPS coordinates of the vehicle as they are received  */
    private ArrayList<AlertSpecification> alertSpecification;  /**< Rules to determine if this vehicle is in an alert range */
    
    /**
     * Transit Vehicle is also the subject for tracking user subscribed alerts.
     */
    public abstract void registerTrackingAlert(TrackingAlertObserver ao);
    public abstract void unregisterTrackingAlert(TrackingAlertObserver ao);
    /**
     * The Observer Pattern Subject notify method extended to limit the number of alerts issued by check conditions prior to actually triggering an alert.
     * The checkForAlerts method uses {@link AlertSpecification} to determine if the observing vehicle should be notified.
     */
    public void checkForAlerts() { 
    	
    }
    
    /**
     * The conditions in the Alert Specification were met, send update to the observer.
     */
    public void triggerAlert(TrackingAlertObserver ao) {ao.updateAlert(); } 
    
    /**
     * Add an alert specification {@link AlertSpecification} to this vehicle.
     * A vehicle may have these alerts:
     *     -# one or more users registered for location based alerts
     *     -# transit company registered for delay alerts, or loss of GPS signal alerts
     */
    public void addAlertSpecification() {}
    /**
     * Remove an alert specification from a transit vehicle.
     */
    public void removeAlertSpecifcation() {}
    
    /**
     * Provide a generic method to output Transit Vehicle information
     */
	public String toString() {
		return vehicle.getTransitCoURL() + " " + vehicle.getGPSDeviceInfo() + " " + 
		       vehicle.getGPSDeviceID() + " " + vehicle.getCurrentRoute() + " " + 
		       gpsObserver.getGPSLocation();
	} 
	
}
