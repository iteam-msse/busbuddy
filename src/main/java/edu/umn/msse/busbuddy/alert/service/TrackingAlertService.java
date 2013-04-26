package edu.umn.msse.busbuddy.alert.service;

import edu.umn.msse.busbuddy.alert.controller.model.AlertRequestModel;
import edu.umn.msse.busbuddy.alert.controller.model.AlertResponseModel;
import edu.umn.msse.busbuddy.alert.domain.model.Alert;

/**
 * Extends {@link AlertService} and provides CRUD methods to operate on alerts as well as sends alerts to execute via
 * appropriate strategy. This handles all the alerts initiated by Tracking module.
 */
public class TrackingAlertService extends AlertService {

	/**
	 * {@see AlertService#createAlert(AlertRequestModel)}
	 */
	public AlertResponseModel createAlert(AlertRequestModel requestModel) {
		return null;
	}

	/**
	 * {@see AlertService#updateAlert(Alert)}
	 */
	public AlertResponseModel updateAlert(Alert alertModel) {
		return null;

	}

	/**
	 * {@see AlertService#sendAlert()}
	 */
	@Override
	public boolean sendAlert() {
		// TODO Auto-generated method stub
		return false;
	}

}
