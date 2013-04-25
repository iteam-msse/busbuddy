package edu.umn.msse.busbuddy.alert.service;

import javax.annotation.Resource;

import edu.umn.msse.busbuddy.alert.controller.model.AlertRequestModel;
import edu.umn.msse.busbuddy.alert.enums.AlertInitiator;

/**
 * AlertServiceFactory initializes appropriate alert service depending upon the
 * parameter being passed. Currently, each module is aligned to each service but
 * in the future it could change such that 2 module can use same service.
 */
public class AlertServiceFactory {

	@Resource
	private UserAlertService userAlertService;;

	@Resource
	private TrackingAlertService trackingAlertService;;

	@Resource
	private TransitAlertService transitAlertService;;

	/**
	 * This method returns a concrete implementation of the alert service.
	 * 
	 * @param requestModel
	 *            A JSON representation of the request from controller.
	 * @return An extension of AlertService.
	 */
	public AlertService getAlertService(AlertRequestModel requestModel) {
		if (requestModel.getAlertInitiator() == AlertInitiator.TrackingModule) {
			return this.trackingAlertService;
		} else if (requestModel.getAlertInitiator() == AlertInitiator.TransitModule) {
			return this.transitAlertService;
		} else if (requestModel.getAlertInitiator() == AlertInitiator.UserModule) {
			return this.userAlertService;
		}
		/**
		 * thrown an error if applicable.
		 */
		return null;

	}
}
