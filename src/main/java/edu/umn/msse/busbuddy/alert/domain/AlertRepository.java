package edu.umn.msse.busbuddy.alert.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.umn.msse.busbuddy.alert.domain.model.Alert;

/**
 * A Repository that handles the persistent behavior of the {@link Alert} aggregate. It has methods that can alter the
 * lifecycle of the aggregate.
 */
public class AlertRepository {

	/**
	 * This methods take an Alert and saves it to the database.
	 * 
	 * @param alertModel
	 *            {@link Alert} model to be saved
	 * @return The saved object with updated property.
	 */
	public Alert saveAlert(Alert alertModel) {
		/**
		 * Save the alert via Hibernate.
		 */
		return alertModel;
	}

	/**
	 * This method deletes the alert that is being passed.
	 * 
	 * @pre the alertModel being passed at least needs to have an ID defined.
	 * @post the alert will be removed from the system and can no longer be accessed.
	 * @param alertModel
	 *            The {@link Alert} model that is to be deleted.
	 * @return A boolean to indicate whether the delete was success or not.
	 */
	public boolean deleteAlert(Alert alertModel) {

		return true;
	}

	/**
	 * This method is used to update the alert with new information.
	 * 
	 * @pre the alert must exist in the system.
	 * @param alertModel
	 *            A {@link Alert} model that needs to be updated
	 * @return Returns the updated {@link Alert} model back to the method that is calling.
	 */
	public Alert updateAlert(Alert alertModel) {
		return alertModel;
	}

	/**
	 * This method fetches all the alerts that is to be run in next couple of minutes of given date and time. e.g., if
	 * DateTime is NOW and offset is 5 minutes. Then it fetches all the alerts that is to be run in next 5 minutes.
	 * 
	 * @param dateTimeToFetch
	 *            DateTime when the alert is supposed to run.
	 * @param offsetMinute
	 *            An int value that is used to fetch alerts within that minute in future.
	 * @return Returns a list of {@link Alert} models that is to be run in next couple of minutes (offsetMinute) of
	 *         given date time.
	 */
	public List<Alert> getAlertByDateTime(Date dateTimeToFetch, int offsetMinute) {

		return new ArrayList<Alert>();
	}

	/**
	 * This method fetches all the alerts that is linked to the routeId.
	 * 
	 * @param routeId
	 *            The route ID that is being affected.
	 * @return A list of {@link Alert} models.
	 */
	public List<Alert> getAlertByRoute(String routeId) {

		return new ArrayList<Alert>();
	}

	/**
	 * This method fetches all the alerts that is tied to a user.
	 * 
	 * @param userId
	 *            userId that is being affected
	 * @return A list of {@link Alert} models.
	 */
	public List<Alert> getAlertByUserId(String userId) {

		return new ArrayList<Alert>();
	}
}
