package edu.umn.msse.busbuddy.alert.service;

import edu.umn.msse.busbuddy.alert.controller.model.AlertRequestModel;
import edu.umn.msse.busbuddy.alert.domain.model.Alert;

/**
 * This factory is going to pick the best available strategy to execute the alert so that the user can be notified.
 */
public class AlertExecuteStrategyFactory {

	/**
	 * Based on the alertModel information, this method is going to pick the best strategy to send the alert.
	 * 
	 * @param alertModel {@link alert.domain.model.Alert} model which is used to pick the best strategy.
	 * @return An implementation of {@link IAlertExecuteStrategy} that can send the notification message for given
	 *         alert.
	 */
	public static IAlertExecuteStrategy getAlertExecuteStrategy(Alert alertModel) {
		return null;
	}
}
