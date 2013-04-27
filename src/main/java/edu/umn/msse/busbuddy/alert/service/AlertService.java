package edu.umn.msse.busbuddy.alert.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.umn.msse.busbuddy.alert.controller.model.AlertRequestModel;
import edu.umn.msse.busbuddy.alert.controller.model.AlertResponseModel;
import edu.umn.msse.busbuddy.alert.domain.AlertFactory;
import edu.umn.msse.busbuddy.alert.domain.AlertRepository;
import edu.umn.msse.busbuddy.alert.domain.model.Alert;

/**
 * Alert Service is a base class that is extended by other module specific services. This abstract class defines
 * signature for basic CRUD operation.
 */
public abstract class AlertService {

	/**
	 * {@see AlertExecuteStrategyFactory}. This is autowired via Spring Framework.
	 */
	@Autowired
	protected AlertExecuteStrategyFactory alertExecuteStrategyFactory;

	/**
	 * {@see AlertRepository}. This is autowired via Spring Framework.
	 */
	@Autowired
	protected AlertRepository alertRepository;
	
	/**
	 * {@see AlertFactory}. This is autowired via Spring framework.
	 */
	@Autowired
	protected AlertFactory alertFactory;

	/**
	 * An abstract class that must be implemented by derived classes to create a new alert model.
	 * 
	 * @pre An alertRequest model must be supplied that must have necessary information to create an alert
	 * @param requestModel
	 *            A {@link alert.controller.model.AlertResponseModel} that has necessary information to create a new alert model.
	 * @return Returns an {@link alert.controller.model.AlertResponseModel} that contains information needed by the caller.
	 */
	protected abstract AlertResponseModel createAlert(AlertRequestModel requestModel);

	/**
	 * Takes in an {@link alert.domain.model.Alert} model to persist it into db.
	 * 
	 * @param alertModel
	 *            A valid {@link alert.domain.model.Alert} model
	 * @return An {@link alert.controller.model.AlertResponseModel} that has the success or error message.
	 */
	public AlertResponseModel saveAlert(Alert alertModel) {
		return null;

	}

	/**
	 * Takes in an Alert Model for deletion.
	 * 
	 * @param alertModel
	 *            A valid {@link alert.domain.model.Alert} model
	 * @return An {@link alert.controller.model.AlertResponseModel} that has the success or error message.
	 */
	public AlertResponseModel deleteAlert(Alert alertModel) {
		return null;

	}

	/**
	 * Takes in a final Alert Model that needs to be updated in db.
	 * 
	 * @param alertModel
	 *            A valid {@link alert.domain.model.Alert} model
	 * @return An {@link alert.controller.model.AlertResponseModel} that has the success or error message.
	 */
	protected abstract AlertResponseModel updateAlert(Alert alertModel);

	/**
	 * Finds all the alerts that are initiated by this service and calls {@link AlertExecuteStrategyFactory} to find
	 * appropriate strategy to send each type of alert. 1. Get all the alerts created by this service/module. 2. Loop
	 * through each one of them and call appropriate strategy via StrategyFactory 3. Use execute method in strategy to
	 * push notification
	 * 
	 * @return
	 */
	public abstract boolean sendAlert();

}
