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

	// Getter and Setter

	/**
	 * @return the alertGuid
	 */
	public String getAlertGuid() {
		return alertGuid;
	}

	/**
	 * @param alertGuid
	 *            the alertGuid to set
	 */
	public void setAlertGuid(String alertGuid) {
		this.alertGuid = alertGuid;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the createdDateTime
	 */
	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	/**
	 * @param createdDateTime
	 *            the createdDateTime to set
	 */
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	/**
	 * @return the startDateTime
	 */
	public Date getStartDateTime() {
		return startDateTime;
	}

	/**
	 * @param startDateTime
	 *            the startDateTime to set
	 */
	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	/**
	 * @return the expireDateTime
	 */
	public Date getExpireDateTime() {
		return expireDateTime;
	}

	/**
	 * @param expireDateTime
	 *            the expireDateTime to set
	 */
	public void setExpireDateTime(Date expireDateTime) {
		this.expireDateTime = expireDateTime;
	}

	/**
	 * @return the status
	 */
	public AlertStatus getStatus() {
		return Status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(AlertStatus status) {
		Status = status;
	}

	/**
	 * @return the errorCount
	 */
	public int getErrorCount() {
		return errorCount;
	}

	/**
	 * @param errorCount
	 *            the errorCount to set
	 */
	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	/**
	 * @return the alertType
	 */
	public AlertNotificationType getAlertType() {
		return alertType;
	}

	/**
	 * @param alertType
	 *            the alertType to set
	 */
	public void setAlertType(AlertNotificationType alertType) {
		this.alertType = alertType;
	}

	/**
	 * @return the alertRunType
	 */
	public AlertRunType getAlertRunType() {
		return alertRunType;
	}

	/**
	 * @param alertRunType
	 *            the alertRunType to set
	 */
	public void setAlertRunType(AlertRunType alertRunType) {
		this.alertRunType = alertRunType;
	}

}
