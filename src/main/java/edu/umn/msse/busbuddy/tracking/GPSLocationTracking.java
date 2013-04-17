package edu.umn.msse.busbuddy.tracking;

/**
 * GPSLocationTracking - interface Subject of the Observer Pattern 
 * Defines methods for an observer GPS Device to register and receive updates on vehicle location.
 *
 */
public interface GPSLocationTracking {
	
	/**
	 * registerGPSDevice - register a GPS device with the Location Tracking Service 
	 * @param GPSLocationObserver - Vehicle location to notify when new vehicle GPS location is received
	 */
	public void registerGPSDevice(GPSLocationObserver gpsObs);
	/**
	 *  unregisterGPSDevice - remove a vehicle from list.  Stop updating vehicle location.
	 * @param gpsObs GPSLocationObserver - vehicle to remove from notification list 
	 */
	public void unregisterGPSDevice(GPSLocationObserver gpsObs);
	/**
	 * pollGPSDevice - continuously poll registered GPSDevices for location updates
	 */
	public void pollGPSDevice();

}