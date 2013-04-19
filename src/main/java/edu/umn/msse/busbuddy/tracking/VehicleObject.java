package edu.umn.msse.busbuddy.tracking;

public class VehicleObject {
	
	private int gpsDeviceID;
	private int gpsDeviceType;
	private int vehicleType;
	private String transitCoURL;
	private int currentRoute;
	
	public int getGpsDeviceID() {
		return gpsDeviceID;
	}
	public void setGpsDeviceID(int gpsDeviceID) {
		this.gpsDeviceID = gpsDeviceID;
	}
	public int getGpsDeviceType() {
		return gpsDeviceType;
	}
	public void setGpsDeviceType(int gpsDeviceType) {
		this.gpsDeviceType = gpsDeviceType;
	}
	public int getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getTransitCoURL() {
		return transitCoURL;
	}
	public void setTransitCoURL(String transitCoURL) {
		this.transitCoURL = transitCoURL;
	}
	public int getCurrentRoute() {
		return currentRoute;
	}
	public void setCurrentRoute(int currentRoute) {
		this.currentRoute = currentRoute;
	}

}
