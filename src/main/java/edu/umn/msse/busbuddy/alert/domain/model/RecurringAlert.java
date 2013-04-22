package edu.umn.msse.busbuddy.alert.domain.model;

import java.util.Date;
import java.util.List;

import edu.umn.msse.busbuddy.alert.enums.AlertRecurringType;

/**
 * 
 * This is a model of alert that is to be run multiple times. Depending on User
 * or other modules, the alert will run yearly, monthly, daily in specified hour
 * and minute.
 * 
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
	 * List of {@link RecurringData} that holds the information about when the
	 * alert should actually run.
	 */
	private List<RecurringData> recurringData;

	/**
	 * Parameter to signify the skip count. Valid value is >0 If alert is to
	 * occur every Monday and the repeatEvery is set to 2, then it will repeat
	 * once every 2 week.
	 */
	private int repeatEvery;

	/**
	 * Type of recurring alert. Value is as defined in
	 * {@link AlertRecurringType}
	 */
	private AlertRecurringType alertRecurringType;

	/**
	 * @return the suspendDateTime
	 */
	public Date getSuspendDateTime() {
		return suspendDateTime;
	}

	/**
	 * @param suspendDateTime
	 *            the suspendDateTime to set
	 */
	public void setSuspendDateTime(Date suspendDateTime) {
		this.suspendDateTime = suspendDateTime;
	}

	/**
	 * @return the resumeDateTime
	 */
	public Date getResumeDateTime() {
		return resumeDateTime;
	}

	/**
	 * @param resumeDateTime
	 *            the resumeDateTime to set
	 */
	public void setResumeDateTime(Date resumeDateTime) {
		this.resumeDateTime = resumeDateTime;
	}

	/**
	 * @return the lastSuccessfullyRanOnDateTime
	 */
	public Date getLastSuccessfullyRanOnDateTime() {
		return lastSuccessfullyRanOnDateTime;
	}

	/**
	 * @param lastSuccessfullyRanOnDateTime
	 *            the lastSuccessfullyRanOnDateTime to set
	 */
	public void setLastSuccessfullyRanOnDateTime(
			Date lastSuccessfullyRanOnDateTime) {
		this.lastSuccessfullyRanOnDateTime = lastSuccessfullyRanOnDateTime;
	}

	/**
	 * @return the recurringData
	 */
	public List<RecurringData> getRecurringData() {
		return recurringData;
	}

	/**
	 * @param recurringData
	 *            the recurringData to set
	 */
	public void setRecurringData(List<RecurringData> recurringData) {
		this.recurringData = recurringData;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the repeatEvery
	 */
	public int getRepeatEvery() {
		return repeatEvery;
	}

	/**
	 * @param repeatEvery
	 *            the repeatEvery to set
	 */
	public void setRepeatEvery(int repeatEvery) {
		this.repeatEvery = repeatEvery;
	}

	/**
	 * @return the alertRecurringType
	 */
	public AlertRecurringType getAlertRecurringType() {
		return alertRecurringType;
	}

	/**
	 * @param alertRecurringType
	 *            the alertRecurringType to set
	 */
	public void setAlertRecurringType(AlertRecurringType alertRecurringType) {
		this.alertRecurringType = alertRecurringType;
	}

}
