package edu.umn.msse.busbuddy.alert.domain.model;

import java.sql.Date;

/**
 * 
 * This is a model of alert that is to be run one time only. This can be
 * configure by User (e.g., catch bus to Boston at 9am on MM/DD/YYYY) or by any
 * other module (e.g., Route to MSP downtown on MM/DD/YYYY is going to be
 * rerouted). This class extends the {@link Alert}.
 * 
 */
public class OneTimeAlert extends Alert {

	private static final long serialVersionUID = 8851691556082123516L;

	/**
	 * Date when it was executed.
	 */
	private Date dateExecuted;

	/**
	 * @return the dateExecuted
	 */
	public Date getDateExecuted() {
		return dateExecuted;
	}

	/**
	 * @param dateExecuted
	 *            the dateExecuted to set
	 */
	public void setDateExecuted(Date dateExecuted) {
		this.dateExecuted = dateExecuted;
	}

}
