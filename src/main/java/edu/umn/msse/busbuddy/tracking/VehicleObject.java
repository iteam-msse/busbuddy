package edu.umn.msse.busbuddy.tracking;

import java.net.URL;

/**
 * Value Object containing vehicle information obtained when the user registers a vehicle using the user interface.
 *
 */
public class VehicleObject {
	
	private int gpsDeviceID;        /**< GPS hardware device ID.  Hardware GPS device ID, uniquely identifies a GPS unit. Obtained from user interface when a vehicle registers for tracking. */
	private String gpsDeviceInfo;   /**< GPS device contact information, commercial web URL, GPS wireless connection or port number. Obtained from user interface when a vehicle is registered for tracking. */
	private URL transitCoURL;       /**< Transit company operating this vehicle. Obtained from the information uploaded to TransitInfo by the transit company. User selects transit company name from a drop down on the user interface when registering a vehicle.*/
	private int currentRoute;       /**< Current route number.  Obtain and updated by the user interface. */
	
	public String getGPSDeviceInfo() { return gpsDeviceInfo; } ;
	public URL getTransitCoURL() { return transitCoURL; }
	public int getGPSDeviceID() {return gpsDeviceID; }
	public int getCurrentRoute() { return currentRoute; }
}
