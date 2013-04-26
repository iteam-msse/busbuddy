package edu.umn.msse.busbuddy.tracking;

/**
 * GPSLocationTracking - interface Subject of the Observer Pattern 
 * Defines methods for an observer GPS Device to register and receive updates on vehicle location.
 *
 */
abstract class GPSLocationTracking {
	
	/**
	 * registerGPSDevice - register a GPS device with the Location Tracking Service 
	 * @param GPSLocationObserver - Vehicle location to notify when new vehicle GPS location is received
	 */
	abstract void registerGPSDevice(GPSLocationObserver gpsObs);
	/**
	 *  unregisterGPSDevice - remove a vehicle from list.  Stop updating vehicle location.
	 * @param gpsObs GPSLocationObserver - vehicle to remove from notification list 
	 */
	abstract void unregisterGPSDevice(GPSLocationObserver gpsObs);
	/**
	 * pollGPSDevice - continuously poll registered GPS Devices for location updates
	 */
	abstract void pollGPSDevice();

}
