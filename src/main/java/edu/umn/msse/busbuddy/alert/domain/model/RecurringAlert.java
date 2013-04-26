package edu.umn.msse.busbuddy.alert.domain.model;

import java.util.Date;
import java.util.List;

import edu.umn.msse.busbuddy.alert.enums.AlertRecurringType;

/**
 * This is a model of alert that is to be run multiple times. Depending on User or other modules, the alert will run
 * yearly, monthly, daily in specified hour and minute.
 */
public class RecurringAlert extends Alert {

	private static final long serialVersionUID = -475174398668611743L;

	/**
	 * DateTime when the alert is to be suspended temporarily.
	 */
	private Date suspendDateTime;

	/**
	 * DateTime when the alert is to be resumed.
	 */
	private Date resumeDateTime;

	/**
	 * DateTime of last successful run.
	 */
	private Date lastSuccessfullyRanOnDateTime;

	/**
	 * List of {@link RecurringData} that holds the information about when the alert should actually run.
	 */
	private List<RecurringData> recurringData;

	/**
	 * Parameter to signify the skip count. Valid value is >0 If alert is to occur every Monday and the repeatEvery is
	 * set to 2, then it will repeat once every 2 week.
	 */
	private int repeatEvery;

	/**
	 * Type of recurring alert. Value is as defined in {@link AlertRecurringType}
	 */
	private AlertRecurringType alertRecurringType;

	public Date getSuspendDateTime() {
		return suspendDateTime;
	}

	public void setSuspendDateTime(Date suspendDateTime) {
		this.suspendDateTime = suspendDateTime;
	}

	public Date getResumeDateTime() {
		return resumeDateTime;
	}

	public void setResumeDateTime(Date resumeDateTime) {
		this.resumeDateTime = resumeDateTime;
	}

	public Date getLastSuccessfullyRanOnDateTime() {
		return lastSuccessfullyRanOnDateTime;
	}

	public void setLastSuccessfullyRanOnDateTime(Date lastSuccessfullyRanOnDateTime) {
		this.lastSuccessfullyRanOnDateTime = lastSuccessfullyRanOnDateTime;
	}

	public List<RecurringData> getRecurringData() {
		return recurringData;
	}

	public void setRecurringData(List<RecurringData> recurringData) {
		this.recurringData = recurringData;
	}

	public int getRepeatEvery() {
		return repeatEvery;
	}

	public void setRepeatEvery(int repeatEvery) {
		this.repeatEvery = repeatEvery;
	}

	public AlertRecurringType getAlertRecurringType() {
		return alertRecurringType;
	}

	public void setAlertRecurringType(AlertRecurringType alertRecurringType) {
		this.alertRecurringType = alertRecurringType;
	}

}
