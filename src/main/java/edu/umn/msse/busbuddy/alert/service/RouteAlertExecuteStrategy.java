package edu.umn.msse.busbuddy.alert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.umn.msse.busbuddy.alert.client.AlertUserClient;
import edu.umn.msse.busbuddy.alert.domain.AlertRepository;
import edu.umn.msse.busbuddy.alert.domain.model.Alert;

/**
 * A concrete implementation of {@link IAlertExecuteStrategy} that handles executing alert related to route changes.
 */
public class RouteAlertExecuteStrategy implements IAlertExecuteStrategy {

	/**
	 * An instance of {@link alert.domain.AlertRepository} that is used to fetch alerts that are effected by particular route. This
	 * is autowired via Spring Framework.
	 */
	@Autowired
	AlertRepository alertRepository;

	/**
	 * A spring autowired instance of {@link alert.client.AlertUserClient} that can call the User module to get user information.
	 * This is autowired via Spring Framework.
	 */
	@Autowired
	AlertUserClient userClient;

	/**
	 * @see IAlertExecuteStrategy#execute(List) Takes in a list of alerts usually provided from Transit or Tracking
	 *      module where route disruption information is stored. This method finds all the alerts (that users have
	 *      created) that are associated with a particular route. Hence, each route disruption alert can execute
	 *      multiple other alerts.
	 */
	@Override
	public boolean execute(Alert alert) {
		/**
		 * Find other alert that is associated with routeId in this alert.
		 */
		for (String routeId : alert.getTripInformation().getRouteIds()) {
			List<Alert> alertsToBeExecuted = alertRepository.getAlertByRoute(routeId);
			/**
			 * call user module for each and every of these alerts and push the notification.
			 */
		}

		/**
		 * if success
		 */
		return true;
	}
}
