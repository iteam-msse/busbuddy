package edu.umn.msse.busbuddy.alert.domain.model;

import java.io.Serializable;
import java.util.Date;

import edu.umn.msse.busbuddy.alert.domain.AlertFactory;
import edu.umn.msse.busbuddy.alert.domain.AlertRepository;
import edu.umn.msse.busbuddy.alert.enums.AlertNotificationType;
import edu.umn.msse.busbuddy.alert.enums.AlertRunType;
import edu.umn.msse.busbuddy.alert.enums.AlertStatus;

/**
 * 
 * This is a base Alert Model that has most of the common information about an
 * Alert. {@link OneTimeAlert} and {@link RecurringAlert} extends this Alert
 * Model. Alert can only be created from {@link AlertFactory} and then
 * manipulated from {@link AlertRepository}.
 * 
 */
public class Alert implements Serializable {

	private static final long serialVersionUID = -5671884600600864426L;

	/**
	 * A unique identifier for Alert.
	 */
	private String alertGuid;

	/**
	 * A text description about the alert that the user or other modules want to
	 * remember.
	 */
	private String description;

	/**
	 * DateTime that the alert was created.
	 */
	private Date createdDateTime;

	/**
	 * DateTime that the alert should start running.
	 */
	private Date startDateTime;

	/**
	 * DateTime that the alert would expire.
	 */
	private Date expireDateTime;

	/**
	 * current status of the alert. The value depends upon {@link AlertStatus}
	 * enum.
	 */
	private AlertStatus Status;

	/**
	 * Count of error occurrence when the alert was ran.
	 */
	private int errorCount;

	/**
	 * Notification type of alert. Depends upon the value as specified in
	 * {@link AlertNotificationType}
	 */
	private AlertNotificationType alertType;

	/**
	 * Run type of alert e.g., one time or recurring. Value is defined by
	 * {@link AlertRunType}
	 */
	private AlertRunType alertRunType;

	public String getAlertGuid() {
		return alertGuid;
	}

	public void setAlertGuid(String alertGuid) {
		this.alertGuid = alertGuid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getExpireDateTime() {
		return expireDateTime;
	}

	public void setExpireDateTime(Date expireDateTime) {
		this.expireDateTime = expireDateTime;
	}

	public AlertStatus getStatus() {
		return Status;
	}

	public void setStatus(AlertStatus status) {
		Status = status;
	}

	public int getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	public AlertNotificationType getAlertType() {
		return alertType;
	}

	public void setAlertType(AlertNotificationType alertType) {
		this.alertType = alertType;
	}

	public AlertRunType getAlertRunType() {
		return alertRunType;
	}

	public void setAlertRunType(AlertRunType alertRunType) {
		this.alertRunType = alertRunType;
	}

}
