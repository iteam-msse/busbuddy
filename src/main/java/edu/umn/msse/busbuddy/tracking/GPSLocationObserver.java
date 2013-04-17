package edu.umn.msse.busbuddy.tracking;

public interface GPSLocationObserver {
	public void gpsUpdate(double latitude, double longitude);
}
