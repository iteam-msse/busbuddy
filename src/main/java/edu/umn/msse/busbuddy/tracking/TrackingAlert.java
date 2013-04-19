package edu.umn.msse.busbuddy.tracking;

import java.sql.Timestamp;

public class TrackingAlert {
	
	private String userContactInfo;
	private double notifyVehicleLatitude;
	private double notifyVehicleLongitude;
	private Timestamp alertTime;
	
	public String getUserContactInfo() {
		return userContactInfo;
	}
	public void setUserContactInfo(String userContactInfo) {
		this.userContactInfo = userContactInfo;
	}
	public double getNotifyVehicleLatitude() {
		return notifyVehicleLatitude;
	}
	public void setNotifyVehicleLatitude(double notifyVehicleLatitude) {
		this.notifyVehicleLatitude = notifyVehicleLatitude;
	}
	public double getNotifyVehicleLongitude() {
		return notifyVehicleLongitude;
	}
	public void setNotifyVehicleLongitude(double notifyVehicleLongitude) {
		this.notifyVehicleLongitude = notifyVehicleLongitude;
	}

}
