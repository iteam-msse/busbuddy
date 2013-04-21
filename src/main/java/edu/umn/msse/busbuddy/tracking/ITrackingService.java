package edu.umn.msse.busbuddy.tracking;

import java.net.URL;

import edu.umn.msse.busbuddy.transit.Location;
import edu.umn.msse.busbuddy.utility.UserTrackingAlertObject;

public interface ITrackingService {
	
	public enum AlertType  {LOCATION, DELAY};
	
	public void registerVehicleOnRoute(URL url, int gpsDeviceID);
	public void unregisterVehicleFromRoute(String url, int gpsDeviceID);
	public void addUserTrackingAlert(UserTrackingAlertObject utao);
	public void startTrackingController();
	public Location getTransitVehicleLocation(int gpsDeviceID);

}
