package edu.umn.msse.busbuddy.alert.controller.model;

import edu.umn.msse.busbuddy.alert.enums.AlertInitiator;

/**
 * A base model that contains bare minimum information about the alert request. Any model that extends this class can
 * add additional data that is needed.
 */
public class AlertRequestModel {

	/**
	 * Alert Initiator {@see AlertInitiator}.
	 */
	private AlertInitiator alertInitiator;

	public AlertInitiator getAlertInitiator() {
		return alertInitiator;
	}

	public void setAlertInitiator(AlertInitiator alertInitiator) {
		this.alertInitiator = alertInitiator;
	}
}
