package edu.umn.msse.busbuddy.tracking;

import java.util.ArrayList;
/**
 * Bus Vehicle is a concrete implementation of the abstract Transit Vehicle.  Contains data and functionality specific to buses.
 *
 */
public class BusVehicle extends TransitVehicle {
	
	private ArrayList<TrackingAlertObserver> alertList; /**< List of alerts registered for this vehicle. Note alerts may be tracking or delay alerts */

	/**
	 * Constructor for bus type vehicles, perform any initializations unique to buses. 
	 */
	public BusVehicle() {

	}

	/**
	 * Register any user alerts for this vehicle.
	 */
	public void registerTrackingAlert(TrackingAlertObserver ao) {}
	/**
	 * Unregister any user alert currently tracking this bus.
	 */
	public void unregisterTrackingAlert(TrackingAlertObserver ao) {}
	/**
	 * When the bus GPS position is updated, determine if any user alerts need to be sent.
	 */
	public void checkForAlerts() {} 
}
