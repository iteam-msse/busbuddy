package edu.umn.msse.busbuddy.tracking;

import edu.umn.msse.busbuddy.alert.controller.AlertRequestController;

/**
 * Abstract class defining the methods for the tracking alert observer.
 * @pre Vehicle is determined by {@link AlertSpecification} to within range
 * @post Alert request is sent to the {@link AlertService}
 * Abstract class defining the methods for the tracking alert observer.
 * This class calls alert module’s alert controller via REST call to fetch necessary information. 
 */

abstract class TrackingAlertObserver {

	private UserTrackingAlertObject userAlertTrackingObject; /**< Value Object containing the items necessary for an alert */
	private AlertSpecification specification;      /**< The business logic specification of how to determine if an alert needs to be sent for a vehicle */
	private AlertRequestController arc = new AlertRequestController(); /**< Alert Module Controller called via a REST API processUserAlertRequest() */

	/**
	 * Return the specification to use to determine if a vehicle is in an alert range.
	 * @retval AlertSpecification 
	 */
	AlertSpecification getSpec() {
		return specification;
	}

	/**
	 * Set the alert specification
	 * @param spec AlertSpecification - the rules used by the subject to determine if an alert is necessary.
	 */
	 void setSpec(AlertSpecification spec) {
		this.specification = spec;
	}

	/**
	 * The observer pattern update method called from the subject {@link TransitVehicle} when a vehicle is determined to be in an alert range and a user needs to be notified.  
	 * Alert notifications are actually sent using the {@link IAlertService}
	 */
	abstract void updateAlert(); 
	
	}
