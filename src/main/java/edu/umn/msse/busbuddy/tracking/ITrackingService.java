package edu.umn.msse.busbuddy.tracking;

public interface ITrackingService {
	
	public enum AlertType  {LOCATION, DELAY};
	
	public void AddTransitVehicle();
	
	public void getTransitVehicleLocation();
	
	public void getTransitVehicleAlerts();
	
	public void createTrackingAlert(AlertType type);

}
