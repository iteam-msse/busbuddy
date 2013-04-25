package edu.umn.msse.busbuddy.alert.service;

import edu.umn.msse.busbuddy.alert.controller.model.AlertRequestModel;
import edu.umn.msse.busbuddy.alert.domain.model.Alert;

/**
 * This factory is going to pick the best available strategy to execute the
 * alert so that the user can be notified.
 */
public class AlertExecuteStrategyFactory {

	/**
	 * Based on the alertModel information, this method is going to pick the strategy to send the alert.
	 * @param alertModel
	 * @return
	 */
	public static AlertService getAlertService(Alert alertModel) {
		return null;
	}
}
