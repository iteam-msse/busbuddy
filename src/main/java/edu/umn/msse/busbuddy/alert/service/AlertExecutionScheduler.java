package edu.umn.msse.busbuddy.alert.service;

import java.util.List;

/**
 * This is a background service that runs all the time. The {@link #runAlert()} method is invoked in a fixed time
 * interval which actually calls other methods and services to process the alert.
 */
public class AlertExecutionScheduler {

	/**
	 * This method runs in fixed time interval indefinitely as long as program is alive. It calls
	 * {@link #getAlertServices()} to get a list of classes that extend {@link AlertService}. It then loops through
	 * those services to call {@link AlertService#sendAlert()} to push notification to users preferred mode of
	 * communication.
	 */
	public void runAlert() {
		for (AlertService alertService : getAlertServices()) {
			alertService.sendAlert();
		}
	}

	/**
	 * Gets all the classes that extends the {@link AlertService} via reflection.
	 * 
	 * @return A list of classes extending {@link AlertService}.
	 */
	private List<AlertService> getAlertServices() {
		return null;
	}

}
