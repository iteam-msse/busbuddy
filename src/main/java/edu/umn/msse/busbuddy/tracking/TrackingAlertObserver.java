package edu.umn.msse.busbuddy.tracking;

import edu.umn.msse.busbuddy.utility.UserTrackingAlertObject;
/**
 * Abstract class defining the methods for the tracking alert observer.
 *
 */
public abstract class TrackingAlertObserver {

	private UserTrackingAlertObject utao; /**< Value Object containing the items necessary for an alert */
	private AlertSpecification spec;      /**< The business logic specification of how to determine if an alert needs to be sent for a vehicle */

	/**
	 * Return the specification to use to determine if a vehicle is in an alert zone.
	 */
	public AlertSpecification getSpec() {
		return spec;
	}

	/**
	 * Set the alert specification
	 * @param spec AlertSpecification - the rules used by the subject to determine if an alert is necessary.
	 */
	protected void setSpec(AlertSpecification spec) {
		this.spec = spec;
	}

	/**
	 * The observer pattern update method called from the subject {@link TransitVehicle} when a vehicle is determined to be in an alert zone and a user needs to be notified.  
	 * Alert notifications are actually sent using the {@link AlertService}
	 */
	public abstract void updateAlert(); 
	
	}
