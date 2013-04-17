package edu.umn.msse.busbuddy.tracking;

public class GPSVehicleTracker implements GPSLocationObserver {
	
	private GPSLocationTracking gpsDevice;
	private double latitude;
	private double longitude;
	
	public GPSVehicleTracker(GPSLocationTracking gpsDevice) {
		this.gpsDevice = gpsDevice;	
		gpsDevice.registerGPSDevice(this);
		
	}

	public void gpsUpdate(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

}
