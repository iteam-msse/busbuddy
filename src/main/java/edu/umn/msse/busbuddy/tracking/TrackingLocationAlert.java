package edu.umn.msse.busbuddy.tracking;
/**
 * Concrete implementation of the tracking alert observer.  The subject calls the update alert for registered vehicles.
 */
public class TrackingLocationAlert extends TrackingAlertObserver {

	/**
	 * Tracking Location Alert constructor. Associates user information with vehicle to monitor.
	 * @param vehicle {@link TransitVehicle} Vehicle to add alert monitoring
	 * @param alert - {@link TrackingLocationAlert} User contact details and vehicle location indicating when user wants to receive alert.
	 */
	public TrackingLocationAlert(TransitVehicle vehicle) {
		vehicle.registerTrackingAlert(this);
	}
	
	/**
	 * Vehicle is in vicinity where user registered to be notified, calls Alert Service
	 */
	public void updateAlert() {

	}

}
