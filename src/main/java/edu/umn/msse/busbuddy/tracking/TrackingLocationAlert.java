package edu.umn.msse.busbuddy.tracking;

public class TrackingLocationAlert extends TrackingAlertObserver {

	/**
	 * Tracking Location Alert constructor. Associates user information with vehicle to monitor.
	 * @param vehicle {@link TransitVehicle} Vehicle to add alert monitoring
	 * @param alert - {@link TrackingAlert} User contact details and vehicle location indicating when user wants to receive alert.
	 */
	public TrackingLocationAlert(TransitVehicle vehicle, TrackingAlert userAlertInfo) {
		vehicle.registerTrackingAlert(this);
	}
	
	/**
	 * Vehicle is in vicinity where user registered to be notified, call Alert Service
	 */
	public void updateAlert() {

	}

}
