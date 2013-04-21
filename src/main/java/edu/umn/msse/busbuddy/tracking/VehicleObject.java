package edu.umn.msse.busbuddy.tracking;
/**
 * Value Object containing vehicle information obtained when the user registers a vehicle using the user interface.
 *
 */
public class VehicleObject {
	
	private int gpsDeviceID;        /**< GPS hardware device ID */
	private String gpsDeviceInfo;   /**< GPS device contact information, commercial web URL, GPS wireless connection or port number */
	private String transitCoURL;    /**< Transit company operating this vehicle */
	private int currentRoute;       /**< Current route number */
	
	public int getGPSDeviceID() {
		return gpsDeviceID;
	}
	protected void setGPSDeviceID(int gpsDeviceID) {
		this.gpsDeviceID = gpsDeviceID;
	}
	public String getGPSDeviceInfo() {
		return gpsDeviceInfo;
	}
	protected void setGPSDeviceInfo(String gpsDeviceInfo) {
		this.gpsDeviceInfo = gpsDeviceInfo;
	}
	public String getTransitCoURL() {
		return transitCoURL;
	}
	protected void setTransitCoURL(String transitCoURL) {
		this.transitCoURL = transitCoURL;
	}
	public int getCurrentRoute() {
		return currentRoute;
	}
	protected void setCurrentRoute(int currentRoute) {
		this.currentRoute = currentRoute;
	}

}
