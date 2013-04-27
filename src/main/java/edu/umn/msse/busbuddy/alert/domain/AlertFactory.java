package edu.umn.msse.busbuddy.alert.domain;

import edu.umn.msse.busbuddy.alert.domain.model.Alert;
import edu.umn.msse.busbuddy.alert.domain.model.OneTimeAlert;
import edu.umn.msse.busbuddy.alert.domain.model.RecurringAlert;
import edu.umn.msse.busbuddy.alert.domain.model.RecurringData;
import edu.umn.msse.busbuddy.alert.enums.AlertRecurringType;
import edu.umn.msse.busbuddy.alert.enums.AlertRunType;
import edu.umn.msse.busbuddy.alert.enums.AlertStatus;

/**
 * An alert factory that can create different types of semi-populated alert models depending upon the information. Any
 * additional create method can be created during implementation phase.
 */
public class AlertFactory {

	/**
	 * Creates an alert model depending upon the run Type.
	 * 
	 * @param runType
	 *            {@link alert.enums.AlertRunType} enum.
	 * @return Either a Onetime or Recurring alert Model.
	 */
	public Alert createAlert(AlertRunType runType) {
		Alert alertModel = new Alert();

		if (runType == AlertRunType.Onetime) {
			alertModel = new OneTimeAlert();
			alertModel.setAlertRunType(runType);
			alertModel.setStatus(AlertStatus.Active);
		} else if (runType == AlertRunType.Recurring) {
			alertModel = new RecurringAlert();
			alertModel.setAlertRunType(runType);
			alertModel.setStatus(AlertStatus.Active);
		}
		return alertModel;
	}

	/**
	 * Created alert model depending upon the recurringType
	 * 
	 * @param recurringType
	 *            {@link alert.enums.AlertRecurringType} enum
	 * @return A recurring alert Model
	 */
	public Alert createAlert(AlertRecurringType recurringType) {
		Alert alertModel = new RecurringAlert();

		// TODO depending upon the recurring Type make appropraite model

		return alertModel;
	}
}
