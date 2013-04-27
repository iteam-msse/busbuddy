package edu.umn.msse.busbuddy.alert.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.umn.msse.busbuddy.alert.client.AlertUserClient;
import edu.umn.msse.busbuddy.alert.domain.AlertRepository;
import edu.umn.msse.busbuddy.alert.domain.model.Alert;

/**
 * A concrete implementation of {@link IAlertExecuteStrategy} that handles executing alert related to user's regular
 * schedule.
 */
public class ScheduleAlertExecuteStrategy implements IAlertExecuteStrategy {

	/**
	 * An instance of {@link AlertRepository} that is used to fetch alerts. This is autowired via Spring Framework.
	 */
	@Autowired
	AlertRepository alertRepository;

	/**
	 * A spring autowired instance of {@link AlertUserClient} that can call the User module to get user information.
	 * This is autowired via Spring Framework.
	 */
	@Autowired
	AlertUserClient userClient;

	/**
	 * For each passed in alert, it pushes notification to the user informing about their upcoming trip and routes (as
	 * they have scheduled in the first place)
	 */
	@Override
	public boolean execute(Alert alertModel) {
		// TODO Auto-generated method stub
		return false;
	}

}
