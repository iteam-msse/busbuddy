package edu.umn.msse.busbuddy.tracking;

import java.sql.Timestamp;

public abstract class TrackingAlertObserver {

	private String sendAlertTo;
	private double notifyLocation;
	private double notifyLatitude;
	private Timestamp notifyTime;
	
	public abstract void updateAlert();
	
	public String toString() { 
		String s = null;
		return s; 
	}

	public double getNotifyLocation() {
		return notifyLocation;
	}

	public void setNotifyLocation(double notifyLocation) {
		this.notifyLocation = notifyLocation;
	}

	public double getNotifyLatitude() {
		return notifyLatitude;
	}

	public void setNotifyLatitude(double notifyLatitude) {
		this.notifyLatitude = notifyLatitude;
	}

	public Timestamp getNotifyTime() {
		return notifyTime;
	}

	public void setNotifyTime(Timestamp notifyTime) {
		this.notifyTime = notifyTime;
	}
}
